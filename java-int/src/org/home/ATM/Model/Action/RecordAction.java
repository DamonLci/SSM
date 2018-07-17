package org.home.ATM.Model.Action;

import org.home.ATM.Model.Model.UserData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class RecordAction {
    public void Rocord(ArrayList<UserData> ud){
        for(UserData u:ud) {
            String time=u.getLogInTime();
            String mo = time.substring(5, 7);
            String year=time.substring(0,4);
            int mos=Integer.parseInt(mo);
            int yea=Integer.parseInt(year);
            Calendar cal = Calendar.getInstance();
            int years = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH )+1;
            if(yea==years){
                if(mos==month){
                    System.out.println("交易记录");
                    System.out.println("交易金额"+u.getActionMoney());
                    System.out.println("交易时间"+u.getLogInTime());
                }

            }

        }
    }
}
