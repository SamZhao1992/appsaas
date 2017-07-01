package com.app;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.app.mapper")
//启注解事务管理
@EnableTransactionManagement
public class AppsaasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppsaasApplication.class, args);
	}
}
