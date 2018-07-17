package Org.Shopping.Tools;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
    //创建一个连接池对象
    private static ComboPooledDataSource pool=null;
    static{
        pool = new ComboPooledDataSource("myc3p0xml");

    }
    public Connection getCon(){
        try {
            return pool.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void close(Connection con){
        try {
            if(con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
