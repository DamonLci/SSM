package org.book.dao;

import org.book.bean.UserBean;

/**
 * @ClassName IUserDao
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午9:06
 * @Version 1.0
 **/
public interface IUserDao {
    /**
     * 通过用户名查询，进行登录
     * @param userName
     * @return
     */
    public UserBean queryByName(String userName);
}
