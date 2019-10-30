package com.huizhi.supplier.util;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.domain.fdfs.ThumbImageConfig;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Title: FastdfsClientUtil
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/29 0029 15:41
 */
@Component
public class FastdfsClientUtil {
    private final Logger logger = LoggerFactory.getLogger(FastdfsClientUtil.class);

    @Autowired
    private FastFileStorageClient storageClient;

    @Autowired
    private ThumbImageConfig thumbImageConfig;

    //上传文件

    public String upload(MultipartFile multipartFilefile) throws IOException{
        //文件名
        String originalFilename  = multipartFilefile.getOriginalFilename();
        System.out.println(originalFilename);

        //扩展名
        String sufix = originalFilename.lastIndexOf(".") > 0? originalFilename.substring(originalFilename.lastIndexOf(".")+1,originalFilename.length()) : "";

        StorePath storePath = this.storageClient.uploadFile(
                multipartFilefile.getInputStream(), multipartFilefile.getSize(), FilenameUtils.getExtension(originalFilename), null);

        return storePath.getFullPath();
    }


}
