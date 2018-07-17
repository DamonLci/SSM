package org.bms.action;

import com.opensymphony.xwork2.ModelDriven;
import org.bms.bean.BookBean;
import org.bms.service.BookAddService;
import org.bms.service.impl.BookAddServiceImpl;

public class BookAddAction implements ModelDriven {
    private BookBean bookBean;

    public BookBean getBookBean() {
        return bookBean;
    }

    public void setBookBean(BookBean bookBean) {
        this.bookBean = bookBean;
    }

    @Override
    public Object getModel() {
        if(bookBean!=null){
            bookBean=new BookBean();
        }
        return bookBean;
    }
    public  String execute(){
        String res="";
        BookAddService bookAddService=new BookAddServiceImpl();
        res=bookAddService.addBook(bookBean);
        return res;

    }
}
