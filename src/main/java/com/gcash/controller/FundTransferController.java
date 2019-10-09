package com.gcash.controller;

import com.gcash.model.FundTransferRequest;
import com.gcash.model.FundTransferResponse;
import com.gcash.model.ScheduleRequest;
import com.gcash.model.ScheduleResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundTransferController {

    @PostMapping("/addSchedule")
    public FundTransferResponse addSchedule(@RequestBody FundTransferRequest request) {
        FundTransferResponse response = new FundTransferResponse();

        response.setBank_code(request.getBank_code());

        return response;
    }

    @PostMapping("/getSchedule")
    public ScheduleResponse getSchedule(@RequestBody ScheduleRequest request) {
        ScheduleResponse response = new ScheduleResponse();

        return response;
    }


}
