package com.huizhi.supplier.service.filesystem.impl;

import com.huizhi.supplier.db.dao.TFileInfoMapper;
import com.huizhi.supplier.db.model.TFileInfo;
import com.huizhi.supplier.service.filesystem.FilesystemService;
import com.huizhi.supplier.util.FastdfsClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.naming.ldap.PagedResultsControl;
import java.io.IOException;

/**
 * @Title: FilesystemServiceImpl
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/30 0030 9:52
 */
@Service
public class FilesystemServiceImpl implements FilesystemService {


    @Autowired
    private TFileInfoMapper fileInfoMapper;

    @Override
    public String findFileUrl(Integer companyId) {
        return null;
    }

    @Override
    public int uploadFile(TFileInfo fileInfo) {

        return fileInfoMapper.insert(fileInfo);
    }
}












