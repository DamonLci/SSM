package org.home.Annotation;
@Table("user")
public class UserDao {
    @Column("userName")
    private String userName;
    @Column("userId")
    private int userId;
    @Column("userPwd")
    private String userPwd;

    public UserDao() {
    }

    public UserDao(String userName, int userId, String userPwd) {
        this.userName = userName;
        this.userId = userId;
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
