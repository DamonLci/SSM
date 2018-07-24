import java.util.Date;

/**
 * @ClassName StOrBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/23 下午3:12
 * @Version 1.0
 **/
public class StOrBean {
    private int id;
    private StudentBean studentBean;
    private OrderBean orderBean;
    private Date da;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentBean getStudentBean() {
        return studentBean;
    }

    public void setStudentBean(StudentBean studentBean) {
        this.studentBean = studentBean;
    }

    public OrderBean getOrderBean() {
        return orderBean;
    }

    public void setOrderBean(OrderBean orderBean) {
        this.orderBean = orderBean;
    }

    public Date getDa() {
        return da;
    }

    public void setDa(Date da) {
        this.da = da;
    }
}
