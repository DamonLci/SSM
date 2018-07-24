package org.book.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName UserBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午7:18
 * @Version 1.0
 **/
public class UserBean {
    private int id;
    private String userName;
    private String userPwd;
    private Set<GoodsBean> goodsBeanSet=new HashSet<GoodsBean>();

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

    public Set<GoodsBean> getGoodsBeanSet() {
        return goodsBeanSet;
    }

    public void setGoodsBeanSet(Set<GoodsBean> goodsBeanSet) {
        this.goodsBeanSet = goodsBeanSet;
    }
}
