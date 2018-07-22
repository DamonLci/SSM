import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    @Test
    public void test() {
        Session session=HibernateUtil.getSession();
        Transaction tr = session.beginTransaction();
        StudentBean st = new StudentBean();
        st.setUserName("damin");
        st.setUserPwd("12345");
        session.save(st);
        tr.commit();
        session.close();
    }
    @Test
    public void test2(){
        Session session=HibernateUtil.getSession();
        StudentBean st=session.get(StudentBean.class,1);
        System.out.println(st.getUserName());
        StudentBean st1=session.get(StudentBean.class,2);
        System.out.println(st1.getUserName());
        session.close();
    }
    @Test
    public void test3(){
        Session session=HibernateUtil.getSession();

    }
}