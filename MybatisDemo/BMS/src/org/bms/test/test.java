package org.bms.test;

import org.bms.bean.BookBean;
import org.bms.dao.BookDao;
import org.bms.dao.daoImp.BookDaoImp;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class test {
    @Test
    public void test(){
        BookDao bk=new BookDaoImp();
        Date s=new Date(new Date().getTime());
        BookBean bks=new BookBean("逆水寒","3.jpg","网易","网易",s,111.00,18,"网之易");
        bk.addBook(bks);
    }
    @Test
    public void test1(){
        List<BookBean> bookBeans;
        BookDao bk=new BookDaoImp();
        bookBeans=bk.queryByBookName(11);
        for (BookBean b:
             bookBeans) {
            System.out.println(b);
        }
    }
    @Test
    public  void test2(){
        BookDao bk=new BookDaoImp();
        bk.delBook("魔兽世界");
    }
    @Test
    public void test3(){
        List<BookBean> bookBeans;
        BookDao bk=new BookDaoImp();
        bookBeans=bk.queryAll();
        for (BookBean b:
             bookBeans) {
            System.out.println(b.toString());
        }
    }
}
