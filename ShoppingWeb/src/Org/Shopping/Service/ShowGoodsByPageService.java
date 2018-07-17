package Org.Shopping.Service;

import Org.Shopping.Dao.GoodsDao;
import Org.Shopping.Model.GoodsPo;
import Org.Shopping.Tools.C3p0Utils;

import java.sql.Connection;

import java.util.List;

public class ShowGoodsByPageService {
    public List<GoodsPo> showGoods(String page) {
        int ipage = 1;
        try {
            ipage = Integer.parseInt(page);
        } catch (Exception e) {
        }
        int index = (ipage - 1) * 8;
        C3p0Utils c3p0Utils = new C3p0Utils();
        Connection con = c3p0Utils.getCon();
        List<GoodsPo> goodsPos = new GoodsDao().queryByPage(con, index);
        c3p0Utils.close(con);
        return goodsPos;
    }

    public int findTotalPage() {
        int totalPage=0;
        C3p0Utils c3p0Utils = new C3p0Utils();
        Connection con = c3p0Utils.getCon();
        int total = new GoodsDao().findTotal(con);
        if (total % 8 == 0){
            totalPage=total /8;
        }else{
            totalPage=total/8+1;
        }
        c3p0Utils.close(con);
        return totalPage;
    }
}
