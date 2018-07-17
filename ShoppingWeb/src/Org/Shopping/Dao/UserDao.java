package Org.Shopping.Dao;

import Org.Shopping.Model.UserModel;
import Org.Shopping.Tools.C3p0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    public String findPassByAccount(Connection con, String account) {
        String realPass = "";
        //准备sql
        String sql = "SELECT pass FROM user WHERE account=? ";
        //创建状态
        PreparedStatement state = null;
        ResultSet set = null;
        try {
            state = con.prepareStatement(sql);
            //设置参数
            state.setString(1, account);
            //执行sql
            set = state.executeQuery();
            if (set.next()) {
                realPass = set.getString("pass");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (set != null) {
                try {
                    set.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (state != null) {
                        try {
                            state.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
        return realPass;
    }
    public UserModel queryByCount(String account) {
        UserModel um=null;
        //准备sql
        String sql = "SELECT * FROM user WHERE account=? ";
        //创建状态
        PreparedStatement state = null;
        ResultSet set = null;
        C3p0Utils c3p0Utils=new C3p0Utils();
        Connection con=c3p0Utils.getCon();
        try {
            state = con.prepareStatement(sql);
            //设置参数
            state.setString(1, account);
            //执行sql
            set = state.executeQuery();
            if (set.next()) {
                int id=set.getInt("id");
                String pass=set.getString("pass");
                um=new UserModel(id,account,pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (set != null) {
                try {
                    set.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (state != null) {
                        try {
                            state.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
        c3p0Utils.close(con);
        return um;
    }


    public void updatePass(String accoun, String pas, Connection con) {
        String sql = "Update user set pass=? where account=?";
        PreparedStatement pre = null;
        ResultSet re = null;
        try {
            pre = con.prepareStatement(sql);
            pre.setString(1, pas);
            pre.setString(2, accoun);
            pre.executeUpdate();
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

    public boolean insertUser(String account, String pass, Connection con) {
        PreparedStatement pre = null;
        int count;
        String sql = "INSERT INTO user(account,pass)VALUES(?,?)";
        try {

            pre = con.prepareStatement(sql);
            pre.setString(1, account);
            pre.setString(2, pass);
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

    public int selectId(String account, String pass, Connection con) {
        PreparedStatement pre = null;
        int id = 0;
        String sql = "SELECT id FROM user WHERE account=? AND pass=?";
        try {
            pre = con.prepareStatement(sql);
            pre.setString(1, account);
            pre.setString(2, pass);
            ResultSet set = pre.executeQuery();
            if (set.next()) {
                id = set.getInt(1);
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
        return id;
    }
}
