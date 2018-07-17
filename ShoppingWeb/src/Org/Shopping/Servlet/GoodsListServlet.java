package Org.Shopping.Servlet;

import Org.Shopping.Model.GoodsPo;
import Org.Shopping.Service.ShowGoodsByPageService;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@WebServlet("/goodList")
public class GoodsListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page=req.getParameter("page");
        ShowGoodsByPageService serivce = new ShowGoodsByPageService();
        List<GoodsPo> goodsPos=serivce.showGoods(page);
        int totalPage=serivce.findTotalPage();
        Map<String ,Object> res=new HashMap<String,Object>();
        res.put("currentPage",page);
        res.put("goods",goodsPos);
        res.put("totalPage",totalPage);
        ObjectMapper om=new ObjectMapper();
        om.writeValue(resp.getOutputStream(),res);
    }
}
