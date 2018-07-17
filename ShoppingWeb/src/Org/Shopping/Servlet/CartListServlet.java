package Org.Shopping.Servlet;

import Org.Shopping.Model.UserModel;
import Org.Shopping.Model.ViewCartPo;
import Org.Shopping.Service.CartListService;
import Org.Shopping.Tools.Mark;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/User/CartList")
public class CartListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ViewCartPo> viewCartPos=new ArrayList<ViewCartPo>();
        HttpSession session = req.getSession();
        UserModel user = (UserModel) session.getAttribute(Mark.USER);
        //System.out.println(user.getUid());
        viewCartPos=new CartListService().queryList(user.getUid());
        ObjectMapper om=new ObjectMapper();
        om.writeValue(resp.getOutputStream(),viewCartPos);
    }
}
