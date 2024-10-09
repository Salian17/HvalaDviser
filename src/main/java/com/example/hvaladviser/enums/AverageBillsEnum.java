package com.example.hvaladviser.enums;

public enum AverageBillsEnum {
    LOW(0),
    MEDIUM(1),
    HIGH(2),
    VERY_HIGH(3);
    private int numOrderStatus;

    AverageBillsEnum(int numOrderStatus) {
        this.numOrderStatus = numOrderStatus;
    }

    public int getNumOrderStatus() {
        return numOrderStatus;
    }

    public void setNumOrderStatus(int numOrderStatus) {
        this.numOrderStatus = numOrderStatus;
    }
}
