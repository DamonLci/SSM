package org.bms.service.impl;

import org.bms.bean.BookBean;
import org.bms.dao.IBookDao;
import org.bms.service.IBookService;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/19 上午9:50
 * @Version 1.0
 **/
public class BookServiceImpl implements IBookService {


    private IBookDao bookDao;

    public IBookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(IBookDao bookDao) {
        this.bookDao = bookDao;
    }

    /**
     * 书籍列表
     *
     * @return
     */
    @Override
    public List<BookBean> queryByAll() {
        List<BookBean> bookBeans;
        bookBeans = bookDao.queryByAll();
        return bookBeans;
    }

    /**
     * 查询图书
     *
     * @param id
     * @return
     */
    @Override
    public BookBean queryById(int id) {
        BookBean bookBean;
        bookBean=bookDao.queryById(id);
        return bookBean;
    }

    /**
     * 添加图书
     *
     * @param bookBean
     * @return
     */
    @Override
    public String addBook(BookBean bookBean) {
        String res ="err";
        boolean flag = bookDao.addBook(bookBean);
        if (flag == true) {
            res = "success";
        }
        return res;
    }

    /**
     * 删除图书
     *
     * @param id
     */
    @Override
    public void delBook(int id) {
        bookDao.delBook(id);
    }

    /**
     * 查询图书 通过名字
     *
     * @param bookName
     * @return
     */
    @Override
    public String queryByName(String bookName) {
        String res="";
        System.out.println(bookName);
        BookBean bookBean=bookDao.queryByName(bookName);

        if(bookBean!=null){
            res="error";
        }else{
            res="success";
        }
        return res;
    }

}
