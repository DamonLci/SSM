package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.DateBase;
import org.home.ATM.Model.Model.UserData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.home.ATM.Model.Action.UserNameJugde;
import org.home.ATM.Model.TimeAction;

public class MeunUi {
    /**
     * 主菜单
     */
    public static int cd() {
        int i;
        System.out.println("********欢迎来到ATM系统********");
        System.out.println("*******请选择你需要的服务*******");
        System.out.println("***********1：注册************");
        System.out.println("***********2：登录************");
        System.out.println("***********3：退出************");
        Scanner sc = new Scanner(System.in);
        try {
            i = sc.nextInt();
            return i;

        } catch (Exception e) {
            System.out.println("你输入的不对");
            cd();
        }
        return 0;
    }

       public static   ArrayList<UserData> ud = new ArrayList<UserData>();
    {
        String userName="april";
        String userPwd="123";
        String LogOffTime = null;
        String LogInTime = null;
        TimeAction tm=new TimeAction();
        String RegiTime = tm.TimeStAction();
        String CancleTime = null;
        double TotalMoney = 10000.00;
        double SumMoney = 0.00;
        double ActionMoney = 0.00;
        int LoFlag=0;
        int TryFlag=0;

        UserData udd = new UserData(userName, userPwd, LogOffTime, LogInTime, RegiTime, CancleTime, ActionMoney, TotalMoney, SumMoney,LoFlag,TryFlag);

        ud.add(udd);
    }


    public static void main(String[] args) {
        MeunUi me=new MeunUi();
        Registe re=new Registe();
        LogAction lg=new LogAction();
        int i;

        i = cd();
        while (i != 0) {
            switch (i) {
                case 1:
                    System.out.println("注册");
                    ud = re.registe(ud);
                    //System.out.println(ud.size());
                    break;
                case 2:
                    System.out.println("登录");
                    //UserData udd=new UserData();
                    lg.log(ud);
                    break;
                case 3:
                    MeunUi mu=new MeunUi();
                    mu.exit();

                default:
                    System.out.println("没有找到此选项");
                    break;
            }
            i = cd();
        }

    }
    public static void test(ArrayList<UserData> ud){
    }

    /**
     * 注册菜单
     */

    /**
     * 登录
     */


    public void SubMeunUi(ArrayList<UserData> ud) {

        int i;
        System.out.println("********欢迎进入ATM系统********");
        System.out.println("********1：取款********");
        System.out.println("********2：存款********");
        System.out.println("********3：查询余额********");
        System.out.println("********4：转账********");
        System.out.println("********5：修改密码********");
        System.out.println("********6：挂失********");
        System.out.println("********7：退出系统********");
        System.out.println("********8：交易记录********");
        Scanner scc = new Scanner(System.in);
        StoreAction st=new StoreAction();
        DrawAction dr=new DrawAction();
        ChangePwdAction cpa=new ChangePwdAction();
        RecordAction re=new RecordAction();
        try {
            i = scc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("取款");
                    dr.draw(ud);
                    break;
                case 2:
                    System.out.println("存款");
                    st.store(ud);
                    break;
                case 3:
                    System.out.println("查询余额");
                    query(ud);
                    break;
                case 4:
                    transferCard();
                    System.out.println("转账");
                    break;
                case 5:
                    //System.out.println("修改密码");
                    cpa.changePwd(ud);
                    break;
                case 6:
                    LoosCard ls=new LoosCard();
                    ls.LoosCard(ud);
                    break;
                case 7:
                    System.out.println("退出系统");
                    exit();
                    break;
                case 8:
                    re.Rocord(ud);
                    break;
                default:
                    System.out.println("没有找到此选项");
                    SubMeunUi(ud);
                    break;
            }
        }catch (Exception e){
            System.out.println("请输入正确的数字");
            SubMeunUi(ud);
        }


    }


    /**
     * 取款
     */



    /**
     * 查询
     */
    public void query(ArrayList<UserData> ud) {
        System.out.println("********欢迎进入ATM取款系统********");
        System.out.print("********您的余额还有");
        for (UserData u : ud) {
            u.getTotalMoney();
            System.out.println(u.getTotalMoney() + "元");
            SubMeunUi(ud);
        }
    }

    /**
     * 存款
     */

    /**
     * 修改密码
     */

    /**
     * 转账
     */
    public void transferCard(){
        System.out.println("转账系统");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入对方的账号ID");
        String userCard=sc.next();
        UserNameJugde uj=new UserNameJugde();
        if(uj.judgeUserName(userCard)==true){
            System.out.println("请输入转账金额");
            try {
                int money=sc.nextInt();
                for(UserData u:ud){
                }
            }catch (Exception e){
                System.out.println("请输入数字");
                transferCard();
            }
        }
        System.out.println("你输入的账号ID不合法");
        transferCard();

    }




    /**
     * 退出
     */
    public void exit(){
        System.exit(0);
    }

}




