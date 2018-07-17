package org.bms.service;

import org.bms.bean.BookBean;

import java.util.List;

public interface IBookService {
    //添加图书
    public void AddBook(BookBean bookBean);
    // 查询所有图书
    public List<BookBean> findAllBook();
    //查询图书
    public void findById(int id);
    //借书
    public void borrowBook(int bookId,int userId);
    //删除图书
    public void deleteBook(int id);
    //
}
