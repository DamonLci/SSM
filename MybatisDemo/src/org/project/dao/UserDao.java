package org.project.dao;

import org.project.bean.UserBean;

import java.util.List;

public interface UserDao {
    public void insertUser(UserBean userBean);
    public void select(int id);
    public List<UserBean> queryAll();

}
