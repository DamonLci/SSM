package org.bms.action;

import org.bms.bean.UserBean;
import org.bms.service.IUserService;
import org.bms.service.impl.UserServiceImpl;

public class UserAction  {
    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    private UserBean userBean;

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }


    public String  execute(){
        String res= userService.UserLogin(userBean.getUserName(),userBean.getUserPwd());
        return res;
    }
}
