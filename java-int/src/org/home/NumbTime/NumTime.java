package org.home.NumbTime;

public class NumTime {
    public static void main(String[] args) {
        StringTime("aabbccaabbccaabbcc","bb");
    }
    public static void StringTime(String a,String b){
        int j=0;
        String c=a.replace(b,"");
        j=b.length();

        System.out.println((a.length()-c.length())/j);
    }
}
