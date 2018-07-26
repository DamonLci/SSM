package org.book.dao;

import org.book.bean.CommentBean;

import java.util.List;

/**
 * @ClassName ICommentDao
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午10:11
 * @Version 1.0
 **/
public interface ICommentDao {
    /**
     * 通过商品ID查询评论
     * @param goodsId
     * @return
     */
    public List<CommentBean> queryByGoodsId(int goodsId);

    /**
     * 插入名称通过商品ID
     * @param commentBean
     */
    public void insertComment(CommentBean commentBean);
}
