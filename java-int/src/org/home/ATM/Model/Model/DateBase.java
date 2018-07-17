package org.home.ATM.Model.Model;

public class DateBase {
    public String UserName;
    public double ActionMoney;
    public double TotalMoney;
    public double SumMoeny;
    public int ActionId;

    public DateBase() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public double getActionMoney() {
        return ActionMoney;
    }

    public void setActionMoney(double actionMoney) {
        ActionMoney = actionMoney;
    }

    public double getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        TotalMoney = totalMoney;
    }

    public double getSumMoeny() {
        return SumMoeny;
    }

    public void setSumMoeny(double sumMoeny) {
        SumMoeny = sumMoeny;
    }

    public int getActionId() {
        return ActionId;
    }

    public void setActionId(int actionId) {
        ActionId = actionId;
    }

    public DateBase(String userName, double actionMoney, double totalMoney, double sumMoeny, int actionId) {
        UserName = userName;
        ActionMoney = actionMoney;
        TotalMoney = totalMoney;
        SumMoeny = sumMoeny;
        ActionId = actionId;
    }
}
