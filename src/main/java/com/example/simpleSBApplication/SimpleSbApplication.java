package com.example.simpleSBApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSbApplication {

	public static Logger LOG = LoggerFactory.getLogger(SimpleSbApplication.class);

	public static void main(String[] args) {

		LOG.info("Application started on commit for pipeline view....");
		SpringApplication.run(SimpleSbApplication.class, args);
	}

}
