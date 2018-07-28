package org.book.service;

import org.book.bean.GoodsBean;

import java.util.List;

/**
 * @ClassName IGoodsService
 * @Description TODO
 * @Author Wu Yim¡in
 * @Date 2018/7/24 下午11:25
 * @Version 1.0
 **/
public interface IGoodsService {
    /**
     * 查询所有商品
     * @return
     */
    public List<GoodsBean> queryAllGoods();

    /**
     * 通过商品ID查询商品的详细信息
     * @param goodsId
     * @return
     */
    public GoodsBean queryById(int goodsId);


}
