package org.bms.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.bms.bean.UserBean;
import org.bms.dao.UserDao;
import org.bms.util.MybatisUtil;

public class UserDaoImpl implements UserDao {
    @Override
    public void insert(UserBean userBean) {
        SqlSession session = MybatisUtil.getsession(true);
        try {
            session.insert("UserDao.insert", userBean);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    @Override
    public UserBean queryByName(String username) {
        UserBean userBean = null;
        SqlSession session=MybatisUtil.getsession();
        try{
            userBean=session.selectOne("UserDao.findByName",username);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return userBean;
    }
}
