package Org.Shopping.Servlet;

import Org.Shopping.Dao.CartDao;
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

@WebServlet("/User/addCart")
public class AddCartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserModel user = (UserModel) session.getAttribute(Mark.USER);


        int gid = Integer.parseInt(request.getParameter("goodid"));
        //System.out.println("1"+gid);
        //int amount = new CartService().queryByid(user.getUid(), gid);
        String res = new CartService().addCart(gid, user.getUid());

        ObjectMapper om = new ObjectMapper();
        om.writeValue(response.getOutputStream(), res);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
