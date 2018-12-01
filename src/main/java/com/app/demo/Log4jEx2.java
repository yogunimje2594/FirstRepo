package com.app.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4jEx2 {

	private static final Logger logger=(Logger) LogManager.getLogger(Log4jEx2.class);
	public static void main(String[] args) {
		System.out.println("Hello world\n");
		logger.debug("This is a debug message");
		logger.info("This is information message");
		logger.warn("This is a warning message");
		logger.error("This is a error message");
		logger.fatal("This is a fatal message");
		System.out.println("\nCompleted");
	}
}
