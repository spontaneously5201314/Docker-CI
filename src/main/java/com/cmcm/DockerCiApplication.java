package com.cmcm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cmcm.dao")
public class DockerCiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerCiApplication.class, args);
	}
}
