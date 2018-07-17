package org.home.Exception;

public class MyException extends Exception {
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }

    public static void main(String[] args) throws MyException {//消极异常处理
        System.out.println("ddd");
        if (3 > 2){
            try {
                System.out.println("3333");
                //积极异常处理
                throw new MyException("你的余额不足。");
            } catch (Exception e) {
                //System.out.println( e.getMessage());
               // e.printStackTrace();
            }
        }
    }
}