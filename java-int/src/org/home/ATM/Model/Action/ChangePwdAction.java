package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.UserData;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangePwdAction {
    public void changePwd(ArrayList<UserData> ud){
        System.out.println("修改密码");
        Scanner sc=new Scanner(System.in);
        MeunUi me=new MeunUi();
        LogAction lg=new LogAction();
        System.out.println("请输入你的原始密码");
        try {
            String i=sc.next();
            for(UserData u:ud){
                if(i.equals(u.getUserPasswd())){
                    System.out.println("请输入新的密码");
                    String newPwd=sc.next();
                    System.out.println("请再一次输入确认密码");
                    String conPwd=sc.next();
                    if(newPwd.equals(conPwd)){
                        System.out.println("密码修改成功，请重新登录");
                        u.setUserPasswd(newPwd);

                        lg.log(ud);
                    }
                    System.out.println("两次密码不对，请重新输入");
                    changePwd(ud);

                }
                System.out.println("密码错误，请重新输入");
                changePwd(ud);

            }
        }catch (Exception e){
            System.out.println("请输入正确形式的密码");
        }


    }
}
