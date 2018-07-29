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
        for (GoodsBean goodsbean :
                goodsBeans) {
            Hibernate.initialize(goodsbean.getCommentBeanSet());
            return goodsBeans;


        }
        session.close();
        return goodsBeans;
    }

    /**
     * 查询分页
     * @param currentPage
     * @return
     */
    @Override
    public List<GoodsBean> queryByPage(int currentPage) {
        Session session = fa.openSession();
        Query query = session.createQuery("from GoodsBean");
        int first=(currentPage-1)*5;
        query.setFirstResult(first);
        query.setMaxResults(5);
        List<GoodsBean> goodsBeans=query.list();
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
        Hibernate.initialize(goodsBean.getCommentBeanSet());
        session.close();
        return goodsBean;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public Long count() {
        Session session=fa.openSession();
        Long count =(Long)session.createQuery("select count(*) from GoodsBean").uniqueResult();
        return count;
    }


}
