package org.home.DayOne;

public class numTest {
    public static void main(String[] args) {

        for(int i=2;i<=100;i++){
            int s=0;
            for(int j=1;j<i;j++) {
                if ((i % j) == 0) {
                    s = s + j;
                }
            }
                    if(s==i) {
                        System.out.println(i);
                    }


            }
        }

}
