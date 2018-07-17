package org.project.org.project.test;

import org.junit.Test;
import org.project.bean.UserBean;
import org.project.dao.UserDao;
import org.project.daoimp.UserDaoImp;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    @Test
    public void test() {
        UserDao ud = new UserDaoImp();
        ud.select(1);
    }

    @Test
    public void test2() {
        UserDao ud=new UserDaoImp();
        UserBean userBean=new UserBean("131313131","3131311");
        ud.insertUser(userBean);
    }
    @Test
    public void test3(){
        List<UserBean> userBeans;
        UserDao ud=new UserDaoImp();
        userBeans=ud.queryAll();
        for (UserBean us:
             userBeans) {
            System.out.println(us);
        }
    }
}
