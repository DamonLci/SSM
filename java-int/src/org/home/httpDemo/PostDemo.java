package org.home.httpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PostDemo {
    public static void main(String[] args) {
        //URL
        String URLStr="http://localhost/Agileone_1.2/index.php/common/login";
        //封装URL对象
        HttpURLConnection con = null;
        OutputStream os=null;
        InputStream is=null;
        try {
            URL url = new URL(URLStr);
            //获取Http连接对象
            con = (HttpURLConnection) url.openConnection();
            //设置请求参数
            //请求方式
            con.setRequestMethod("POST");
            //设置Cookie
            con.setRequestProperty("Cookie", "PHPSESSID=b162f8a451f3058fc8f978e6a7fcd379");
            //开启Output流
            con.setDoOutput(true);
            //建立连接
            con.connect();
            //获取输出流，向服务器输出内容
            os=con.getOutputStream();
            //定义请求正文
            String requestContent="username=admin121&password=admin&savelogin=true";
            //发送数据
            os.write(requestContent.getBytes());
            //获取服务器响应内容
            //获取输入流
            is=con.getInputStream();
            //读取服务器响应数据
            byte[] content = new byte[1024];
            int len=0;
            while((len=is.read(content)) != -1){
                System.out.print(new String(content,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally{
                    if(os != null) {
                        try {
                            os.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }finally{
                            con.disconnect();
                        }
                    }
                }
            }
        }
    }
}
