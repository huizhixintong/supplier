package com.huizhi.filesystem;

import com.huizhi.supplier.SupplierApplication;
import com.huizhi.supplier.util.FastdfsClientUtil;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Title: FdfsTest
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/29 0029 16:06
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SupplierApplication.class)
public class FdfsTest {

    @Autowired

    private FastdfsClientUtil fastdfsClientUtil;

    @Test
    public void testUpload() throws Exception {

        File file = new File("D:\\123.jpg");


        FileInputStream input = new FileInputStream(file);

        MultipartFile multipartFile = new MockMultipartFile("file", file.getName(), "text/plain", IOUtils.toByteArray(input));


        try {
            String upload = fastdfsClientUtil.upload(multipartFile);
            System.out.print(upload);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
