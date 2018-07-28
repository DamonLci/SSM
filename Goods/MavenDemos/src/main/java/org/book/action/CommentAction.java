package org.book.action;

import org.book.bean.CommentBean;
import org.book.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping("/comment.action")
    public @ResponseBody String commentAction(@RequestBody CommentBean commentBean){


        return "success";
    }
}
