package steps;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {
	public static Logger logger = LogManager.getLogger(CucumberHooks.class);

	@Before("@ProductPage")
	public void setup() {
//		logger.info("setup started");
		System.out.println("setup started");
	}

	@After("@ProductPage")
	public void aftersetup() {
//		logger.info("Setup ended");
		System.out.println("Setup ended");
	}

	@BeforeStep
	public void beforestep() {
//		logger.info("before step started");
		System.out.println("before step started");
	}

	@AfterStep
	public void afterstep() {
//		logger.info("after step started");
		System.out.println("after step started");

	}

}
