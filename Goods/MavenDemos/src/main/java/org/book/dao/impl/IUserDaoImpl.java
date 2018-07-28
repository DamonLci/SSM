package org.book.dao.impl;

import org.book.bean.UserBean;
import org.book.dao.IUserDao;
import org.book.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @ClassName IUserDaoImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/25 上午11:26
 * @Version 1.0
 **/
@Repository
public class IUserDaoImpl implements IUserDao {
    @Autowired
    private SessionFactory fa;



    /**
     * 通过用户名查询，进行登录
     *
     * @param userName
     * @return
     */
    @Override
    public UserBean queryByName(String userName) {
        Session session=fa.openSession();
        Query query=session.createQuery("from UserBean where u_name =?");
        query.setString(0,userName);
        UserBean userBean= (UserBean) query.uniqueResult();
        //System.out.println(userBean);

        return userBean;
    }
    @Test
    public void test(){
        UserBean userBean=queryByName("tom");
        System.out.println(userBean);
    }
}
