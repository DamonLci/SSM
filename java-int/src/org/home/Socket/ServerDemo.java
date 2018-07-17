package org.home.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) {
        // 服务器ServerSocket
        // 数据包目标端口
        int serverPort = 554;
        // 服务器套接字
        ServerSocket serverSocket = null;
        InputStream is = null;
        Socket clientSocket = null;
        try {
            serverSocket = new ServerSocket(serverPort);
            // 接收数据 accept()阻塞方法 当有数据包发送过来，会将数据包相关信息封装成一个socket对象，然后结束阻塞
            clientSocket = serverSocket.accept();
            // 操作流 获取输入流
            is = clientSocket.getInputStream();
            // 读取数据
            byte[] content = new byte[1024];
            int len = 0;
            while ((len = is.read(content)) != -1) {
                System.out.println(new String(content, 0, len, "utf-8"));
            }
            if(content!=null){

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (clientSocket != null) {
                        try {
                            clientSocket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            if (serverSocket != null) {
                                try {
                                    serverSocket.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
