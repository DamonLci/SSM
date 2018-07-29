package org.book.service.impl;

import org.book.bean.GoodsBean;
import org.book.dao.IGoodsDao;
import org.book.dao.impl.IGoodsDaoImpl;
import org.book.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName GoodsServiceImpl
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午11:27
 * @Version 1.0
 **/
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private IGoodsDao goodsDao;
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

    /**
     * 分页
     *
     * @param currentPage
     * @return
     */
    @Override
    public List<GoodsBean> queryByPage(int currentPage) {
        return goodsDao.queryByPage(currentPage);
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public Long count() {
        return goodsDao.count();
    }


}
