package org.home.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        StudentList sts=new StudentList();
       // sts.ArryayTest();
        sts.HashTest();
    }

    public void ArryayTest() {
        Student st0 = new Student("张三", "3年2班", 89);
        Student st1 = new Student("李四", "3年1班", 90);
        Student st2 = new Student("王麻子", "3年3班", 54);
        Student st3 = new Student("李五", "3年3班", 78);
        Student st4 = new Student("王大", "3年2班", 57);
        ArrayList<Student> sts = new ArrayList<>();
        sts.add(st0);
        sts.add(st1);
        sts.add(st2);
        sts.add(st3);
        sts.add(st4);
        for (Student st : sts) {
            if (st.getTestScore() < 60) {
                System.out.println("不及格的人" + st.getName() + "班级" + "成绩" + st.getTestScore());
            }
        }
    }
    public void HashTest(){
        HashMap<String , Double > hm=new HashMap<String, Double>();
        hm.put("张三",89.00);
        hm.put("李四",90.00);
        hm.put("王麻子",54.00);
        hm.put("李五",78.00);
        hm.put("王大",57.00);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
    }
}
