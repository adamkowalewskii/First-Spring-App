package com.firstSpring.AppSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class AppSpringApplication{

	private static Logger LOG = (Logger) LoggerFactory
			.getLogger(AppSpringApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(AppSpringApplication.class, args);
		LOG.info("ENDINGING THE APPLICATION");
	}


}
