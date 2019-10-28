package com.varian.ccip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.varian.ccip.dao")
public class CcipPatientApplication {
	public static void main(String[] args) {
		SpringApplication.run(CcipPatientApplication.class, args);
	}

}
