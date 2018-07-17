package Org.Shopping.Service;

import Org.Shopping.Dao.*;
import Org.Shopping.Model.CartPo;
import Org.Shopping.Tools.C3p0Utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

public class CheckOutService {
    public String checkOut(int uid) {
        String res = "结账失败";
        C3p0Utils c3p0Utils = new C3p0Utils();
        Connection con = c3p0Utils.getCon();
        try {
            con.setAutoCommit(false);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        CartDao cartDao = new CartDao();
        List<CartPo> cartPos = cartDao.findAllByUid(con, uid);
        double totalPrice = 0;
        RepertoryDao repertoryDao = new RepertoryDao();
        GoodsDao goodsDao = new GoodsDao();
        for (CartPo po : cartPos) {
            int goodsCount = repertoryDao.findGoodsCountByGoodsid(con, po.getGid());
            int resultGoodsCount = goodsCount - po.getAmount();
            if (resultGoodsCount <= 0) {
                res = "库存不足！";
                try {
                    con.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return res;
            }
            boolean re = repertoryDao.updateGoodsCountByGoodsid(con, po.getGid(), resultGoodsCount);
            if (!re) {
                res = "更新库存失败";
                try {
                    con.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return res;
            }
            double price=goodsDao.findPriceById(con,po.getGid());
            totalPrice=totalPrice+(price*po.getAmount());
        }
        InforDao inforDao=new InforDao();
        double balance=inforDao.findBalanceByUid(con,uid);
        double reBalance=balance-totalPrice;
        if(reBalance<0){
            res="余额不足";
            try {
                con.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return res;
        }
        String orderNo=Calendar.getInstance().getTime().getTime()+"";
        OrderDao orderDao=new OrderDao();
        boolean re=inforDao.updateBalanceByUid(con,uid,totalPrice);
        for (CartPo po :cartPos){
            boolean ress=orderDao.insertNewIndent(orderNo,uid,po.getGid(),po.getAmount(),totalPrice,con);
            if(!ress){
                res="订单生成失败";
                try {
                    con.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return res;
            }
            boolean rer=cartDao.deleteByUidGoodsID(con,uid,po.getGid());
            if(!rer){
                res="购物车清空失败";
                try {
                    con.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return res;
            }


        }
        try {
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            c3p0Utils.close(con);
        }
        res="结账成功";
        return res;


    }
}
