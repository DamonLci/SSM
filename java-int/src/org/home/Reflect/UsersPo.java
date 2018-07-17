package org.home.Reflect;

public class UsersPo {
    private String userName;
    private String userPwd;

    public UsersPo(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public UsersPo() {
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

    @Override
    public String toString() {
        return "UsersPo{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
