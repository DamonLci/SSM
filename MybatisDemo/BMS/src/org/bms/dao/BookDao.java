package org.bms.dao;

import org.bms.bean.BookBean;

import java.util.List;

public interface BookDao {
    public void addBook(BookBean bookBean);

    public BookBean queryByBookName(int bookId);

    public void updateBook(String bookName);

    public void delBook(int id);

    public List<BookBean> queryAll();


}
