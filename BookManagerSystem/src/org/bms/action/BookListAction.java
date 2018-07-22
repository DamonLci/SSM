package org.bms.action;

import com.opensymphony.xwork2.ActionContext;
import org.bms.bean.BookBean;
import org.bms.service.IBookService;
import org.bms.service.impl.BookServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BookListAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/17 下午4:00
 * @Version 1.0
 **/
public class BookListAction {
    private IBookService bookService;

    public IBookService getBookService() {
        return bookService;
    }

    public void setBookService(IBookService bookService) {
        this.bookService = bookService;
    }

    public String execute(){
        List<BookBean> bookBeans;
        bookBeans=bookService.queryByAll();
        ActionContext.getContext().put("bookBeans",bookBeans);
        return "success";
    }
}
