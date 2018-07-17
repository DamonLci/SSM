package org.home.Goods;

public class Goods {
    private String goodName;
    private int price;

    public Goods() {
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Goods(String goodName, int price) {
        this.goodName = goodName;
        this.price = price;
    }

    public static void main(String[] args) {
        String goodName="魔兽";
        int price=30;
        String goodname1="魔兽";
        int price1=30;
        Goods g=new Goods();
        System.out.println(goodName.equals(goodname1));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Goods g=(Goods)obj;
        if(this.getGoodName().equals(g.getGoodName()) && this.getPrice()==g.getPrice()){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return goodName.hashCode()+price;
    }
}
