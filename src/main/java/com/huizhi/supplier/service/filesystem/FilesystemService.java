package com.huizhi.supplier.service.filesystem;

import com.huizhi.supplier.db.model.TFileInfo;
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

    int uploadFile(TFileInfo fileInfo);


}
