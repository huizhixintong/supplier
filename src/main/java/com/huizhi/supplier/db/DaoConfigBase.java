package com.huizhi.supplier.db;


import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Slf4j
@Data
public abstract class DaoConfigBase {

    private String[] mapperLocations;

    private DruidDataSource dataSource;

    private DataSourceTransactionManager transactionManager;

    private SqlSessionFactory sqlSessionFactory;

    public DaoConfigBase(String... mapperLocations) {
        this.mapperLocations = mapperLocations;
    }

    public abstract String getUsername();

    public abstract String getPassword();

    public abstract String getUrl();

    // @PostConstruct
    public  void init() {
        try {
            
            log.info("Init datasource: url: {}", getUrl());
            dataSource = new DruidDataSource();
            dataSource.setDriverClassName("org.postgresql.Driver");
            dataSource.setUrl(getUrl());
            dataSource.setUsername(getUsername());
            dataSource.setPassword(getPassword());
            dataSource.setTestWhileIdle(true);
            dataSource.setTestOnReturn(false);
            dataSource.init();

            transactionManager = new DataSourceTransactionManager();
            transactionManager.setDataSource(dataSource);
            log.info("Init done");
        } catch (Throwable t) {
            log.error("Init error", t);
        }
    }

    //@PreDestroy
    public void destroy() {
        try {
            log.info("Close {}", getUrl());
            dataSource.close();
            log.info("Close {} done", getUrl());
        } catch (Throwable t) {
            log.error("Destroy error", t);
        }
    }

    public DataSource dataSource() throws SQLException {
        return dataSource;
    }

    @Autowired
    private ResourcePatternResolver resourceResolver;

    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        if (sqlSessionFactory == null) {
            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
            Configuration config = new Configuration();
//            config.setMapUnderscoreToCamelCase(true);
//            config.setUseActualParamName(false);
            sqlSessionFactoryBean.setConfiguration(config);
            sqlSessionFactoryBean.setDataSource(dataSource());
            List<Resource> resources = new ArrayList<Resource>();
            if (this.mapperLocations != null) {
                for (String mapperLocation : this.mapperLocations) {
                    try {
                        Resource[] mappers = resourceResolver.getResources(mapperLocation);
                        resources.addAll(Arrays.asList(mappers));
                    } catch (IOException e) {
                        log.error("IOException", e);
                        // ignore
                    }
                }
            }
            Resource[] arr = resources.toArray(new Resource[resources.size()]);
            sqlSessionFactoryBean.setMapperLocations(arr);
            sqlSessionFactory = sqlSessionFactoryBean.getObject();
        }
        return sqlSessionFactory;
    }

    public DataSourceTransactionManager transactionManager() {
        return transactionManager;
    }

    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(this.dataSource);
    }

}
