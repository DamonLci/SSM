package org.bms.dao.daoImp;

import org.apache.ibatis.session.SqlSession;
import org.bms.bean.UserBean;
import org.bms.dao.UserDao;
import org.bms.utils.MybatisUtils;

public class UserDaoImp implements UserDao {
    @Override
    public void findByFiled(UserBean bean) {
        SqlSession session=MybatisUtils.getSession();
    }

    @Override
    public UserBean findByName(String name) {
        SqlSession session=MybatisUtils.getSession();
        //session.selectOne();
        return null;
    }
}
