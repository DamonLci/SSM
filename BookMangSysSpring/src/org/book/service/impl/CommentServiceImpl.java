package org.book.service.impl;

import org.book.bean.CommentBean;
import org.book.dao.ICommentDao;
import org.book.dao.impl.ICommentDaoImpl;
import org.book.service.ICommentService;

/**
 * @ClassName CommentServiceImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午11:27
 * @Version 1.0
 **/
public class CommentServiceImpl implements ICommentService {
    private ICommentDao commentDao=new ICommentDaoImpl();
    /**
     * 添加评论
     *
     * @param commentBean
     * @return
     */
    @Override
    public void addComment(CommentBean commentBean) {
        commentDao.insertComment(commentBean);
    }
}
