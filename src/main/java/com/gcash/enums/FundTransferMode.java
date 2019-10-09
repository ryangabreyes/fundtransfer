package com.gcash.enums;

public enum FundTransferMode {

    WEEKLY("weekly"),
    MONTHLY("monthly"),
    DAILY("daily"),
    FIXED("fixed");

    private final String mode;

    private FundTransferMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

}
