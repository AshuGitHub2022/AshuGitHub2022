package ashushivamproject;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("This is the test scenario:  onTestStart"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is the test scenario:  onTestSuccess"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is the test scenario:  onTestFailure"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is the test scenario:  onTestSkipped"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is the test scenario:  onTestFailedButWithinSuccessPercentage"+result.getName());
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is the test scenario:  onTestFailedWithTimeout"+result.getName());
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("This is the test scenario:  onStart"+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("This is the test scenario:  onFinish" +context.getName());
		
	}

}
