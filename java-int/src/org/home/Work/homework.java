package org.home.Work;

import java.util.Scanner;

public class homework {
    /**
     * 水仙花
     */
    public void sxh(){
        int i,j,k,l,m;
        for(i=100;i<=999;i++){
            j=i/100;
            k=i/10%10;
            l=i%10;
            if(j*j*j+k*k*k+l*l*l == i){
              /*  System.out.println(j);
                System.out.println(k);
                System.out.println(l);*/
                System.out.println("水仙花"+i);
            }
        }
    }

    /**
     *买东西
     */
    public double buys(){
        double sum=205.5;
        double shen=sum-30-20-20-20;
        return shen;
    }

    /**
     * 球的文图
     * @param
     */
    public int qiu(){
        int red=5;
        int black= 7;
        int white =10;
        int count=0;
        for(red=0;red<=5;red++){
            for(black=0;black<=7;black++){
                for(white=0;white<=10;white++){
                    if(red+black+white==12){
                        count++;

                    }

                }

            }
        }
        return count;
    }

    /**
     * 纸币
     */
    public void zb(){
        int su=100;
        int one=1;
        int two =2;
        int five=5;
        // i 1分个数 j 2分个数 k 5分个数 total 总数 50;
        int i,j,k,total=50,as,bs,cs;
        int count = 0;
        for(i=0;i<=total;i++){
            as=i*one;
            for(j=0;j<=total-i;j++){
                bs=j*two;
                for(k=0;k<=total-i-j;k++){
                    cs=k*five;
                    if(as+bs+cs==su){

                        System.out.println("一分有"+i+"个"+"2分有"+j+"个"+"5分有"+k+"个");
                        count++;


                    }

                }
            }
        }
        System.out.println("一共有"+count+"次");
    }
    public void yx(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        String as=sc.next();
        int i,j=0,k=0;
        int cha;
        for(i=0;i<as.length();i++){
            cha=as.charAt(i);
            if(cha >=48 && cha <=57 || cha ==46 || cha == 45){

                if(cha == 46){
                    j++;
                }
                if(cha==45){
                    k++;
                }
                if(j>1 || k>1){
                    System.out.println("不符合1");
                    break;
                }
                if(k==1 && as.charAt(0)!=45){
                    System.out.println("不符合2");
                    break;
                }
                if(j==0 && as.charAt(0)==48){
                    System.out.println("不符合3");
                    break;
                }
                if(k==1 && as.charAt(1) == 46){
                    System.out.println("不符合4");
                    break;
                }


            }else{
                System.out.println("不符合5");
                break;
            }
            if(i==as.length()-1){
                System.out.println("有效数字");
                break;
            }
        }

    }
    public void dx(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串数字");
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            int b = sc.nextInt();
            a[i] = b;
        }
        System.out.println(a[1]);
        for (int j=5;j>=0;j++){
            System.out.println(a[j]);

        }
        // System.out.println(bs);


    }
    public int zc(){
        int i;
        int count=0;
        for (i=0;i<=100;i++){
            if(i%3 == 0 && i% 5 == 0 ){
                count = count +i;
            }
        }
        return count;
    }

    /**
     * 直角三角形
     */
    public void stat(){
        int i,j;
        for(i=1;i<=7;i++){
            if(i %2 !=0){
                for(j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    /**
     * 等腰三角形
     */
    public void dy(){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 菱形
     *
     */

    public void lx(){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=3;i>=1;i--){
            for(j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public void sz(){
        int count=0;
        int szz[]={8,4,2,1,23,344,12};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int as=Integer.parseInt(sc.next());
        for(int i=0;i<szz.length;i++){
           // count=count+szz[i];
            //System.out.println(szz[i]);
            if(as==szz[i]){

                System.out.println("存在你输入的这个数字");
                break;
            }

        }
        System.out.println("抬走 下一个");





       // System.out.println(count);


    }

    public static void main(String[] args) {
        homework hm=new homework();
        /*hm.sxh();
        double y=hm.buys();
        System.out.println(y);
        int x=hm.qiu();
        System.out.println(x);*/
       //hm.sz();
        //hm.zb();
        //hm.yx();
       // hm.dx();
        /*int s=hm.zc();
        System.out.println(s);*/
        //hm.stat();
        hm.dy();
        //hm.lx();
    }
}
