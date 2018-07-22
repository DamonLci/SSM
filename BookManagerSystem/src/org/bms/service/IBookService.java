package org.bms.service;

import org.bms.bean.BookBean;

import java.util.List;

/**
 * @ClassName IBookService
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/19 上午9:50
 * @Version 1.0
 **/
public interface IBookService {
    /**
     * 书籍列表
     *
     * @return
     */
    public List<BookBean> queryByAll();

    /**
     * 查询图书
     *
     * @param id
     * @return
     */
    public BookBean queryById(int id);

    /**
     * 添加图书
     * @param bookBean
     * @return
     */
    public String addBook(BookBean bookBean);

    /**
     * 删除图书
     * @param id
     */
    public void delBook(int id);

    /**
     * 查询图书 通过名字
     * @param bookName
     * @return
     */
    public String queryByName(String bookName);
}
