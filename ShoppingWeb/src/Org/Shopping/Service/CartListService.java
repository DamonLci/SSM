package Org.Shopping.Service;

import Org.Shopping.Dao.CartDao;
import Org.Shopping.Model.ViewCartPo;
import Org.Shopping.Tools.C3p0Utils;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class CartListService {
    public List<ViewCartPo> queryList(int uid){
        C3p0Utils c3p0Utils=new C3p0Utils();
        Connection con=c3p0Utils.getCon();
        List<ViewCartPo> viewCartPos=new ArrayList<ViewCartPo>();
        viewCartPos=new CartDao().queryAll(con,uid);
        c3p0Utils.close(con);
        return viewCartPos;
    }
}
