package org.book.service.impl;

import org.book.bean.UserBean;
import org.book.dao.IUserDao;
import org.book.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午11:26
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;


    /**
     * 登录
     *
     * @param ub
     * @return
     */
    @Override
    public boolean login(UserBean ub) {
        UserBean userBean=userDao.queryByName(ub.getUserName());
        if(userBean!=null){
            if(userBean.getUserPwd().equals(ub.getUserPwd())){
                return true;
            }
        }
        return false;
    }
}
