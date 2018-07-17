package org.home.StreamPut;

import java.io.*;

public class StreamTest {
    /**
     * 按数据处理单位分为字符流和字节流
     * 1.字节流中分为InputStream和OutputStream的类，InputStream 和OutputStream,两个是为字节流设计的,主要用来处理字节或二进制对象,
     * 2. Reader和 Writer.两个是为字符流（一个字符占两个字节）设计的,主要用来处理字符或字符串.
     * /Users/mac/Documents/GitHub/SSM/java-int
     */

    //字符流写入
    public static void main(String[] args) throws IOException {
        StreamTest st = new StreamTest();
        //st.StreTest();
        //st.ReadStream();
    }
    //字符流写入
    public void StreTest() throws IOException{
        File f = new File("/Users/mac/Desktop/1.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        Writer out=new FileWriter(f,true);
        String s="word hand";
        out.write(s);
        out.close();
        System.out.println("成功");
    }
    //字符流读取
    public void ReadStream() throws IOException{
        File f=new File("/Users/mac/Desktop/1.txt");
        if(!f.exists()){
            System.out.println("文件不存在");
        }
        Reader input=new FileReader(f);
        char [] c=new char [(int) f.length()];
        int len=input.read(c);
        input.close();
        System.out.println(new String(c,0,len));
    }
    //字节流写入
    public void WriteStea() throws IOException{
        File f=new File("/Users/mac/Desktop/1.txt");
        InputStream input=new FileInputStream(f);
        byte []  b=new byte[(int)f.length()];
        input.read(b);
        input.close();
        System.out.println(new String(b));
    }
    //字节流读取
    public void ReadStrea() throws IOException{
        File f=new File("/Users/mac/Desktop/1.txt");
        OutputStream out=new FileOutputStream(f,true);
        String c="word hand";
        byte [] s= c.getBytes();
        for(int i=0;i<s.length;i++){
            out.write(s);
        }
        out.close();
    }
}
