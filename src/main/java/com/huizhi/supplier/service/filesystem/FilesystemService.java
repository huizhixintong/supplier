package com.huizhi.supplier.service.filesystem;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Title: UploadService
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/29 0029 15:17
 */
public interface FilesystemService {


    String findFileUrl(Integer companyId);

    String uploadFile(Integer companyId, MultipartFile multipartFile);


}
