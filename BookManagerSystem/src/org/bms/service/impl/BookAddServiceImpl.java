package org.bms.service.impl;

import org.bms.bean.BookBean;
import org.bms.dao.BookDao;
import org.bms.dao.impl.BookDaoImpl;
import org.bms.service.BookAddService;

public class BookAddServiceImpl implements BookAddService {
    @Override
    public String addBook(BookBean bookBean) {
        String res="error";
        BookDao bookDao=new BookDaoImpl();
        boolean flag=bookDao.addBook(bookBean);
        if(flag==true){
            res="success";
        }
        return res;
    }
}
