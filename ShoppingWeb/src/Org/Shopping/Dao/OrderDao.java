package Org.Shopping.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDao {

    public boolean insertNewIndent(String number, int id, int gid, int amount, double d, Connection con) {
        int count=0;
        String sql="INSERT INTO indent(number,uid,gid,amount,money) VALUES(?,?,?,?,?)";
        PreparedStatement ps=null;
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, number);
            ps.setInt(2, id);
            ps.setInt(3, gid);
            ps.setInt(4, amount);
            ps.setDouble(5, d);
            count=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}
