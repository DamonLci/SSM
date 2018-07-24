import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName UserBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午3:10
 * @Version 1.0
 **/

@Entity
@Table(name="t_user")
public class UserBean {
    private int id;
    private String userName;
    private String userPwd;
    private int count;

    private Set<BookBean> bookBeans=new HashSet<BookBean>();
    @Transient
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "u_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "u_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name = "u_pwd")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    @OneToMany(mappedBy = "ub",cascade = CascadeType.ALL)
    public Set<BookBean> getBookBeans() {
        return bookBeans;
    }

    public void setBookBeans(Set<BookBean> bookBeans) {
        this.bookBeans = bookBeans;
    }


}
