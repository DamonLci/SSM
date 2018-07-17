package org.bms.bean;

import java.util.Date;

public class BookBean {
    private int bookId;
    private String bookName;
    private String bookImg;
    private String bookAuthor;
    private String bookPublish;
    private Date bookPublishTime;
    private double bookPrice;
    private int bookCount;
    private String bookDescribe;

    public BookBean() {
    }

    public BookBean(String bookName, String bookImg, String bookAuthor, String bookPublish, Date bookPublishTime, double bookPrice, int bookCount, String bookDescribe) {
        this.bookName = bookName;
        this.bookImg = bookImg;
        this.bookAuthor = bookAuthor;
        this.bookPublish = bookPublish;
        this.bookPublishTime = bookPublishTime;
        this.bookPrice = bookPrice;
        this.bookCount = bookCount;
        this.bookDescribe = bookDescribe;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(String bookPublish) {
        this.bookPublish = bookPublish;
    }

    public Date getBookPublishTime() {
        return bookPublishTime;
    }

    public void setBookPublishTime(Date bookPublishTime) {
        this.bookPublishTime = bookPublishTime;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public String getBookDescribe() {
        return bookDescribe;
    }

    public void setBookDescribe(String bookDescribe) {
        this.bookDescribe = bookDescribe;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookImg='" + bookImg + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublish='" + bookPublish + '\'' +
                ", bookPublishTime=" + bookPublishTime +
                ", bookPrice=" + bookPrice +
                ", bookCount=" + bookCount +
                ", bookDescribe='" + bookDescribe + '\'' +
                '}';
    }
}
