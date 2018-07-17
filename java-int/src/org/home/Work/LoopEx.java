package org.home.Work;

import java.util.Scanner;

public class LoopEx {
    /**
     * For循环
     */
    static void ForEx(){
        double highe=1.9;
        //true 快 false 慢
        boolean speed=true;
        if(highe >= 1.8 && speed == true){
            System.out.println("符合参赛资格");
        }else {
            System.out.println("不符合参赛资格");
        }
    }
    /**
     * 循环条件
     */
    static void Whilee(){
        boolean logoflag=true;
        String user="damon";
        String pass="1234";
       // int flags=0;
        Scanner input=new Scanner(System.in);
        for (int flags=0;flags<3;flags++) {
            System.out.println("请输入账号");
            String users=input.next();
            if(users.equals(user)){
                System.out.println("请输入密码");
                String passw=input.next();
                if(passw.equals(pass)){
                    System.out.println("登录成功");
                    break;
                }
                else{
                    System.out.println("密码错误");
                }
            }
            else{
                System.out.println("账号错误");
            }


            System.out.println("Login more ,Please try again later");
        }
    }
     static void add(){
        int s=0;
        for(int i=100;i<=500;i++){
            s=s+i;
        }
        System.out.println(s);
    }
   public static void jugde(){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个字符");
        String as=sc.next();
        int ab= as.charAt(0);
        if( ab >=97 &&  ab<=122){
            System.out.println("小写的");
        }else if(ab >=48 && ab<=57){
            System.out.println("数字");
        }else if(ab >=65 && ab <=90){
            System.out.println("大写");
        }else  {

            System.out.println("其他的符号");
        }


    }

    public int  sc(int a,int b) {

        return a+b;

    }
    public float sc(float a,float b){

        return a+b;
    }

    public static void main(String[] args) {
        //ForEx();
        //Whilee();
        //add();
        //jugde();
/*      double a= 0.1;
        double b= 0.2;
        double c=0.1;
        double d=0.3;
        System.out.println(a+b);
        System.out.println(c+d);*/
       // Main m= new Main();
       // m.Testo();
        // m.testone("杜拉拉");
        LoopEx l=new LoopEx();
        int sd=l.sc(1,1);
        float sz=l.sc(1.0F,1.0F);

        System.out.println(sd);
        System.out.println(sz);


    }
}
