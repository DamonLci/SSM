package org.bms.util;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName FileUploadUtil
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/17 上午10:10
 * @Version 1.0
 **/
public class FileUploadUtil {
    private File uploadImage;
    private String uploadImageContentType;
    private String uploadImageFileName;

    public void FileUpload() {
        ServletContext context = ServletActionContext.getServletContext();
        System.out.println(uploadImageFileName);
        String path = context.getRealPath("/upload");
        File file = new File(path);
        try {
            uploadImageFileName=changeFileName(uploadImageFileName);
            FileUtils.copyFile(uploadImage, new File(file, uploadImageFileName));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String changeFileName(String uploadImageFileName){
        String newName=UUID.randomUUID()+uploadImageFileName;
        return newName;
    }
    public File getUploadImage() {
        return uploadImage;
    }

    public void setUploadImage(File uploadImage) {
        this.uploadImage = uploadImage;
    }

    public String getUploadImageContentType() {
        return uploadImageContentType;
    }

    public void setUploadImageContentType(String uploadImageContentType) {
        this.uploadImageContentType = uploadImageContentType;
    }

    public String getUploadImageFileName() {
        return uploadImageFileName;
    }

    public void setUploadImageFileName(String uploadImageFileName) {
        this.uploadImageFileName = uploadImageFileName;
    }
}
