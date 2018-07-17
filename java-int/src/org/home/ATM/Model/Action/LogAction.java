package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.UserData;

import java.util.ArrayList;
import java.util.Scanner;

public class LogAction {
    public  void log(ArrayList<UserData> ud) {
        System.out.println("*********欢迎来到登录界面**********");
        System.out.println("*********请输入用户名**********");
        Scanner sc = new Scanner(System.in);
        String UserNames = sc.next();
        System.out.println("********请输入用户密码*********");
        String UserPasswds = sc.next();
        UserData udd = new UserData();
        for (UserData u : ud) {
            //System.out.println(u.getUserPasswd());
            if (UserNames.equals(u.getUserName())) {
                System.out.println(u.getTryFlag());
                    if (u.getTryFlag() < 3 && u.getLoFlag() != 1) {
                        if (UserPasswds.equals(u.getUserPasswd())) {
                        System.out.println("登录成功");
                        MeunUi mu = new MeunUi();
                        mu.SubMeunUi(ud);
                    } else {
                            System.out.println("登录失败，请检查用户名或者密码2");
                            int i = u.getTryFlag();
                            i = i + 1;
                            u.setTryFlag(i);
                            //System.out.println(u.getTryFlag());
                            break;
                    }
                    //System.out.println(u.getRegiTime());
                } else {
                        System.out.println("该账户已经被冻结");
                        break;
                }
            }

            int i = u.getTryFlag();
            i = i + 1;
            u.setTryFlag(i);
           // System.out.println(ud.size());
            //System.out.println(u.getUserName());
           // System.out.println(u.getTryFlag());


        }
    }
}
