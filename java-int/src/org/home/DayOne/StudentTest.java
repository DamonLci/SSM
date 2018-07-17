package org.home.DayOne;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] st = new Student[6];

        for (int i=1;i<=st.length;i++) {
            System.out.println("请输入第"+i+"个学生");
            System.out.println("请输入名字");
            Scanner sc = new Scanner(System.in);
            Student sts=new Student();
            String name1=sc.next();
            sts.setUserName(name1);
            System.out.println("请输入ID");
            int uid=sc.nextInt();
            sts.setUserId(uid);
            System.out.println("请输入java成绩");
            int java=sc.nextInt();
            boolean javas=sts.setJava(java);
            while(javas==false) {
                System.out.println("请输入java成绩");
                java=sc.nextInt();
                javas=sts.setJava(java);
            }
            System.out.println("请输入html成绩");
            int html=sc.nextInt();
            boolean htmls=sts.setHtml(html);
            while(htmls==false){
                System.out.println("请输入html成绩");
                html=sc.nextInt();
                htmls=sts.setHtml(html);

            }
            System.out.println("请输入sql成绩");
            int sql=sc.nextInt();
            boolean sqls=sts.setSql(sql);
            while(sqls==false){
                System.out.println("请输入sql成绩");
                sql=sc.nextInt();
                sqls=sts.setSql(sql);
            }
            st[i]=sts;

        }
        StudentTest sts=new StudentTest();
        sts.Avg(st);


    }
    public void Avg(Student [] st){
        double max=0;
        double min=0;
        String as="";
        String bs="";
        for(Student s:st){
            double java=s.getJava();
            double html=s.getHtml();
            double sql=s.getSql();
            String name=s.getUserName();
            double avg=(java+html+sql)/3;
            System.out.println("该学生"+name+"的平均成绩为"+avg);
            double sum=java+html+sql;

            if(max<sum){
                max=sum;
                as=s.getUserName();
            }
            if(min>sum){
                min=sum;
                bs=s.getUserName();
            }
        }
        System.out.println("最高分的人是"+as+",最高分是"+max);
        System.out.println("最低分的人是"+bs+",最低分是"+min);
    }


}
