package test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnilizer implements IRetryAnalyzer{
	int counter = 0;
	int retryLimit = 3;
	
	public boolean retry(ITestResult result) {
		if (counter<retryLimit) {
			counter++;
			return true;
		} else
		return false;
	}

}
