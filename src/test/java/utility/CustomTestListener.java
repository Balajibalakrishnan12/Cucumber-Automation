package utility;

import java.io.IOException;

import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("test started");
		
	}
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test success");
		
	}
	public void onTestFailure(ITestResult result) {
	
	System.out.println("test failure");
	try {
		ScreenShotUtility.takeScreenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
