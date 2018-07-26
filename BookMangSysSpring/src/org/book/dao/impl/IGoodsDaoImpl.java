package org.book.dao.impl;

import org.book.bean.GoodsBean;
import org.book.dao.IGoodsDao;
import org.book.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName IGoodsDaoImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/25 上午11:26
 * @Version 1.0
 **/
@Repository
public class IGoodsDaoImpl implements IGoodsDao {
    @Autowired
    private SessionFactory fa;


    /**
     * 查询所有商品
     *
     * @return
     */
    @Override
    public List<GoodsBean> queryAll() {
        Session session = fa.openSession();
        Query query = session.createQuery("from GoodsBean");
        List<GoodsBean> goodsBeans = query.list();
        for (GoodsBean goodsbean:
             goodsBeans){
            Hibernate.initialize(goodsbean.getCommentBeanSet());
        }
        session.close();
        return goodsBeans;

    }

    /**
     * @param id 通过ID查询商品的详细信息
     * @return
     */
    @Override
    public GoodsBean queryById(int id) {
        Session session = fa.openSession();
        Query query = session.createQuery("from GoodsBean where g_id=?");
        query.setInteger(0, id);
        GoodsBean goodsBean = (GoodsBean) query.uniqueResult();
        session.close();
        return goodsBean;
    }

    @Test
    public void test() {
        GoodsBean goodsBean = queryById(1);
        System.out.println(goodsBean);
    }

}
