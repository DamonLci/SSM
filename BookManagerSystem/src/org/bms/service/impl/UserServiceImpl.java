package org.bms.service.impl;

import org.bms.bean.UserBean;
import org.bms.dao.UserDao;
import org.bms.dao.impl.UserDaoImpl;
import org.bms.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String UserLogin(String username,String pass) {
        String res="fail";
        if(username==null || pass==null){
            res="fail";
        }
        UserDao ud=new UserDaoImpl();
        UserBean userBean=ud.queryByName(username);
        if(userBean!=null){
            if(userBean.getUserPwd().equals(pass)){
                res="success";
                return res;
            }
            res="fail";
            return res;
        }
        return res;
    }
}
