import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName OrderBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/23 上午11:12
 * @Version 1.0
 **/
public class OrderBean {
    private int id;
    private Date da;
    private String address;
    private Set<StudentBean> st=new HashSet<StudentBean>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDa() {
        return da;
    }

    public void setDa(Date da) {
        this.da = da;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<StudentBean> getSt() {
        return st;
    }

    public void setSt(Set<StudentBean> st) {
        this.st = st;
    }
}
