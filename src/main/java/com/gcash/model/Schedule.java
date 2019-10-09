package com.gcash.model;

import com.gcash.enums.FundTransferMode;

public class Schedule {

    private String depositEvery;
    private FundTransferMode mode;

    public FundTransferMode getMode() {
        return mode;
    }

    public void setMode(FundTransferMode mode) {
        this.mode = mode;
    }

    private double amount;

    public String getDepositEvery() {
        return depositEvery;
    }

    public void setDepositEvery(String depositEvery) {
        this.depositEvery = depositEvery;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
