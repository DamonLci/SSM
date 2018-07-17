package Org.Shopping.Servlet;

import Org.Shopping.Service.ModifyPassService;
import Org.Shopping.Tools.Mark;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/modifyPass")
public class ModifyPassServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String account = (String) session.getAttribute(Mark.USER);
        System.out.println(account);
        String pass = req.getParameter("pass");
        String newpass = req.getParameter("newpass");
        String confnewpass = req.getParameter("confnewpass");
        String code = req.getParameter("code");
        Object orealCode = req.getSession().getAttribute("randCheckCode");
        System.out.println(pass);
        System.out.println(newpass);
        System.out.println(confnewpass);
        session.invalidate();
        ObjectMapper om = new ObjectMapper();
        String re = new ModifyPassService().ModifyPass(account, pass, newpass, confnewpass,orealCode,code);
        om.writeValue(resp.getOutputStream(), re);
    }
}
