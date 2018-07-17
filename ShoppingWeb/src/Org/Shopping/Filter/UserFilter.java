package Org.Shopping.Filter;

import Org.Shopping.Model.UserModel;
import Org.Shopping.Tools.Mark;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "UserFilter"
,urlPatterns = "/User/*")
public class UserFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request=(HttpServletRequest)req;
        HttpServletResponse response=(HttpServletResponse)resp;
        HttpSession session=request.getSession();
        //UserModel user=(UserModel)session.getAttribute(Mark.USER);
        UserModel user=(UserModel) session.getAttribute(Mark.USER);
        //System.out.println(c);
        //System.out.println(user);
        if(user!=null){
            chain.doFilter(req, resp);

        }else{
            System.out.println("1");
            PrintWriter ot=response.getWriter();
            ot.print("<script type=''text/javascript>alert('please login first!');window.location.href='../login.jsp';</script>");
        }


    }


    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
