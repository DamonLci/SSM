package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.UserData;
import org.home.ATM.Model.TimeAction;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreAction {
    public ArrayList<UserData> store(ArrayList<UserData> ud) {
        System.out.println("********欢迎进入ATM取款系统********");
        System.out.println("请输入你要存的金额");
        Scanner sc = new Scanner(System.in);
        try {
            double i = sc.nextDouble();
            if (i > 0) {
                for (UserData u : ud) {

                    double to = u.getTotalMoney() + i;
                    double TotalMoney = u.getTotalMoney();
                    TotalMoney = TotalMoney + i;
                    u.setTotalMoney(to);
                    TimeAction tm = new TimeAction();
                    u.setLogInTime(tm.TimeStAction());
                    u.setActionMoney(i);
                    u.setTotalMoney(TotalMoney);
                    MeunUi me = new MeunUi();
                    Ticket tk = new Ticket();
                    tk.TicketOr(ud);
                    return ud;
                }
            } else {
                System.out.println("请重新输入");
                return store(ud);
            }

        } catch (Exception e) {
            System.out.println("请重新输入");
            return store(ud);

        }
        return null;

    }
}
