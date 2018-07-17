package Org.Shopping.Dao;

import Org.Shopping.Model.CartPo;
import Org.Shopping.Model.ViewCartPo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartDao {
    public boolean queryByUid(Connection con,int gid,int uid){
        PreparedStatement pre=null;
        ResultSet re=null;
        String sql="SELECT id  FROM cart WHERE gid=? AND uid=?";
        try {
            pre=con.prepareStatement(sql);
            pre.setInt(1,gid);
            pre.setInt(2,uid);
            re=pre.executeQuery();
            //System.out.println("q"+gid);
            //System.out.println("u"+uid);
            if(re.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (re != null) {
                        try {
                            re.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean UpdateCart(Connection con,int gid,int uid){
        PreparedStatement pre=null;
        String sql="UPDATE cart SET amount=amount+1 WHERE gid=? AND uid=?";
        try {
            pre=con.prepareStatement(sql);
            pre.setInt(1,gid);
            pre.setInt(2,uid);
            int count=pre.executeUpdate();
            if(count>0){
                return true;
            }
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
        return false;
    }
    public boolean addCart(Connection con, int gid, int uid) {
        PreparedStatement pre=null;
        String sql = "INSERT INTO cart (uid,gid,amount) VALUES (?,?,1);";
        try {
            pre = con.prepareCall(sql);
            pre.setInt(1, uid);
            pre.setInt(2 , gid);
            int count = pre.executeUpdate();
            if (count == 1) {
                return true;
            }
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
        return false;
    }

    public int queryByGid(Connection con, int uid, int gid) {
        PreparedStatement pre = null;
        ResultSet re = null;
        int amount = 0;
        String sql = "select * from cart where uid=? and gid=?";
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1, uid);
            pre.setInt(2, gid);
            re = pre.executeQuery();
            if (re.next()) {
                amount = re.getInt("amount");
                return amount;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (re != null) {
                        try {
                            re.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return amount;
    }

    public boolean addMount(Connection con, int uid, int gid, int mount) {
        PreparedStatement pre = null;
        int count = 0;
        String sql = "update cart set amount=? where uid=? and gid=?";
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1, mount);
            pre.setInt(2, uid);
            pre.setInt(3, gid);
            count = pre.executeUpdate();
            if (count == 1) {
                return true;
            }
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
        return false;
    }

    public boolean delGood(Connection con, int uid, int gid) {
        PreparedStatement pre = null;
        int count = 0;
        String sql = "delete from cart where uid=? and gid=?";
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1, uid);
            pre.setInt(2, gid);
            count = pre.executeUpdate();
            if (count > 0) {
                return true;
            }
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
        return false;
    }
    public List<ViewCartPo> queryAll(Connection con,int uid){
        List<ViewCartPo> cartPos=new ArrayList<ViewCartPo>();
        PreparedStatement pre=null;
        ResultSet re=null;
        String sql="Select * from art_show where uid=?";
        try {
            pre=con.prepareStatement(sql);
            pre.setInt(1,uid);
            re=pre.executeQuery();
            while(re.next()){
                int gid=re.getInt("gid");
                int amount=re.getInt("amount");
                String gname=re.getString("gname");
                String gpic=re.getString("gpic");
                double price=re.getDouble("price");
                String tname=re.getString("tname");
                ViewCartPo viewCartPo=new ViewCartPo(uid,gid,amount,gname,gpic,price,tname);
                cartPos.add(viewCartPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(pre!=null){
                try {
                    pre.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }finally {
                    if(re!=null){
                        try {
                            re.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return cartPos;
    }
    public boolean reduceCart(Connection con,int gid,int uid){
        PreparedStatement pre=null;
        String sql="UPDATE cart SET amount=amount-1 WHERE gid=? AND uid=?";
        try {
            pre=con.prepareStatement(sql);
            pre.setInt(1,gid);
            pre.setInt(2,uid);
            int count=pre.executeUpdate();
            if(count>0){
                return true;
            }
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
        return false;
    }


    public List<CartPo> findAllByUid(Connection con, int uid) {
        PreparedStatement pre=null;
        List<CartPo> cartPos=new ArrayList<CartPo>();
        ResultSet re=null;
        String sql="select * from cart where uid=?";
        try {
            pre=con.prepareStatement(sql);
            pre.setInt(1,uid);
            re=pre.executeQuery();
            while(re.next()){
                int id=re.getInt("id");
                int gid=re.getInt("gid");
                int amount=re.getInt("amount");
                CartPo cartPo=new CartPo(id,uid,gid,amount);
                cartPos.add(cartPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(pre!=null){
                try {
                    pre.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }finally {
                    if(re!=null){
                        try {
                            re.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return cartPos;
    }

    public void updateGoodsCountByGoodsid() {
    }

    public boolean deleteByUidGoodsID(Connection con, int uid, int gid) {
        PreparedStatement pre = null;
        String sql="delete from cart where uid=? and gid=?";
        boolean re=false;
        try {
            pre=con.prepareStatement(sql);
            pre.setInt(1,uid);
            pre.setInt(2,gid);
            int count=pre.executeUpdate();
            if(count>0){
                re=true;
            }
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
        return re;
    }
}

