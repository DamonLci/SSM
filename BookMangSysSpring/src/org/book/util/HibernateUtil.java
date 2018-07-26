package org.book.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @ClassName HibernateUtil
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/25 上午11:46
 * @Version 1.0
 **/
public class HibernateUtil {
    private static SessionFactory sessionFactory= null;
    private static Session session;
    /**
     * 获取到hibernate的配置对象
     * @return
     */
    public static Configuration getConfig() {

        Configuration config = new Configuration().configure();

        return config;
    }

    /**
     * 创建SessionFactory对象
     * @return
     */
    public static SessionFactory getSessionFactory() {
        sessionFactory = getConfig().buildSessionFactory();
        return sessionFactory;
    }

    /**
     * 创建session对象
     * @return session
     */
    public static Session getSession() {
        session = getSessionFactory().openSession();
        return session;
    }
    /**
     * 关闭对象
     */
    public static void closeCon() {
        if(session!=null) {
            session.close();
        }
        if(sessionFactory!=null) {
            sessionFactory.close();
        }

    }
}
