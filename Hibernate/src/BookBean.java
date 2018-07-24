import javax.persistence.*;

/**
 * @ClassName BookBean
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/24 下午3:30
 * @Version 1.0
 **/
@Entity
@Table(name = "t_book")
public class BookBean {
    private int id;
    private String bookName;
    private String bookPrice;
    private UserBean ub;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "b_u_id")
    public UserBean getUb() {
        return ub;
    }

    public void setUb(UserBean ub) {
        this.ub = ub;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "b_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "b_name")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Column(name = "b_price")
    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }
}
