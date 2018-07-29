package org.book.action;

import org.book.bean.GoodsBean;
import org.book.bean.UserBean;
import org.book.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName GoodsAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/25 下午11:18
 * @Version 1.0
 **/
@Controller
public class GoodsAction {
    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("/goodsList.action")
    public ModelAndView showGoods() {
        ModelAndView modelAndView = new ModelAndView();
        List<GoodsBean> goodsBeans = goodsService.queryAllGoods();
        modelAndView.addObject("goodsBeans", goodsBeans);
        modelAndView.setViewName("GoodsList.jsp");
        return modelAndView;
    }

    @RequestMapping("/goodsDetail.action")
    public ModelAndView showGoodsDetail(int id) {
        ModelAndView modelAndView = new ModelAndView();
        GoodsBean goodsBean = goodsService.queryById(id);
        if (goodsBean != null) {
            modelAndView.addObject("goodsBean", goodsBean);
            modelAndView.setViewName("GoodDetail.jsp");
        } else {
            modelAndView.setViewName("error.jsp");
        }
        return modelAndView;
    }

    @RequestMapping("/queryPage.action")
    public @ResponseBody  Map<String, Object> queryByPage(@RequestParam Integer currentPage) {
        List<GoodsBean> goodsBeans = goodsService.queryByPage(1);

        Long count = goodsService.count();
        int totalPage = (int) (count / 5);
        Map<String, Object> res = new HashMap<String, Object>();
       // System.out.println(goodsBeans);
        res.put("count", count);
        res.put("goodsBeans", goodsBeans);
        res.put("totalPage", totalPage);

        return res;
    }

    @RequestMapping("/TestAction2.action")
    public @ResponseBody Map<String,Object> TestAction2(@RequestBody UserBean bean) {
        System.out.println(bean);
        Map<String , Object> res=new HashMap<String, Object>();
        res.put("test","test");
        return res;
    }
}
