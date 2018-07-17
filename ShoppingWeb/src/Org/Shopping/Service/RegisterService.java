package Org.Shopping.Service;

import Org.Shopping.Dao.UserDao;
import Org.Shopping.Dao.UserInfoDao;
import Org.Shopping.Tools.C3p0Utils;
import Org.Shopping.Tools.MD5_Encoding;
import Org.Shopping.Tools.RegularStr;

import java.sql.Connection;
import java.sql.SQLException;

public class RegisterService {
    public String insertJudege(String account, String pass, String repass, String code,
                               Object orealCode) {
        String res = "注册失败";
        if (account == null || pass == null || repass == null) {
            res = "请输入正确的用户名和密码";
            return res;
        }
        if (!account.matches(RegularStr.Emails)) {
            res = "请输入正确的邮箱号码";
            return res;
        }
        if (!pass.matches(RegularStr.PASS)) {
            res = "请输入正确的密码";
        }
        if (!pass.equals(repass)) {
            res = "两次密码输入不一致";
            return res;
        }
        String realCode = (String) orealCode;
        if (!realCode.equalsIgnoreCase(code)) {
            res = "验证码错误！";
            return res;
        }
        C3p0Utils c3p0Utils = new C3p0Utils();
        Connection con = c3p0Utils.getCon();
        String st = new UserDao().findPassByAccount(con, account);
        UserDao ud = new UserDao();
        UserInfoDao uid = new UserInfoDao();
        boolean flag = false;
        if (st.length() > 0) {
            res = "用户名已经存在";
            return res;
        }
        pass = MD5_Encoding.upperMD5(pass);
        try {
            con.setAutoCommit(false);
            boolean insert = ud.insertUser(account, pass, con);
            int id = ud.selectId(account, pass, con);
            boolean insInfo = uid.insertUserInfo(id, con);
            if (insert == true && insInfo == true) {
                con.commit();
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            c3p0Utils.close(con);
        }
        if (flag == true) {

            res = "注册成功";
        }
        return res;
    }
}
