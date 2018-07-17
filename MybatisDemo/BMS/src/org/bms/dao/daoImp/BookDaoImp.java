package org.bms.dao.daoImp;

import org.apache.ibatis.session.SqlSession;
import org.bms.bean.BookBean;
import org.bms.dao.BookDao;
import org.bms.utils.MybatisUtils;

import java.util.List;

public class BookDaoImp implements BookDao {
    @Override
    public void addBook(BookBean bookBean) {
        SqlSession session=MybatisUtils.getSession(true);
        session.insert("bookBean.addBook",bookBean);
        session.close();
    }

    @Override
    public BookBean queryByBookName(int bookId) {
        BookBean bookBeans;
        SqlSession session=MybatisUtils.getSession();
        //BookMapper mapper=session.getMapper(BookMapper.class);
        bookBeans=session.selectOne("bookBean.queryByName",bookId);
        session.close();
        return bookBeans;
    }

    @Override
    public void updateBook(String bookName) {
        SqlSession session=MybatisUtils.getSession(true);
        try {
            int i=session.update("bookBean.updateByName",bookName);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }


    }

    @Override
    public void delBook(int id) {
        SqlSession session=MybatisUtils.getSession(true);
        int i=session.delete("bookBean.delByName",id);
        session.close();
    }

    @Override
    public List<BookBean> queryAll() {
        List<BookBean> bookBeans;
        SqlSession session=MybatisUtils.getSession();
        bookBeans=session.selectList("bookBean.queryAll");
        return bookBeans;
    }
}
