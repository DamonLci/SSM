package org.dao;

import org.apache.ibatis.session.SqlSession;
import org.po.TeacherPo;
import org.utils.MybatisUtils;

public class TeacherDao implements TeacherDaoImp {
    @Override
    public TeacherPo queryById(int id) {
        SqlSession session=MybatisUtils.getSession();
        TeacherPo teacherPo=null;
        try {
            teacherPo=session.selectOne("queryJoin",id);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }

        return teacherPo;
    }
}
