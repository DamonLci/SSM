package org.bms.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
    /**
     * 获取到工厂类对象
     * 没必要写一个静态块加载配置文件，。
     * SqlSessionFactory是一个单列对象
     * @return
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        //第一步：
        String resource = "config.xml";
        InputStream inputStream;
        SqlSessionFactory fa=null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            fa = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return fa;
    }

    /**
     * 获取到连接对象
     * @return
     */
    public static SqlSession getsession() {
            SqlSession session = getSqlSessionFactory().openSession();
        return session;
    }
    /**
     *
     * @param boo tru:自动提交事务  false：手动提交
     * @return
     */
    public static SqlSession getsession(boolean boo) {
        SqlSession session = getSqlSessionFactory().openSession(boo);
        return session;
    }
}
