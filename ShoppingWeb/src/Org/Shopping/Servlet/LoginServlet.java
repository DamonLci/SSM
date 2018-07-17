package Org.Shopping.Servlet;

import Org.Shopping.Dao.UserDao;
import Org.Shopping.Model.UserModel;
import Org.Shopping.Service.LoginService;
import Org.Shopping.Tools.C3p0Utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.jvm.hotspot.oops.Mark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String pass = req.getParameter("pass");
        String code = req.getParameter("code");
        UserModel um=new UserDao().queryByCount(account);
        req.setAttribute("um",um);
        //创建DAO对象，操作数据库
        Object orealCode = req.getSession().getAttribute("randCheckCode");
        //创建
        // Service进行逻辑处理
        String result = null;
        try {
            result = new LoginService().loginCheck(account, pass, code, orealCode);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //System.out.println(result);
        if (result.equals("登录成功！")) {
            req.getSession().setAttribute(Org.Shopping.Tools.Mark.USER, um);
        }
        ObjectMapper om = new ObjectMapper();
        om.writeValue(resp.getOutputStream(), result);

    }
}
