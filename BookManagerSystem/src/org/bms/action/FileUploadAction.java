package org.bms.action;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName FileUploadAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/16 下午2:15
 * @Version 1.0
 **/
public class FileUploadAction {
    private File uploadImage;
    private String uploadImageContentType;
    private String uploadImageFileName;

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

    public String execute(){
        //将文件对象保存到服务器里面
        //动态获取到服务器上面文件的物理路径 上下文对象ServletContext
        //ServletContext代表项目的运行环境，项目的环境
        //可以通过上下文对象获取项目中的任何一个文件
        ServletContext context=ServletActionContext.getServletContext();
        HttpServletRequest request=ServletActionContext.getRequest();
        System.out.println(uploadImageFileName);
        System.out.println(uploadImage);
        System.out.println(uploadImageContentType);
        String path=context.getRealPath("/upload");
        System.out.println(path);
        File file=new File(path);
        try {
            FileUtils.copyFile(uploadImage, new File(file,changeFileName(uploadImageFileName)));
        } catch (IOException e)  {
            e.printStackTrace();
        }
        return "success";

    }
    public String changeFileName(String uploadImageFileName){
        String newName=UUID.randomUUID()+uploadImageFileName;
        return newName;
    }
}
