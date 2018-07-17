package org.bms.bean;

public class UserBean {
    private int uId;
    private String userName;
    private String userPwd;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
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

    public UserBean(int uId, String userName, String userPwd) {
        this.uId = uId;
        this.userName = userName;
        this.userPwd = userPwd;
    }
}
