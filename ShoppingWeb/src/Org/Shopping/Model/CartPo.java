package Org.Shopping.Model;

public class CartPo {
    private int id;
    private int uid;
    private int gid;
    private int amount;

    public CartPo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public CartPo(int id, int uid, int gid, int amount) {
        this.id = id;
        this.uid = uid;
        this.gid = gid;
        this.amount = amount;
    }
}
