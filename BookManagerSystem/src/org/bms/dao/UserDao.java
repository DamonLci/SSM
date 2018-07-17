package org.bms.dao;

import org.bms.bean.UserBean;

public interface UserDao {
    //注册
    public void insert(UserBean userBean);
    //查询
    public UserBean queryByName(String username);


}
