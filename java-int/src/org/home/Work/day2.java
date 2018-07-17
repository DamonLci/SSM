package org.home.Work;

public class day2 {
    public void arrylist(int [] ages){
        int i,j;
        //外层循环
        for(i=0;i<ages.length-1;i++){
         //内层循环
            for(j=0;j<i;j++){
                if(ages[j+1]<ages[j]){
                    int temp=ages[j];
                    ages[j]=ages[j+1];
                    ages[j+1]=temp;
                }
            }
        }

    }

 /* public static int binarysearch(int ages[],int index,int low,int middle,int high){
        if(low>high || index>high|| middle>high){
            return -99;
        }e


    }*/
    public static void main(String[] args) {


    }
}
