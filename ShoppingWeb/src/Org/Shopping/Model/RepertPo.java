package Org.Shopping.Model;

public class RepertPo {
    private int id;
    private int gid;
    private String gnumber;
    private String gin;

    public RepertPo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGnumber() {
        return gnumber;
    }

    public void setGnumber(String gnumber) {
        this.gnumber = gnumber;
    }

    public String getGin() {
        return gin;
    }

    public void setGin(String gin) {
        this.gin = gin;
    }

    public RepertPo(int id, int gid, String gnumber, String gin) {
        this.id = id;
        this.gid = gid;
        this.gnumber = gnumber;
        this.gin = gin;
    }
}
