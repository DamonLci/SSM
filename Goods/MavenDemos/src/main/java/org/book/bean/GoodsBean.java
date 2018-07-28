package org.book.bean;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName GoodsBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午7:20
 * @Version 1.0
 **/
@Entity
@Table(name = "t_goods")
public class GoodsBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "g_id")
    private int id;
    @Column(name = "g_name")
    private String goodsName;
    @Column(name = "g_type")
    private String category;
    @Column(name = "g_price")
    private double goodsPrice;
    @Column(name = "g_img")
    private String goodsImg;

    @Override
    public String toString() {
        return "GoodsBean{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", category='" + category + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsImg='" + goodsImg + '\'' +
                ", commentBeanSet=" + commentBeanSet +
                '}';
    }

    @OneToMany(mappedBy="goodsBean",cascade = CascadeType.ALL)
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

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
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
