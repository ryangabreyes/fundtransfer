package com.gcash.model;

import java.util.List;
import java.util.Map;

public class ScheduleResponse {

    private String result_code;
    private String result_message;
    private String result_namespace;
    private List<Schedule> schedules;
    private Map<String,String> extendInfo;

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getResult_message() {
        return result_message;
    }

    public void setResult_message(String result_message) {
        this.result_message = result_message;
    }

    public String getResult_namespace() {
        return result_namespace;
    }

    public void setResult_namespace(String result_namespace) {
        this.result_namespace = result_namespace;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Map<String, String> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String, String> extendInfo) {
        this.extendInfo = extendInfo;
    }
}