package org.home.Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {


    //2.流操作，获取out流
    public static void main(String[] args)  {


    }
    public void ClientDem() throws IOException{
        //tcp数据发送，套接字（socket）
        //目标ip
        String aimIP = "192.16.10.120";
        int aimPort = 554;
        //1.创建一个客户端套接字，将目标ip及端口号通过构造函数传进去
        Socket clientSocket;
        clientSocket = new Socket(aimIP, aimPort);
        OutputStream os = clientSocket.getOutputStream();
        //3.准备输出数据内容
        String content = "Hello";
        //4.发送数据
        os.write(content.getBytes());
        //5.释放资源，关闭流
        os.close();
        clientSocket.close();
    }

}
