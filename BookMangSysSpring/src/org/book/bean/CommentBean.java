package org.book.bean;

import java.util.Date;

/**
 * @ClassName CommentBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午7:24
 * @Version 1.0
 **/
public class CommentBean {
    private int id;
    private int userId;
    private int goodsId;
    private String commentContent;
    private Date date;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
