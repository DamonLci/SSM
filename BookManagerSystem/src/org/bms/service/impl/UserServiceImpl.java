package org.bms.service.impl;

import org.bms.bean.UserBean;
import org.bms.dao.IUserDao;
import org.bms.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String UserLogin(String username,String pass) {
        String res="fail";
        if(username==null || pass==null){
            res="fail";
        }
        UserBean userBean=userDao.queryByName(username);
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
