package com.azr.cosmosdb;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class AppRun {

	//   @PostConstruct
	// void started() {
	// 	TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	// }
	

	public static void main(String[] args) {
		System.setProperty("user.timezone", "GMT");
		SpringApplication.run(AppRun.class, args);
	}
}
