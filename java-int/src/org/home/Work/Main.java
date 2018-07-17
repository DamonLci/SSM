package org.home.Work;

public class Main {
    public void Testo(){

        System.out.println("you know what you konw ,you dont know everything");
    }
    public void testone(String username){
        String user="旺达";

        System.out.println(username+"，下午好");
        if(user.equals("旺达"))

            return;
            System.out.println("对了");



    }
    public static void main(String[] args) {
        /**
         * 十转二
         */

        int x=3572;
        String str = Integer.toBinaryString(x) ;
        System.out.println(str);
        /**
         * 二转十
         */


        int y3=Integer.valueOf("10111010",2);
        System.out.println(y3);
        /**
         * byte
         */
        byte a=1;
        a+=1;
        byte b=1;
        int c=b+1;
        System.out.println(c);

        System.out.println(a);
        /**
         * int char byte
         * int类型强转 byte 还是-1
         * byte 强转-1  但是-1不在ascii表里 所以默认是 -  1两个字符 就是16bit
         * 所以转换成出来就是 2的16次方-1
         */
        System.out.println((int)(char) (byte) -1);

        /**
         * 2.00-1.10
         *
         *
         */
        double s=2.00;
        double j=1.10;
        System.out.println(s-j);







    }



}
