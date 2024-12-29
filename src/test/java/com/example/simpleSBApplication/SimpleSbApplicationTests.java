package com.example.simpleSBApplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleSbApplicationTests {
	public static Logger LOG = LoggerFactory.getLogger(SimpleSbApplicationTests.class);

	@Test
	void contextLoads() {
	}

	@Test
	public void test(){
		LOG.info("Test Successful");
	}

}
