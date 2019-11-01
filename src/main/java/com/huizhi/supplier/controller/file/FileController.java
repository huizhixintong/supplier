package com.huizhi.supplier.controller.file;

import com.huizhi.supplier.db.model.TFileInfo;
import com.huizhi.supplier.service.filesystem.FilesystemService;
import com.huizhi.supplier.util.FastdfsClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @Title: FileController
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/31 0031 11:05
 */
@RestController
@RequestMapping(value = "/file/")
public class FileController {

    @Autowired
    private FilesystemService filesystemService;

    @Autowired
    private FastdfsClientUtil fastdfsClientUtil;

    @RequestMapping(value = "uploadlist")
    public boolean uploadList(@RequestBody List<TFileInfo> fileInfos) {



        return false;
    }


    @RequestMapping(value = "upload")
    public String upload(@RequestBody TFileInfo fileInfo, MultipartFile file){

        Integer companyId = fileInfo.getCompanyId();

        String upload = "";

        if(companyId == null || companyId == 0){
            return upload;
        }
        if(file == null){
            return upload;
        }
        try {
            upload = fastdfsClientUtil.upload(file);

            fileInfo.setFileUrl(upload);
            int i = filesystemService.uploadFile(fileInfo);
            if(i != 1){
                return "";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return upload;
    }

}
