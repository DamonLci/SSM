package org.home.DayOne;

public class BookTest {
    public static void main(String[] args) {

        Book bk1=new Book("魔兽世界","人民出版社",100.00,210);
        Book bk2=new Book("传奇","机械工业出版社",110.00,220);
        Book bk3=new Book("魔兽争霸","清华大学出版社",120.00,230);
        Book bk4=new Book("流星蝴蝶剑","清华大学",130.00,240);
        Book bk5=new Book("红警","人民",140.00,250);
        Book[] books=new Book[5];
        books [0]=bk1;
        books [1]=bk2;
        books [2]=bk3;
        books [3]=bk4;
        books [4]=bk5;
        for(Book bk:books){
            if(bk.getBookPrice()>100 && bk.getBookPublish().equals("清华大学出版社")) {
                System.out.println("名字"+bk.getBookName());
                System.out.println("价格"+bk.getBookPrice());
                System.out.println("出版社"+bk.getBookPublish());
                System.out.println("卖出了"+bk.getBookSold());
            }
        }
    }

}