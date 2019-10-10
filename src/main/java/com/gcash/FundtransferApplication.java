package com.gcash;

import com.gcash.model.Schedule;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Schedule.class)
@MapperScan("com.gcash.mapper")
@SpringBootApplication
public class FundtransferApplication {

	public static void main(String[] args) {

		SpringApplication.run(FundtransferApplication.class, args);


	}

}
