package Org.Shopping.Service;

import Org.Shopping.Dao.CartDao;
import Org.Shopping.Dao.RepertDao;
import Org.Shopping.Tools.C3p0Utils;

import java.sql.Connection;

public class CartService {
    public String addCart(int gid, int uid) {
        String res = "添加失败";
        boolean flag = false;
        C3p0Utils c3p0Utils = new C3p0Utils();
        Connection con = c3p0Utils.getCon();
        boolean fl = new CartDao().queryByUid(con, gid, uid);
        if (fl == true) {
            boolean f = new CartDao().UpdateCart(con, gid, uid);
            if (f == true) {
                res = "增加成功";
                return res;
            }

        } else {
            boolean a = new CartDao().addCart(con, gid, uid);
            if (a == true) {
                res = "增加成功";
                return res;
            }
        }
        return res;
    }
    public int redecuCart(int gid,int uid){
        String res="删除失败，请检查";
        int mount=0;
        C3p0Utils c3p0Utils=new C3p0Utils();
        Connection con=c3p0Utils.getCon();
        boolean fl = new CartDao().queryByUid(con, gid, uid);
        if(fl==true){
            boolean f=new CartDao().reduceCart(con,gid,uid);
            mount =new CartDao().queryByGid(con,uid,gid);

            if(f==true){
                res="删除成功";
                return mount;
            }
        }
        return mount;
    }
    public int UpdateCart(int gid,int uid){
        String res="删除失败，请检查";
        int mount=0;
        C3p0Utils c3p0Utils=new C3p0Utils();
        Connection con=c3p0Utils.getCon();
        boolean fl = new CartDao().queryByUid(con, gid, uid);
        if(fl==true){
            boolean f=new CartDao().UpdateCart(con,gid,uid);
            mount =new CartDao().queryByGid(con,uid,gid);

            if(f==true){
                res="删除成功";
                return mount;
            }
        }
        return mount;
    }

    public int queryByid(int uid, int gid) {
        int amount = 0;
        C3p0Utils c3p0Utils = new C3p0Utils();
        Connection con = c3p0Utils.getCon();
        amount = new CartDao().queryByGid(con, uid, gid);
        return amount;

    }
}
