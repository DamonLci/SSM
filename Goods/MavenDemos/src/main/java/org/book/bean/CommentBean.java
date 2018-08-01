package org.book.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName CommentBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午7:24
 * @Version 1.0
 **/
@Entity
@Table(name = "t_comment")
public class CommentBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_id")
    private int id;
    @Column(name = "c_name")
    private String userName;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "c_g_id")
    private GoodsBean goodsBean;
    @Column(name = "c_content")
    private String commentContent;
    @Column(name = "c_date")
    private Date date;
    @Transient
    private int gid;
    @Transient
    private String time;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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

    public GoodsBean getGoodsBean() {
        return goodsBean;
    }

    @Override
    public String toString() {
        return "CommentBean{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", date=" + date +
                ", gid=" + gid +
                '}';
    }

    @JsonIgnore
    public void setGoodsBean(GoodsBean goodsBean) {
        this.goodsBean = goodsBean;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
