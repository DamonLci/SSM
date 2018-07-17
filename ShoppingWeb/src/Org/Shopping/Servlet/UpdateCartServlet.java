package Org.Shopping.Servlet;

import Org.Shopping.Model.UserModel;
import Org.Shopping.Service.CartService;
import Org.Shopping.Tools.Mark;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/User/Update")
public class UpdateCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        UserModel user = (UserModel) session.getAttribute(Mark.USER);
        int gid = Integer.parseInt(req.getParameter("goodid"));
        int res = new CartService().UpdateCart(gid, user.getUid());
        ObjectMapper om = new ObjectMapper();
        om.writeValue(resp.getOutputStream(), res);
    }
}
