package org.bms.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.bms.bean.BookBean;
import org.bms.dao.BookDao;
import org.bms.util.MybatisUtil;

public class BookDaoImpl implements BookDao {
    @Override
    public boolean addBook(BookBean bookBean) {
        boolean flag=false;
        SqlSession session=MybatisUtil.getsession(true);
        try {
            session.insert("BookDao.insert",bookBean);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return flag;

    }

    @Override
    public boolean updateImg(BookBean bookBean) {
        boolean flag=false;
        SqlSession session=MybatisUtil.getsession(true);
        try {
            session.update("BookDao.updateImgById",bookBean);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return flag;
    }
}
