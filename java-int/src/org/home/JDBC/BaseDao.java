package org.home.JDBC;

import java.sql.*;

public class BaseDao {
    private final String url = "jdbc:mysql://127.0.0.1/cinema";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "root";
    protected Connection con;
    protected PreparedStatement pre;
    protected ResultSet re;
    protected CallableStatement cal;

    public void getConnection() throws Exception {
        //实例化类
        Class.forName(this.driver);
        //调用数据库驱动列表的getConnection方法.
        this.con = DriverManager.getConnection(this.url, this.user, this.password);
    }

    public void close() throws Exception {
        if (this.re != null) {
            this.re.close();
        }
        if (this.con != null) {
            this.con.close();
        }
        if (this.pre != null) {
            this.pre.close();
        }
        if (this.cal != null) {
            this.cal.close();
        }
    }

    public void saveUser() {
        try {
            this.getConnection();
            String sql = "insert into user (u_id,u_pass,u_name,u_mail) values (?,?,?,?)";
            pre = con.prepareStatement(sql);
            pre.setString(1, "damon");
            pre.setString(2, "damons");
            pre.setString(3, "damons");
            pre.setString(4, "3530");
            int i = pre.executeUpdate();

            if (i == 1) {
                System.out.println("success");
            } else {
                System.out.println("error");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                this.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void updateUser() {
        try {
            this.getConnection();
            String sql = "update user set u_id=? where u_name=?";
            pre = con.prepareStatement(sql);
            pre.setString(1, "12");
            pre.setString(2, "damon");
            int i = pre.executeUpdate();
            if (i == 1) {
                System.out.println("success");
            } else {
                System.out.println("error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                this.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void delUser() {
        try {
            this.getConnection();
            String sql = "delete from user where u_id=?";
            pre = con.prepareStatement(sql);
            pre.setString(1, "damon");
            int i = pre.executeUpdate();
            int s = pre.getUpdateCount();
            System.out.println(s);
            if (i == 1) {
                System.out.println("success");
            } else {
                System.out.println("error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                this.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void selectUser() {
        try {
            this.getConnection();
            String sql = "select * from user";
            pre = con.prepareStatement(sql);
            re = pre.executeQuery();

            while (re.next()) {
                System.out.println(re.getString("u_name"));
            }

            this.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callProDemo() {
        try {
            this.getConnection();
            String sql = "{call pro_test(?,?)}";
            cal = con.prepareCall(sql);
            cal.setString(1, "damon");
            cal.registerOutParameter(2, Types.VARCHAR);
            cal.execute();
            String a = cal.getString(2);
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                this.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BaseDao bd = new BaseDao();
        //bd.saveUser();
        //bd.selectUser();
        //bd.delUser();
        //bd.updateUser();
    }


}

