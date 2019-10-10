package com.gcash.controller;

import com.gcash.mapper.ScheduleMapper;
import com.gcash.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundTransferController {

    private ScheduleMapper scheduleMapper;

    public FundTransferController(ScheduleMapper scheduleMapper) {
        this.scheduleMapper = scheduleMapper;
    }

    @PostMapping("/addSchedule")
    public FundTransferResponse addSchedule(@RequestBody FundTransferRequest request) {

        for(Schedule schedule : request.getSchedules()) {

        }


        FundTransferResponse response = new FundTransferResponse();



        return response;
    }

    @PostMapping("/getSchedule")
    public ScheduleResponse getSchedule(@RequestBody ScheduleRequest request) {
        ScheduleResponse response = new ScheduleResponse();

        response.setSchedules(scheduleMapper.getAllSchedule());

        return response;
    }


}
