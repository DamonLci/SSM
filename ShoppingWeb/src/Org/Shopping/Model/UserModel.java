package Org.Shopping.Model;

public class UserModel {
    private int uid;
    private String account;
    private String pass;
    private String portrit;
    private double balance;

    public UserModel() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPortrit() {
        return portrit;
    }

    public void setPortrit(String portrit) {
        this.portrit = portrit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public UserModel(int uid, String account, String pass) {
        this.uid = uid;
        this.account = account;
        this.pass = pass;
    }

    public UserModel(int uid, String account, String pass, String portrit, double balance) {
        this.uid = uid;
        this.account = account;
        this.pass = pass;
        this.portrit = portrit;
        this.balance = balance;
    }
}
