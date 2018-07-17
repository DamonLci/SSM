package org.bms.action;

import com.opensymphony.xwork2.ModelDriven;
import org.bms.bean.UserBean;
import org.bms.service.UserService;
import org.bms.service.impl.UserServiceImpl;

public class UserAction implements ModelDriven {
    private UserBean userBean;

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    @Override
    public Object getModel() {
        // TODO Auto-generated method stub
        if(userBean!=null){
            userBean=new UserBean();
        }
        return userBean;
    }
    public String  execute(){
        UserService userService=new UserServiceImpl();
        //System.out.println(userBean);
        //System.out.println(userBean.getUserName());
        String res=userService.UserLogin(userBean.getUserName(),userBean.getUserPwd());
        return res;
    }
}
