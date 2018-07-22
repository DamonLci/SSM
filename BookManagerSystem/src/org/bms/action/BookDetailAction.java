package org.bms.action;

import com.opensymphony.xwork2.ActionContext;
import org.bms.bean.BookBean;
import org.bms.service.IBookService;
import org.bms.service.impl.BookServiceImpl;

/**
 * @ClassName BookDetailAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/21 上午12:12
 * @Version 1.0
 **/
public class BookDetailAction {
    private BookBean bookBean;

    public BookBean getBookBean() {
        return bookBean;
    }

    public void setBookBean(BookBean bookBean) {
        this.bookBean = bookBean;
    }

    private IBookService bookService;

    public IBookService getBookService() {
        return bookService;
    }

    public void setBookService(IBookService bookService) {
        this.bookService = bookService;
    }

    public String execute(){

        System.out.println(bookBean.getBookId());
        bookBean=bookService.queryById(bookBean.getBookId());
        System.out.println(bookBean.getBookPublish());
        ActionContext.getContext().getValueStack().set("bookBean",bookBean);
        System.out.println(bookBean.getBookAuthor());
        return "success";

    }
}
