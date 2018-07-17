package Org.Shopping.Service;

import Org.Shopping.Dao.GoodsDao;
import Org.Shopping.Model.GoodsPo;
import Org.Shopping.Tools.C3p0Utils;

import java.sql.Connection;

public class GoodDetailService {
    public GoodsPo queryById(int id){
        C3p0Utils c3p0Utils=new C3p0Utils();
        Connection con=c3p0Utils.getCon();
        GoodsPo gp=new GoodsDao().queryById(con,id);
        c3p0Utils.close(con);
        return gp;

    }
}
