package com.gcash.model;

import com.gcash.enums.FundTransferMode;

public class Schedule {

    private String every;

    private FundTransferMode mode;

    private String time;

    public String getEvery() {
        return every;
    }

    public void setEvery(String every) {
        this.every = every;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public FundTransferMode getMode() {
        return mode;
    }

    public void setMode(FundTransferMode mode) {
        this.mode = mode;
    }
}
