package org.home.Exception;

public class TestException {
    public static void main(String[] args)  {
    UserModel um=new UserModel();
    try{
        um.testE(10);

    }
    catch (UserModel.LowAgeException lo){
        System.out.println(lo.getMessage());


    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}
