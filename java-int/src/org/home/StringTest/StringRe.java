package org.home.StringTest;

public class StringRe {
    public static void main(String[] args) {
        String b="asdfghj";
        char [] ch=b.toCharArray();
        System.out.println(reverseArray(ch,1,5));
    }
    public void ReString(){
        String a = "abcdefg";
        char[] ch = a.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {

            System.out.printf(String.valueOf(ch[i]));
        }
    }

    public static String reverseArray(char [] ch,int start,int end){
        for(int i = start,j = end;i < j;i++,j--){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }
}
