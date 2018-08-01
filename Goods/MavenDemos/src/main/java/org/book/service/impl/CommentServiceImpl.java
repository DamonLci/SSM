package org.book.service.impl;

import org.book.bean.CommentBean;
import org.book.bean.GoodsBean;
import org.book.bean.UserBean;
import org.book.dao.ICommentDao;
import org.book.dao.IGoodsDao;
import org.book.dao.impl.ICommentDaoImpl;
import org.book.service.ICommentService;
import org.book.util.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName CommentServiceImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午11:27
 * @Version 1.0
 **/
@Service
public class CommentServiceImpl implements ICommentService {
    @Autowired
    private ICommentDao commentDao;
    @Autowired
    private HttpServletRequest req;
    @Autowired
    private IGoodsDao goodsDao;
    /**
     * 添加评论
     *
     * @param commentBean
     * @return
     */
    @Override
    public String addComment(CommentBean commentBean) {
        HttpSession session=req.getSession();
        UserBean ub= (UserBean) session.getAttribute(Mark.USER);
        System.out.println(ub);
        if(ub==null){
            return "log";
        }
        GoodsBean goodsBean=goodsDao.queryById(commentBean.getGid());
        commentBean.setGoodsBean(goodsBean);
        commentBean.setDate(new Date());
        commentBean.setUserName(ub.getUserName());
        System.out.println(commentBean);
        commentDao.insertComment(commentBean);
        return "success";
    }

    @Override
    public List<CommentBean> queryAll(int gid) {
        List<CommentBean> commentBeans=commentDao.queryByGoodsId(gid);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(CommentBean commentBean:commentBeans){
            commentBean.setTime(sdf.format(commentBean.getDate()));
        }
        return commentBeans;
    }
}
