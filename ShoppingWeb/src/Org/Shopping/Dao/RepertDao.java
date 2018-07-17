package Org.Shopping.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepertDao {
    public int queryGnumberByGid(Connection con,int gid){
        PreparedStatement pre=null;
        ResultSet re=null;
        int gnumber=0;
        String sql="select gnumber from repertory where gid=?";
        try {
            pre=con.prepareStatement(sql);
            pre.setInt(1,gid);
            re=pre.executeQuery();
            if(re.next()){
                gnumber=re.getInt("gnumber");
                return gnumber;
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
        return gnumber;
    }
}
