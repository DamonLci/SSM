package Org.Shopping.Service;

import Org.Shopping.Dao.UserDao;
import Org.Shopping.Tools.C3p0Utils;
import Org.Shopping.Tools.MD5_Encoding;
import Org.Shopping.Tools.RegularStr;

import java.sql.Connection;

public class ModifyPassService {
    public String ModifyPass(String account, String pass, String newpass,String confnewpass, Object orealCode, String code) {
        String str = "修改失败";
        if (account == null || pass == null || newpass == null) {
            return str;
        }
        //验证码验证
        String realCode = (String) orealCode;
        if (!realCode.equalsIgnoreCase(code)) {
            str = "验证码错误！";
            return str;
        }
        //账号格式验证
        if (!account.matches(RegularStr.Emails)) {
            str = "账号不合法！请输入正确的邮箱！";
            return str;
        }
        //密码验证
        if (!pass.matches(RegularStr.PASS)) {
            str = "密码错误！";
            return str;
        }
        C3p0Utils c3p0 = new C3p0Utils();
        Connection con = c3p0.getCon();
        String realPass = new UserDao().findPassByAccount(con, account);
        if (!realPass.equals(MD5_Encoding.upperMD5(pass))) {
            str = "与原密码不一致";
            return str;
        }
        if(!MD5_Encoding.upperMD5(confnewpass).equals(MD5_Encoding.upperMD5(newpass))){
            str="密码不一致";
            return str;
        }
        if(MD5_Encoding.upperMD5(pass).equals(realPass) && newpass.equals(confnewpass)){
            new UserDao().updatePass(account,MD5_Encoding.upperMD5(newpass),con);
            str="修改成功";
            return str;
        }
        c3p0.close(con);
        return str;
    }
}
