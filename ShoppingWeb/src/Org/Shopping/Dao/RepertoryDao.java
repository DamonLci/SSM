package Org.Shopping.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepertoryDao {
    public int findGoodsCountByGoodsid(Connection con, int gid) {
        PreparedStatement pre = null;
        ResultSet re = null;
        int gnumber = 0;
        String sql = "select gnumber from repertory where gid=?";
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1, gid);
            re = pre.executeQuery();
            if (re.next()) {
                gnumber = re.getInt("gnumber");
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
        return gnumber;

    }

    public boolean updateGoodsCountByGoodsid(Connection con, int gid, int resultGoodsCount) {
        boolean res = false;
        PreparedStatement pre = null;
        ResultSet re = null;
        int gnumber = 0;
        String sql = "update repertory set gnumber=gnumber-? where gid=?";
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1, resultGoodsCount);
            pre.setInt(2, gid);
            int row = pre.executeUpdate();
            if (row > 0) {
                res = true;
            }
        } catch (
                SQLException e)

        {
            e.printStackTrace();
        } finally

        {
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
        return res;
    }
}
