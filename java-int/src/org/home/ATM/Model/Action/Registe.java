package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.UserData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Registe {
    public ArrayList<UserData> registe(ArrayList<UserData> ud) {
        System.out.println("*********欢迎来到注册页面**********");
        System.out.println("********请输入您的登录姓名*********");
        Scanner sc = new Scanner(System.in);
        String UserName = sc.next();
        UserNameJugde uj = new UserNameJugde();
        if (UserName.length() > 0) {
           // System.out.println(ud.size());
            for (UserData u : ud) {
                if (u.getUserName().equals(UserName)==false) {
                    if (uj.judgeUserName(UserName) == true) {
                        System.out.println("请输入密码");
                        String UserPasswd = sc.next();
                        System.out.println("请再次输入密码");
                        String conPwd = sc.next();
                        if (UserPasswd.equals(conPwd)) {
                            if (UserPasswd.length() > 0) {
                                String LogOffTime = null;
                                String LogInTime = null;
                                Date d = new Date();
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                String RegiTime = sdf.format(d);
                                String CancleTime = null;
                                double TotalMoney = 10000.00;
                                double SumMoney = 0.00;
                                double ActionMoney = 0.00;
                                int LoFlag = 0;
                                int TryFlag = 0;
                                UserData udd = new UserData(UserName, UserPasswd, LogOffTime, LogInTime, RegiTime, CancleTime, ActionMoney, TotalMoney, SumMoney, LoFlag, TryFlag);
                                //MeunUi me = new MeunUi();
                                ud.add(udd);
                                //System.out.println(ud.size());
                                System.out.println("注册成功，您注册了一个新账户");
                                return ud;
                            }
                        }
                        System.out.println("两次密码输入不一致");
                        return ud;

                    } else {
                        System.out.println("ID只能为数字或者字母");
                        return ud;
                    }
                }System.out.println("你输入的用户名重复了");
                return ud;
            }
            }
        System.out.println("你没有输入任何东东西");
        return  ud;
    }

    }





