package com.qinchy.tkmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.qinchy.tkmybatisdemo.dao")
public class TkmybatisdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkmybatisdemoApplication.class, args);
	}
}
