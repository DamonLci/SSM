package Org.Shopping.Servlet;

import Org.Shopping.Service.RegisterService;
import Org.Shopping.Tools.MD5_Encoding;
import Org.Shopping.Tools.SendMail;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account=req.getParameter("account");
        String pass=req.getParameter("pass");
        String repass=req.getParameter("repass");
        String code = req.getParameter("code");
        //创建DAO对象，操作数据库
        Object orealCode = req.getSession().getAttribute("randCheckCode");
        System.out.println(account);
        System.out.println(pass);
        System.out.println(repass);
        String res=new RegisterService().insertJudege(account,pass,repass,code,orealCode);
        ObjectMapper om = new ObjectMapper();
        om.writeValue(resp.getOutputStream(), res);

        A:
        for(){
            for(){
                break A;
            }
        }
    }
}
