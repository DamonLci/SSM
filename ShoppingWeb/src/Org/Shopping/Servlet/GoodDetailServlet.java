package Org.Shopping.Servlet;

import Org.Shopping.Model.GoodsPo;
import Org.Shopping.Service.GoodDetailService;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/goodDetail")
public class GoodDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=1;
        try{
        id= Integer.parseInt(req.getParameter("goodid"));
        }catch (Exception e){
        }
        GoodsPo gp=new GoodDetailService().queryById(id);
        ObjectMapper om=new ObjectMapper();
        om.writeValue(resp.getOutputStream(),gp);
    }
}
