package org.book.bean;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName UserBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午7:18
 * @Version 1.0
 **/
@Entity
@Table(name = "t_users")
public class UserBean {
    private int id;
    private String userName;
    private String userPwd;

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

    @Column(name = "u_pass")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

}
