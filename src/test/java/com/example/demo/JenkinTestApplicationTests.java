package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinTestApplicationTests {

	private Logger logger = LoggerFactory.getLogger(JenkinTestApplicationTests.class);

	@Test
	public void contextLoads() {
		assertEquals(true, true);
		logger.info("Test started--------------->>>");
	}

}
