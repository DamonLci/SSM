package org.bms.service;

import org.bms.bean.UserBean;

public interface IUserService {
    public void login(UserBean userBean);
    public boolean checkLogin(String name);
    public void register(UserBean userBean);
}
