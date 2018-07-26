package org.book.service;

import org.book.bean.CommentBean;

/**
 * @ClassName ICommentService
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午11:26
 * @Version 1.0
 **/
public interface ICommentService {
    /**
     * 添加评论
     * @param commentBean
     * @return
     */
    public void addComment(CommentBean commentBean);

}
