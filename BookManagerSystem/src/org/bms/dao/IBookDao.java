package org.bms.dao;

import org.bms.bean.BookBean;

import java.util.List;

public interface IBookDao {
    /**
     * 添加图书
     * @param bookBean
     * @return
     */
    public boolean addBook(BookBean bookBean);

    /**
     * 遍历图书
     * @return
     */
    public List<BookBean> queryByAll();

    /**
     *
     * @param id
     * @return
     */
    public BookBean queryById(int id);
    /**
     * 删除图书
     * @param id
     */
    public void delBook(int id);

    /**
     * 查询图书是否存在
     * @param bookName
     * @return
     */
    public BookBean queryByName(String bookName);

}
