package spring.rest.consumer.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

// Steps - 
// 1. Run spring-boot-project. 
// 2. Run this project 
// 3. test APIs of this project - http://localhost:8091/department/5 

@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		App.log.info("Start");
		SpringApplication.run(App.class, args);
		App.log.info("End");

	}
}
