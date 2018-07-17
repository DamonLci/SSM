package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.UserData;

import java.util.ArrayList;
import java.util.Scanner;

public class LoosCard {
    public void LoosCard(ArrayList<UserData> ud) {
        System.out.println("挂失账户");
        System.out.println("请输入您的账户");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        UserNameJugde uj = new UserNameJugde();
        for (UserData u : ud) {
            if (uj.judgeUserName(userName) == true && u.getUserName().equals(userName)) {
                System.out.println("请输入密码");
                String userPwd=sc.next();
                if(uj.judgeUserName(userPwd)==true && u.getUserPasswd().equals(userPwd)){
                    System.out.println("锁定成功");
                    LogAction lg=new LogAction();
                    u.setLoFlag(1);
                    lg.log(ud);
                    break;
                }
                System.out.println("输入的密码不对");
                break;
            }
            System.out.println("输入的账户不对");
        }
    }
}
