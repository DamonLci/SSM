package org.home.ATM.Model.Model;

public class UserData {
    private String UserName;
    private String UserPasswd;
    private String LogOffTime;
    private String LogInTime;
    private String RegiTime;
    private String CancleTime;
    private double ActionMoney;
    private double TotalMoney;
    private double SumMoeny;
    private int LoFlag;
    private int TryFlag;

    public UserData(){
    }

    public UserData(String userName, String userPasswd, String logOffTime, String logInTime, String regiTime, String cancleTime, double actionMoney, double totalMoney, double sumMoeny, int loFlag, int tryFlag) {
        UserName = userName;
        UserPasswd = userPasswd;
        LogOffTime = logOffTime;
        LogInTime = logInTime;
        RegiTime = regiTime;
        CancleTime = cancleTime;
        ActionMoney = actionMoney;
        TotalMoney = totalMoney;
        SumMoeny = sumMoeny;
        LoFlag = loFlag;
        TryFlag = tryFlag;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getUserPasswd() {
        return UserPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.UserPasswd = userPasswd;
    }

    public String getLogOffTime() {
        return LogOffTime;
    }

    public void setLogOffTime(String logOffTime) {
        this.LogOffTime = logOffTime;
    }

    public String getLogInTime() {
        return LogInTime;
    }

    public void setLogInTime(String logInTime) {
        this.LogInTime = logInTime;
    }

    public String getRegiTime() {
        return RegiTime;
    }

    public void setRegiTime(String regiTime) {
        this.RegiTime = regiTime;
    }

    public String getCancleTime() {
        return CancleTime;
    }

    public void setCancleTime(String cancleTime) {
        this.CancleTime = cancleTime;
    }

    public double getActionMoney() {
        return ActionMoney;
    }

    public void setActionMoney(double actionMoney) {
        this.ActionMoney = actionMoney;
    }

    public double getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.TotalMoney = totalMoney;
    }

    public double getSumMoeny() {
        return SumMoeny;
    }

    public void setSumMoeny(double sumMoeny) {
        this.SumMoeny = sumMoeny;
    }

    public int getLoFlag() {
        return LoFlag;
    }

    public void setLoFlag(int loFlag) {
        this.LoFlag = loFlag;
    }

    public int getTryFlag() {
        return TryFlag;
    }

    public void setTryFlag(int tryFlag) {
        this.TryFlag = tryFlag;
    }
}
