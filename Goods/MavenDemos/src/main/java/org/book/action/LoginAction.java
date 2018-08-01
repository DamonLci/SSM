package org.book.action;

import org.book.bean.UserBean;
import org.book.service.IUserService;
import org.book.service.impl.UserServiceImpl;
import org.book.util.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午5:25
 * @Version 1.0
 **/
@Controller
public class LoginAction {
    @Autowired
    private IUserService userService;
    @RequestMapping("/login.action")
    public ModelAndView login(UserBean ub, HttpServletRequest req){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session=req.getSession();
        boolean flag=userService.login(ub);
        if(flag==true){
            modelAndView.setViewName("success.jsp");
            session.setAttribute(Mark.USER, ub);
        }
        else{
            modelAndView.setViewName("error.jsp");
        }
        return modelAndView;
    }
}
