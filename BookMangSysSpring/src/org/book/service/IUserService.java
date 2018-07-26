package org.book.service;

import org.book.bean.UserBean;

/**
 * @ClassName IUserService
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午11:26
 * @Version 1.0
 **/
public interface IUserService {
    /**
     * 登录
     * @param ub
     * @return
     */
    public boolean login(UserBean ub);
}
