package org.bms.dao;

import org.bms.bean.BookBean;

public interface BookDao {
    public boolean addBook(BookBean bookBean);
    public boolean updateImg(BookBean bookBean);
}
