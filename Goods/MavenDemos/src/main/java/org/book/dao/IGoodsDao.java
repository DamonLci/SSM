package org.book.dao;

import org.book.bean.GoodsBean;

import java.util.List;

/**
 * @ClassName IGoodsDao
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午9:06
 * @Version 1.0
 **/
public interface IGoodsDao {
    /**
     * 查询所有商品
     * @return
     */
    public List<GoodsBean> queryAll();

    /**
     * 查询分页
     * @param currentPage
     * @return
     */
    public List<GoodsBean> queryByPage(int currentPage);
    /**
     * @param id
     * 通过ID查询商品的详细信息
     * @return
     */
    public GoodsBean queryById(int id);

    /**
     * 总数
     * @return
     */
    public Long count();
}
