package Org.Shopping.Tools;




import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    private final String subject;
    private final String to;
    private final String neirong;


    public SendMail(String t,String subt,String nr)
    {
        subject=subt;
        to=t;
        neirong=nr;
    }


    public void send()
    {
        String host="smtp.126.com";
        int port=25;
        String mail="Tstory9@126.com";
        String pass="xhmj4yt123";
        Properties props = new Properties();
        //设置邮件服务器地址，连接超时时限等信息
        props.put("mail.smtp.host","smtp.126.com");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.connectiontimeout","10000");
        props.put("mail.smtp.timeout","10000");
        props.put("mail.transport.protocol", "smtp");

        //创建缺省的session对象
        Session session = Session.getDefaultInstance(props, null);

        //创建message对象
        Message msg = new MimeMessage(session);
        session.setDebug(true);


        //设置发件人和收件人
        try{//szteapot@163.com paul5198
            InternetAddress addressFrom = new InternetAddress("Tstory9@126.com");
            msg.setFrom(addressFrom);
            InternetAddress addressTo = new InternetAddress(to);

            msg.setRecipient(Message.RecipientType.TO,addressTo);

            //设置邮件标题，中文编码
            //subject = MimeUtility.encodeText(new String(subject.getBytes(), "GB2312"), "GB2312", "B");
            msg.setSubject(subject);
            msg.setText(neirong);
            Transport transport=session.getTransport("smtp");
            transport.connect(host,port,mail,pass);
            transport.sendMessage(msg,msg.getAllRecipients());
            transport.close();

        }catch(Exception e)
        {
            System.out.print(e);
        }

    }

    public   static   void   main(String[]   args)throws   Exception{
        new  SendMail("864150496@qq.com","标题","内容").send();
    }

}