package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.UserData;
import org.home.ATM.Model.TimeAction;

import java.util.ArrayList;
import java.util.Scanner;

public class DrawAction {
    public ArrayList<UserData> draw(ArrayList<UserData> ud) {
        double ia;
        System.out.println("********欢迎进入ATM取款系统********");
        System.out.println("********请输入你的取款金额********");
        Scanner sc = new Scanner(System.in);
        ia = sc.nextDouble();
        try {

            if (ia > 0) {
                //ArrayList<UserData> uds = new ArrayList<UserData>();

               // UserData udd = new UserData();
                for (UserData u : ud) {

                    double SumMoney = u.getSumMoeny();
                    double TotalMoney = u.getTotalMoney();
                    if(ia<TotalMoney) {
                        SumMoney = SumMoney + ia;
                        TotalMoney = TotalMoney - ia;
                        TimeAction tm=new TimeAction();
                        u.setSumMoeny(SumMoney);
                        u.setTotalMoney(TotalMoney);

                        u.setLogInTime(tm.TimeStAction());
                        u.setActionMoney(-ia);
                /*System.out.println(u.getSumMoeny());
                System.out.println(u.getTotalMoney());
                System.out.println(u.getSumMoeny());*/
                     //UserData udd=new UserData(u.getUserName(),u.getUserPasswd(),u.getLogOffTime(),tm.TimeStAction(),u.getRegiTime(),u.getCancleTime(),-ia,TotalMoney,SumMoney,u.getLoFlag(),u.getTryFlag());
                      // ud.add(udd);
                        Ticket tk=new Ticket();
                        tk.TicketOr(ud);
                        return ud;
                    }
                    else{
                        System.out.println("你取得钱太多了，不够了");
                        break;
                    }

                }
            }
            System.out.println("请重新输入");
            return draw(ud);
        } catch (Exception e) {
            System.out.println("请重新输入");
            return draw(ud);
        }

    }
}
