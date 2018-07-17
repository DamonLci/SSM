package org.po;

public class TeacherPo {
    private int t_id;
    private String t_name;
    private StudentPo studentPo;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public StudentPo getStudentPo() {
        return studentPo;
    }

    public void setStudentPo(StudentPo studentPo) {
        this.studentPo = studentPo;
    }

    @Override
    public String toString() {
        return "TeacherPo{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                ", studentPo=" + studentPo +
                '}';
    }
}
