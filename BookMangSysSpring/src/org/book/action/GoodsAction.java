package org.book.action;

import org.book.bean.GoodsBean;
import org.book.service.IGoodsService;
import org.book.service.impl.GoodsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName GoodsAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/25 下午11:18
 * @Version 1.0
 **/
@Controller
public class GoodsAction {
    private IGoodsService goodsService=new GoodsServiceImpl();
    @RequestMapping("/goodsList.action")
    public ModelAndView showGoods(){
        ModelAndView modelAndView=new ModelAndView();
        List<GoodsBean> goodsBeans=goodsService.queryAllGoods();
        modelAndView.addObject("goodsBeans",goodsBeans);
        modelAndView.setViewName("GoodsList.jsp");
        return modelAndView;
    }
}
