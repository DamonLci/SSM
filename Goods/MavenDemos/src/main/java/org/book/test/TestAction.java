package org.book.test;

import org.book.bean.GoodsBean;
import org.book.bean.UserBean;
import org.book.dao.IGoodsDao;
import org.book.dao.IUserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName TestAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/26 下午10:58
 * @Version 1.0
 **/
public class TestAction {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao dao=context.getBean(IUserDao.class);
        UserBean userBean=dao.queryByName("tom");
        System.out.println(userBean);
    }
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IGoodsDao dao=context.getBean(IGoodsDao.class);
        List<GoodsBean> goodsBeans =dao.queryByPage(2);
        System.out.println(goodsBeans);
    }
}
