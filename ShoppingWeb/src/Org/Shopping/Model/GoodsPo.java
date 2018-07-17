package Org.Shopping.Model;

public class GoodsPo {
    private int id;
    private int tid;
    private String gname;
    private String gpic;
    private String details;
    private double price;
    private String tname;
    private String detailImg;

    public String getDetailImg() {
        return detailImg;
    }

    public void setDetailImg(String detailImg) {
        this.detailImg = detailImg;
    }

    public GoodsPo() {
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGpic() {
        return gpic;
    }

    public void setGpic(String gpic) {
        this.gpic = gpic;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GoodsPo(int id,int tid, String gname, String gpic, double price) {
        this.id=id;
        this.tid = tid;
        this.gname = gname;
        this.gpic = gpic;
        this.price = price;
    }

    public GoodsPo(int id, int tid, String gname, String gpic, String details, double price, String tname, String detailImg) {
        this.id = id;
        this.tid = tid;
        this.gname = gname;
        this.gpic = gpic;
        this.details = details;
        this.price = price;
        this.tname = tname;
        this.detailImg = detailImg;
    }

    public GoodsPo(int id, String gname, String details, double price, String detailImg) {
        this.id = id;
        this.gname = gname;
        this.details = details;
        this.price = price;
        this.detailImg = detailImg;
    }
}
