package com.cognizant.moviecuriser;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Ayush Srivastava
 *
 */
@SpringBootApplication
@ComponentScan({"com.cognizant.moviecuriser.controller",
"com.cognizant.moviecuriser.model","com.cognizant.moviecuriser.repository","com.cognizant.moviecuriser.service"})
public class MoviecuriserApplication {
private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MoviecuriserApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Start");
		SpringApplication.run(MoviecuriserApplication.class, args);
		LOGGER.info("End");
	}

}
