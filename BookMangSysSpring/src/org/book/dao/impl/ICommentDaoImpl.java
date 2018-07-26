package org.book.dao.impl;

import org.book.bean.CommentBean;
import org.book.dao.ICommentDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName ICommentDaoImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/25 上午11:27
 * @Version 1.0
 **/
@Repository
public class ICommentDaoImpl implements ICommentDao {
    @Autowired
    private SessionFactory fa;
    /**
     * 通过商品ID查询评论
     *
     * @param goodsId
     * @return
     */
    @Override
    public List<CommentBean> queryByGoodsId(int goodsId) {
        return null;
    }

    /**
     * 插入名称通过商品ID
     *
     * @param commentBean
     */
    @Override
    public void insertComment(CommentBean commentBean) {

    }
}
