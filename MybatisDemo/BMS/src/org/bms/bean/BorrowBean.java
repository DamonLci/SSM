package org.bms.bean;

public class BorrowBean {
    private int bId;
    private int bUsId;
    private int bBoId;
    private int bCount;

    public BorrowBean() {
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getbUsId() {
        return bUsId;
    }

    public void setbUsId(int bUsId) {
        this.bUsId = bUsId;
    }

    public int getbBoId() {
        return bBoId;
    }

    public void setbBoId(int bBoId) {
        this.bBoId = bBoId;
    }

    public int getbCount() {
        return bCount;
    }

    public void setbCount(int bCount) {
        this.bCount = bCount;
    }

    public BorrowBean(int bId, int bUsId, int bBoId, int bCount) {
        this.bId = bId;
        this.bUsId = bUsId;
        this.bBoId = bBoId;
        this.bCount = bCount;
    }
}
