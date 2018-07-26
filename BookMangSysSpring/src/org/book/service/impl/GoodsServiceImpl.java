package org.book.service.impl;

import org.book.bean.GoodsBean;
import org.book.dao.IGoodsDao;
import org.book.dao.impl.IGoodsActionDaoImpl;
import org.book.service.IGoodsService;

import java.util.List;

/**
 * @ClassName GoodsServiceImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午11:27
 * @Version 1.0
 **/
public class GoodsServiceImpl implements IGoodsService {
    private IGoodsDao goodsDao=new IGoodsActionDaoImpl();
    /**
     * 查询所有商品
     *
     * @return
     */
    @Override
    public List<GoodsBean> queryAllGoods() {
        return goodsDao.queryAll();
    }

    /**
     * 通过商品ID查询商品的详细信息
     *
     * @param goodsId
     * @return
     */
    @Override
    public GoodsBean queryById(int goodsId) {
        return goodsDao.queryById(goodsId);
    }
}
