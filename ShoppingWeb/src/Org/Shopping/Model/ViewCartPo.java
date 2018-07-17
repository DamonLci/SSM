package Org.Shopping.Model;

public class ViewCartPo {
    private int uid;
    private int gid;
    private int amount;
    private String gname;
    private String gpic;
    private double price;

    private String tname;

    public ViewCartPo() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public ViewCartPo(int uid, int gid, int amount, String gname, String gpic, double price, String tname) {
        this.uid = uid;
        this.gid = gid;
        this.amount = amount;
        this.gname = gname;
        this.gpic = gpic;
        this.price = price;
        this.tname = tname;
    }
}
