package Org.Shopping.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InforDao {
    public double findBalanceByUid(Connection con, int uid) {
        String sql = "select balance From userInfo where uid=?";
        PreparedStatement pre = null;
        ResultSet re = null;
        double balance=0;
        try {
            pre = con.prepareStatement(sql);
            re = pre.executeQuery();
            pre.setInt(1,uid);
            if (re.next()) {
                balance=re.getDouble("balance");
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
        return balance;

    }

    public boolean updateBalanceByUid(Connection con, int uid, double totalPrice) {
        boolean res=false;
        String sql = "update userInfo set balance =balance -? where uid=?";
        PreparedStatement pre = null;
        try {
            pre = con.prepareStatement(sql);

            pre.setDouble(1,totalPrice);
            pre.setInt(2,uid);
            int row=pre.executeUpdate();
            if (row>0) {
                res=true;
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




        return res;
    }
}
