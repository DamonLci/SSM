package org.book.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName GoodsBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午7:20
 * @Version 1.0
 **/
public class GoodsBean {
    private int id;
    private String goodsName;
    private String category;
    private String goodsPrice;
    private String goodsImg;
    private Set<CommentBean> commentBeanSet =new HashSet<CommentBean>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Set<CommentBean> getCommentBeanSet() {
        return commentBeanSet;
    }

    public void setCommentBeanSet(Set<CommentBean> commentBeanSet) {
        this.commentBeanSet = commentBeanSet;
    }
}
