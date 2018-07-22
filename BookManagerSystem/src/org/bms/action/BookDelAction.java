package org.bms.action;

import org.bms.service.IBookService;

/**
 * @ClassName BookDelAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/21 下午4:49
 * @Version 1.0
 **/
public class BookDelAction {
    private IBookService bookService;

    public void setBookService(IBookService bookService) {
        this.bookService = bookService;
    }

    public String execute(){
        return "success";
    }
}
