package org.home.DayOne;

public class Book {
    private String bookName;
            private String bookPublish;
            private double bookPrice;
            private int bookSold;

    public Book() {
            }

    public Book(String bookName, String bookPublish, double bookPrice, int bookSold) {
                this.bookName = bookName;
                if(bookPublish=="人民出版社" || bookPublish=="机械工业出版社"|| bookPublish=="清华大学出版社"){
                    this.bookPublish = bookPublish;
                }
                else{
                    System.out.println("出版社错误");
                    return ;
                }
                if(bookPrice>0){
                    this.bookPrice = bookPrice;
        }else{
            System.out.println("价格必须大于0");
            return ;
        }
        if(bookSold>0){
            //this.boowkSold = bookSold;
        }else{
            System.out.println("销量必须大于0");
            return ;
        }
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookPublish() {
        return bookPublish;
    }
    public void setBookPublish(String bookPublish) {

    }
    public double getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(double bookPrice) {


    }
    public int getBookSold() {
        return bookSold;
    }
    public void setBookSold(int bookSold) {

    }
}
