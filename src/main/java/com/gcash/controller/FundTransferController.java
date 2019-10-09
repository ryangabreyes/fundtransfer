package com.gcash.controller;

import com.gcash.model.FundTransferRequest;
import com.gcash.model.FundTransferResponse;
import com.gcash.model.ScheduleRequest;
import com.gcash.model.ScheduleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundTransferController {

    @PostMapping(path="/addSchedule")
    public FundTransferResponse addSchedule(@RequestBody FundTransferRequest request) {
        FundTransferResponse response = new FundTransferResponse();

        return response;
    }

    @PostMapping(path="/getSchedule")
    public ScheduleResponse getSchedule(@RequestBody ScheduleRequest request) {
        ScheduleResponse response = new ScheduleResponse();

        return response;
    }


}
