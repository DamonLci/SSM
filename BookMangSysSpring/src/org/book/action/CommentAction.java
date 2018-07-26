package org.book.action;

import org.book.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName CommentAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/27 上午12:22
 * @Version 1.0
 **/
@Controller
public class CommentAction {
    @Autowired
    private ICommentService commentService;
}
