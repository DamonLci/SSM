package org.project.daoimp;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.project.bean.UserBean;
import org.project.dao.UserDao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoImp implements UserDao {
    private String resource = "config.xml";
    InputStream inputStream = null;
    SqlSessionFactory fa;

    @Override
    public void insertUser(UserBean userBean) {
        try {
            inputStream = Resources.getResourceAsStream(resource);
            fa = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession session = fa.openSession();
        session.insert("org.project.bean.insert",userBean);
        session.commit();
        session.close();
    }

    @Override
    public void select(int id) {
        try {
            inputStream = Resources.getResourceAsStream(resource);
            fa = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession session = fa.openSession();
        UserBean userBean = session.selectOne("org.project.bean.userList",id);
        System.out.println(userBean);
        session.close();

    }

    @Override
    public List<UserBean> queryAll() {
        List<UserBean> userBeanList;
        try {
            inputStream =Resources.getResourceAsStream(resource);
            fa=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession session=fa.openSession();
        userBeanList=session.selectList("org.project.bean.queryAll");
        return userBeanList;
    }
}
