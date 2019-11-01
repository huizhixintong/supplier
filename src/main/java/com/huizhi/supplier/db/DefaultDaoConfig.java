package com.huizhi.supplier.db;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import java.sql.SQLException;

@Slf4j
@Configuration
//@ConfigurationProperties("default.datasource")
@MapperScan(basePackages = "com.huizhi.supplier.db.dao",
        annotationClass = MybatisUserInfo.class,
        sqlSessionFactoryRef = DefaultDaoConfig.SQL_SESSION_FACTORY_NAME)
public class DefaultDaoConfig extends DaoConfigBase {

    public static final String SQL_SESSION_FACTORY_NAME = "sqlSessionFactory";

    @NotNull
    @Value("${db.mysql.supplier.username}")
    private String username;
    @Value("${db.mysql.supplier.password}")
    private String password;

    @Value("jdbc:mysql://${db.mysql.supplier.host}:${db.mysql.supplier.port}/${db.mysql.supplier.database}?useUnicode=true&characterEncoding=utf-8")
    private String url;

    public DefaultDaoConfig() {
        super("classpath:/com/huizhi/supplier/db/dao/*Mapper.xml");
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    @Bean(name = "dataSource")
    public DataSource dataSource() throws SQLException {
        return super.dataSource();
    }

    @Override
    @Bean(name = SQL_SESSION_FACTORY_NAME)
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        return super.sqlSessionFactoryBean();
    }

    @Override
    @Bean("txManager")
    public DataSourceTransactionManager transactionManager() {
        return super.transactionManager();
    }

    @Override
    @Bean("supplierJdbcTemplate")
    public JdbcTemplate jdbcTemplate() {
        return super.jdbcTemplate();
    }

    @PostConstruct
    @Override
    public void init() {
        super.init();
    }

    @PreDestroy
    @Override
    public void destroy() {
        super.destroy();
    }
}