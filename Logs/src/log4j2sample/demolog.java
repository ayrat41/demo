package log4j2sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class demolog {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(demolog.class);
		System.out.println("/n Hello world  /n");
		
		logger.info("This is info");
		logger.error("This is error");
		logger.warn("This is warn");
		logger.fatal("This is fatal");
		
		System.out.println("/n Complited");
	}

}
