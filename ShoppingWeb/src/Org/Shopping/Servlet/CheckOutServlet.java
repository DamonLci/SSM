package Org.Shopping.Servlet;

import Org.Shopping.Model.UserModel;
import Org.Shopping.Service.CheckOutService;
import Org.Shopping.Tools.Mark;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/User/CheckOut")
public class CheckOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        UserModel user = (UserModel) session.getAttribute(Mark.USER);
        int userid=user.getUid();
        String res=new CheckOutService().checkOut(userid);
        ObjectMapper om=new ObjectMapper();
        om.writeValue(resp.getOutputStream(),res);
    }
}
