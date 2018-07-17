package org.home.Exception;

public class UserModel {

    private static final long serialVersionUID = 1L;
    private int userId;
    private String userName;
    private int age;
    private double price;
    private int userCardId;
    private int userTotal;
    private int userPriceTotal;


    class LowAgeException extends Exception{
        public LowAgeException(String message) {
            super(message);
        }
    }
    class HeightAgeException extends Exception{
        public HeightAgeException(String message) {
            super(message);
        }
    }
    class NullException extends Exception{
        public NullException(String message) {
            super(message);
        }
    }
    class LowSalaryException extends Exception{
        public LowSalaryException(String message) {
            super(message);
        }
    }
    class HighSalaryException extends Exception{
        public HighSalaryException(String message) {
            super(message);
        }
    }


    public void testEx(int userId, String userName, int age) throws Exception {
        this.userId = userId;
        if(userName == null){
            throw new NullException("NullPoionter");
        }else{
            this.userName = userName;
        }
            if(age<18) {
                throw  new LowAgeException("LowAgeException");

            }else if(age>80){
                throw  new HeightAgeException("HighAgeException");
            }else{
                this.age=age;
            }

            }
    public void testE(int age) throws Exception {

        if(age<18) {
            throw  new LowAgeException("LowAgeException");

        }else{
            System.out.println("嘻嘻");
        }

    }

    public UserModel(double price, int userCardId) throws Exception{
        if(price<600){
            throw new LowSalaryException("LowPrice");
        }
        else {
            this.price = price;
        }
        this.userCardId = userCardId;
    }

    public void AddSarlary(double addSarlary) throws Exception {
        UserModel um = new UserModel();
        if (addSarlary + um.getPrice() < um.getUserPriceTotal()) {
        } else {
            throw new HighSalaryException("增加工资有异常");
        }
    }
    public void minusSarlary(double minuxSarlary) throws  Exception{
        UserModel um=new UserModel();
            if(um.getPrice()-minuxSarlary<um.getUserPriceTotal()/um.getUserTotal()){
                throw new LowSalaryException("最低工资有问题");
            }
        }

    public void showTotalSarlary() throws  Exception{
        UserModel um=new UserModel();

            if(um.getUserPriceTotal()==0){
                throw  new Exception("工资为0");
            }
    }



    public UserModel() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(int userTotal) {
        this.userTotal = userTotal;
    }

    public int getUserPriceTotal() {
        return userPriceTotal;
    }

    public void setUserPriceTotal(int userPriceTotal) {
        this.userPriceTotal = userPriceTotal;
    }

    public int getUserCardId() {
        return userCardId;
    }

    public void setUserCardId(int userCardId) {
        this.userCardId = userCardId;
    }

    public UserModel(int userId, String userName, int age, double price, int userCardId, int userTotal, int userPriceTotal) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.price = price;
        this.userCardId = userCardId;
        this.userTotal = userTotal;
        this.userPriceTotal = userPriceTotal;
    }
}
