package org.bms.dao;

import org.bms.bean.UserBean;

public interface UserDao  {
    public void findByFiled(UserBean bean);
    public UserBean findByName(String name);
}
