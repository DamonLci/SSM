package org.home.ATM.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAction {
    public void TimeActionClass(int actionTime){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=sdf.format(d);
        System.out.println(time);
        String a=time.substring(5,7);
        int b=Integer.parseInt(a)+actionTime;




    }
    public String  TimeStAction(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=sdf.format(d);
        return time;
    }

    public static void main(String[] args) throws ParseException {

    }
}
