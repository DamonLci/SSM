package org.book.dao.impl;

import org.book.bean.GoodsBean;
import org.book.dao.IGoodsDao;
import org.book.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName IGoodsDaoImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/25 上午11:26
 * @Version 1.0
 **/
public class IGoodsActionDaoImpl implements IGoodsDao {
    /**
     * 查询所有商品
     *
     * @return
     */
    @Override
    public List<GoodsBean> queryAll() {
        Session session=HibernateUtil.getSession();
        Query query=session.createQuery("from GoodsBean");
        List<GoodsBean> goodsBeans=query.list();
        return goodsBeans;

    }

    /**
     * @param id 通过ID查询商品的详细信息
     * @return
     */
    @Override
    public GoodsBean queryById(int id) {
        return null;
    }

    @Test
    public void test(){
        List<GoodsBean> goodsBeans=queryAll();
        System.out.println(goodsBeans);
    }

}
