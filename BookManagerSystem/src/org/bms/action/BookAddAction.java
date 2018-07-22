package org.bms.action;

import org.bms.bean.BookBean;
import org.bms.service.IBookService;
import org.bms.service.impl.BookServiceImpl;
import org.bms.util.FileUploadUtil;
import org.codehaus.jackson.map.ObjectMapper;

public class BookAddAction {
    private BookBean bookBean;
    private FileUploadUtil f = new FileUploadUtil();

    public FileUploadUtil getF() {
        return f;
    }

    public void setF(FileUploadUtil f) {
        this.f = f;
    }

    public BookBean getBookBean() {
        return bookBean;
    }

    public void setBookBean(BookBean bookBean) {
        this.bookBean = bookBean;
    }

    private IBookService bookService;

    public void setBookService(IBookService bookService) {
        this.bookService = bookService;
    }

    public String execute() {
        f.FileUpload();
        String fileName = f.getUploadImageFileName();
        String res = "";
        bookBean.setBookImg(fileName);
        res = bookService.addBook(bookBean);
        return res;

    }
}
