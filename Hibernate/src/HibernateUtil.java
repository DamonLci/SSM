import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @ClassName HibernateUtil
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/21 下午3:18
 * @Version 1.0
 **/
public class HibernateUtil {
    public static SessionFactory getSessionFactory(){
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        return sf;
    }
    public static Session getSession(){
        Session session=getSessionFactory().openSession();
        return session;
    }
    public static Session getCurrentSession(){
        Session session=getSessionFactory().getCurrentSession();
        return session;
    }

    /**
     * 关闭session
     */
    public static void CloseSession(Session session){
        if(session!=null){
            session.close();
        }
    }


}
