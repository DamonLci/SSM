package org.book.service.impl;

import org.book.bean.UserBean;
import org.book.dao.IUserDao;
import org.book.dao.impl.IUserDaoImpl;
import org.book.service.IUserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午11:26
 * @Version 1.0
 **/
public class UserServiceImpl implements IUserService {
    private IUserDao userDao=new IUserDaoImpl();
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
