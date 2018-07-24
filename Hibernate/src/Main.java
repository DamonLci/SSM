import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import javax.persistence.metamodel.EntityType;

import java.util.Date;
import java.util.List;
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
        Transaction transaction=session.beginTransaction();
        StudentBean st=new StudentBean();
        st.setUserName("damon");
        st.setUserPwd("1234");
        StudentBean st1=new StudentBean();
        st1.setUserName("damon2");
        st1.setUserPwd("12341");
        OrderBean or=new OrderBean();
        or.setAddress("哈哈");
        or.setDa(new Date());
        OrderBean or1=new OrderBean();
        or1.setAddress("嘻嘻");
        or1.setDa(new Date());

        StOrBean sto=new StOrBean();
        sto.setStudentBean(st);
        sto.setOrderBean(or);
        sto.setDa(new Date());
        StOrBean sto1=new StOrBean();
        sto1.setStudentBean(st1);
        sto1.setOrderBean(or1);
        sto1.setDa(new Date());
        session.save(sto);
        session.save(sto1);
        transaction.commit();
        session.close();



    }
    @Test
    public void test4(){
        Session session=HibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        StudentBean st=new StudentBean();
        st.setUserName("damon");
        st.setUserPwd("1234");
        OrderBean or=new OrderBean();
        or.setAddress("双流");
        st.getOrderBeanSet().add(or);
        session.save(st);
        transaction.commit();
        session.close();
    }

    @Test
    public void queryTest(){
        Session session=HibernateUtil.getSession();
        Query query=session.createQuery("from StudentBean as stss where stss.userName=?0");
        query.setString(0,"damon");
        List<StudentBean> st=query.list();
        for (StudentBean sts:
             st) {
            System.out.println(sts);
        }
    }
    @Test
    public void queryTest2(){
        Session session=HibernateUtil.getSession();
        Query query=session.createQuery("from StudentBean as sta where sta.userName like ?0");
        query.setString(0,"%2%");
        List<StudentBean> st=query.list();
        for (StudentBean sts:
                st) {
            System.out.println(sts);
        }
    }

    /**
     * QBC查询
     */

    @Test
    public void testQbcOne(){
        Session session=HibernateUtil.getSession();
        Criteria criteria=session.createCriteria(StudentBean.class);
        List<StudentBean> st=criteria.list();
        for (StudentBean sts:
             st) {
            System.out.println(sts);
        }
    }
}