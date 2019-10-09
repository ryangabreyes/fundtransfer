package com.gcash.model;

import java.util.List;

public class FundTransferResponse {

    private String bank_code;
    private String nickname;
    private String gcash_wallet;
    private List<String> fields;
    private String id;
    private String value;
    private List<Schedule> schedules;
    private String result_code;
    private String message;
    private String result_namespace;

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGcash_wallet() {
        return gcash_wallet;
    }

    public void setGcash_wallet(String gcash_wallet) {
        this.gcash_wallet = gcash_wallet;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult_namespace() {
        return result_namespace;
    }

    public void setResult_namespace(String result_namespace) {
        this.result_namespace = result_namespace;
    }
}
