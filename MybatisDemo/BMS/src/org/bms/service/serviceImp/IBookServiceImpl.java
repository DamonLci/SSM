package org.bms.service.serviceImp;

import org.bms.bean.BookBean;
import org.bms.dao.BookDao;
import org.bms.dao.daoImp.BookDaoImp;
import org.bms.service.IBookService;

import java.util.List;

public class IBookServiceImpl implements IBookService {
    private BookDao bookDao=new BookDaoImp();
    @Override
    public void AddBook(BookBean bookBean) {
        BookBean bookBean1;
        bookBean1=bookDao.queryByBookName(bookBean.getBookId());
        if (bookBean1 == null) {

        }
    }

    @Override
    public List<BookBean> findAllBook() {
        List<BookBean> bookBeans;
        bookBeans=bookDao.queryAll();
        return bookBeans;

    }

    @Override
    public void findById(int id) {
        BookBean bookBean;
        bookBean=bookDao.queryByBookName(id);
        System.out.println(bookBean);
    }

    @Override
    public void borrowBook(int bookId, int userId) {

    }

    @Override
    public void deleteBook(int id) {
        bookDao.delBook(id);
    }
}
