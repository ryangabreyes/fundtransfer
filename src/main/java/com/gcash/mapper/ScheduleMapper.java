package com.gcash.mapper;

import com.gcash.model.Schedule;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScheduleMapper {

    @Select("select * from schedule")
    List<Schedule> getAllSchedule();

    @Insert("insert into schedule(user_id, mode, every, time) values (#")
    void insert(Schedule schedule);
}
