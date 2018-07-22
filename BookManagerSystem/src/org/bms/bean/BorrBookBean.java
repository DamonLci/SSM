package org.bms.bean;

import java.util.Date;

/**
 * @ClassName BorrBookBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/22 下午11:28
 * @Version 1.0
 **/
public class BorrBookBean {
    private int borrBookId;
    private BookBean bookBean;
    private UserBean userBean;
    private Date borrTime;

    public int getBorrBookId() {
        return borrBookId;
    }

    public void setBorrBookId(int borrBookId) {
        this.borrBookId = borrBookId;
    }

    public BookBean getBookBean() {
        return bookBean;
    }

    public void setBookBean(BookBean bookBean) {
        this.bookBean = bookBean;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public Date getBorrTime() {
        return borrTime;
    }

    public void setBorrTime(Date borrTime) {
        this.borrTime = borrTime;
    }
}
