package org.bms.service.serviceImp;

import org.bms.bean.UserBean;
import org.bms.dao.UserDao;
import org.bms.dao.daoImp.UserDaoImp;
import org.bms.service.IUserService;

public class IUserServiceImp implements IUserService {
    private UserDao ud=new UserDaoImp();
    @Override
    public void login(UserBean userBean) {
        ud.findByFiled(userBean);
    }

    @Override
    public boolean checkLogin(String name) {
        UserBean ub=ud.findByName(name);
        if(ub!=null){
            return true;
        }
        return false;
    }

    @Override
    public void register(UserBean userBean) {
        UserBean ub=ud.findByName(userBean.getUserName());
        if (ub != null) {

        }
    }
}
