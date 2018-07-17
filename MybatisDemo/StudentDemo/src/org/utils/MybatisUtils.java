package org.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    public static SqlSessionFactory getSqlsessionFactory() {
        String resource = "config.xml";
        InputStream inputStream ;
        SqlSessionFactory fa = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            fa = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fa;
    }
    public static SqlSession getSession(boolean boo){
        SqlSession sqlSession=getSqlsessionFactory().openSession(boo);
        return sqlSession;
    }
    public static SqlSession getSession(){
        SqlSession sqlSession=getSqlsessionFactory().openSession();
        return sqlSession;
    }

}
