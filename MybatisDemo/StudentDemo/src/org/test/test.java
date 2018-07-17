package org.test;

import org.dao.TeacherDao;
import org.dao.TeacherDaoImp;
import org.junit.Test;
import org.po.TeacherPo;

public class test {
    @Test
    public void test(){
       TeacherDaoImp ta=new TeacherDao();
       TeacherPo taa=ta.queryById(1);
        System.out.println(taa);

    }
}
