package Org.Shopping.Service;

import Org.Shopping.Dao.UserDao;
import Org.Shopping.Model.UserModel;
import Org.Shopping.Tools.C3p0Utils;
import Org.Shopping.Tools.MD5_Encoding;
import Org.Shopping.Tools.RegularStr;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginService {

    public String loginCheck(String account, String pass, String code,
                             Object orealCode) throws SQLException {
        String result = "登陆失败！";
        //数据格式验证
        //非空判断
        if (account == null || pass == null || code == null || orealCode == null) {
            return result;
        }
        //验证码验证
        String realCode = (String) orealCode;
        if (!realCode.equalsIgnoreCase(code)) {
            result = "验证码错误！";
            return result;
        }
        //账号格式验证
        if (!account.matches(RegularStr.Emails)) {
            result = "账号不合法！请输入正确的邮箱！";
            return result;
        }
        //密码验证
        if (!pass.matches(RegularStr.PASS)) {
            result = "密码错误！";
            return result;
        }
        //创建DAO对象，操作数据库
        C3p0Utils c3p0 = new C3p0Utils();
        Connection con = c3p0.getCon();
        String realPass = new UserDao().findPassByAccount(con, account);
        UserModel um=new UserDao().queryByCount(account);
        //判断账号是否存在
        if (realPass.length() <= 0) {
            result = "账号不存在！请注册！";
            c3p0.close(con);
            return result;
        }
        //判断密码是否正确
        if (realPass.equals(MD5_Encoding.upperMD5(pass))) {
            result = "登录成功！";
        } else {
            result = "密码错误！";
        }
        c3p0.close(con);
        return result;
    }
}

