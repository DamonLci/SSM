import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName StudentBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/21 上午11:05
 * @Version 1.0
 **/
public class StudentBean {
    private int id;
    private String userName;
    private String userPwd;
    private Set<OrderBean> orderBeanSet=new HashSet<OrderBean>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Set<OrderBean> getOrderBeanSet() {
        return orderBeanSet;
    }

    public void setOrderBeanSet(Set<OrderBean> orderBeanSet) {
        this.orderBeanSet = orderBeanSet;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", orderBeanSet=" + orderBeanSet +
                '}';
    }
}
