package com.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loggerExample {
	
	private static Logger myLogger = LogManager.getLogger(loggerExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myLogger.trace("Trace Message!!!!");
		myLogger.info("Info Message!!!!!!");
		myLogger.debug("Debug Message!!!!!!!");
		myLogger.error("Error Message!!!!!");
		myLogger.warn("Warn Message!!!!!!!");
		myLogger.fatal("Fatal Message!!!!!!!");

	}

}
