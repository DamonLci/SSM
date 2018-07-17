package Org.Shopping.Dao;

import Org.Shopping.Model.GoodsPo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDao {
    public List<GoodsPo> queryByPage(Connection con, int index) {
        List<GoodsPo> goodsPos = new ArrayList<GoodsPo>();
        PreparedStatement pre = null;
        ResultSet re = null;
        String sql = "Select * from goods limit ? ,8";
        try {

            pre = con.prepareStatement(sql);
            pre.setInt(1, index);
            re = pre.executeQuery();
            while (re.next()) {
                int tid = re.getInt("tid");
                String gname = re.getString("gname");
                String gpic = re.getString("gpic");
                double price = re.getDouble("price");
                int id=re.getInt("id");
                GoodsPo goodsPo = new GoodsPo(id,tid, gname, gpic, price);
                goodsPos.add(goodsPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (re != null) {
                try {
                    re.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (pre != null) {
                        try {
                            pre.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
        return goodsPos;
    }
    public int findTotal(Connection con) {
        int total = 0;
        String sql = "select count(id) From goods";
        PreparedStatement pre = null;
        ResultSet re = null;
        try {
            pre = con.prepareStatement(sql);
            re = pre.executeQuery();
            if (re.next()) {
                total = re.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (re != null) {
                try {
                    re.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (pre != null) {
                        try {
                            pre.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return total;

    }
    public GoodsPo queryById(Connection con,int id){
        GoodsPo gp=null;
        String sql="select gname,details,price,details_imgs from goods where id=?";
        PreparedStatement pre=null;
        ResultSet re=null;
        try {
            pre=con.prepareStatement(sql);
            pre.setInt(1,id);
            re=pre.executeQuery();
            if(re.next()){
                String gname=re.getString("gname");
                String details=re.getString("details");
                String details_imgs=re.getString("details_imgs");
                double price=re.getDouble("price");
                gp=new GoodsPo(id,gname,details,price,details_imgs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(re!=null){
                try {
                    re.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }finally {
                    if(pre!=null){
                        try {
                            pre.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return gp;
    }

    public double findPriceById(Connection con, int gid) {
        double price=0;
        String sql = "select price From goods where gid=?";
        PreparedStatement pre = null;
        ResultSet re = null;
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1,gid);
            re = pre.executeQuery();
            if (re.next()) {
                price=re.getDouble("price");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (re != null) {
                try {
                    re.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (pre != null) {
                        try {
                            pre.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return price;

    }
}
