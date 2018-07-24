package org.book.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName LoginAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午5:25
 * @Version 1.0
 **/
@Controller
public class LoginAction {
    @RequestMapping("/login.action")
    public String login(HttpServletRequest req){
        System.out.println("test");
        String name=req.getParameter("name");
        req.setAttribute("name",name);
        return "index.jsp";
    }
}
