package Org.Shopping.Listen;

import Org.Shopping.Model.UserModel;
import Org.Shopping.Tools.Mark;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.util.Hashtable;

@WebListener()
public class LoginListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public LoginListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    @Override
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    Hashtable<String,HttpSession> sessions=new Hashtable<String,HttpSession>();
    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
        // UserModel um = (UserModel) sbe.getValue();
        Object c = sbe.getValue();
        String d = sbe.getName();
        System.out.println(c+":"+d);

        if (d.equals(Mark.USER)) {
            HttpSession currentSession = sbe.getSession();
            UserModel um=(UserModel)c;
            String username = um.getAccount();
            HttpSession oldSession = sessions.get(username);
            if (oldSession != null && !currentSession.getId().equals(oldSession.getId())) {
                oldSession.removeAttribute(Mark.USER);
            }
            System.out.println("puta");
            sessions.put(username, currentSession);

        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}
