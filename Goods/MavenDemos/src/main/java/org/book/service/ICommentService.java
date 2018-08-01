package org.book.service;

import org.book.bean.CommentBean;

import java.util.List;

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
    public String  addComment(CommentBean commentBean);

    public List<CommentBean> queryAll(int gid);
}
