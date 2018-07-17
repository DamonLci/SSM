package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.UserData;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
    public void TicketCopy(ArrayList<UserData> ud){
        System.out.println("凭条打印中........");
        for (UserData u:ud){
            System.out.println("您的账户ID:"+u.getUserName());
            System.out.println("您的账户余额"+u.getTotalMoney());
            System.out.println("您的此次交易时间"+u.getLogInTime());
            System.out.println("您的此次交易金钱"+u.getActionMoney());
            System.out.println("凭条打印完毕");
            MeunUi me=new MeunUi();
            me.SubMeunUi(ud);
            break;

    }
    }
    public void TicketOr(ArrayList<UserData> ud){
        System.out.println("是否打印凭条");
        System.out.println("1,打印");
        System.out.println("2,退出系统");
        System.out.println("3,回到首页");
        Scanner sc=new Scanner(System.in);
        int i;
        try {
            i = sc.nextInt();
            switch (i){
                case 1:
                    TicketCopy(ud);
                case 2:
                    exit();
                case 3:
                    MeunUi me=new MeunUi();
                    me.SubMeunUi(ud);

            }

        }catch (Exception e){
            System.out.println("请输入正确的数字");

        }
    }
    public void exit(){
        System.exit(0);
    }
}
