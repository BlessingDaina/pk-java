package com.example.daina;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.daina.mapper")
@SpringBootApplication
public class DainaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DainaApplication.class, args);
	}

}
