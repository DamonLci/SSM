package Org.Shopping.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInfoDao {
    public boolean insertUserInfo(int id,Connection con){
        PreparedStatement pre=null;
        //受影响行数
        int count=0;
        String sql="INSERT INTO userinfo(uid) VALUES (?)";
        try {
            //获取预编译对象
            pre=con.prepareStatement(sql);
            //设置参数
            pre.setInt(1, id);
            //执行sql语句
            count=pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if(pre!=null){
                try {
                    pre.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if(count==1) {
            return true;
        } else {
            return false;
        }
    }
}
