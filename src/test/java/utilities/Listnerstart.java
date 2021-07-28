package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listnerstart extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		testcase = extentreport.createTest("First test - "+result.getMethod().getMethodName());
		testcase.log(Status.INFO, result.getMethod().getMethodName()+"_execution started");
		
		/*
		 * testcase = extentreport.
		 * createTest("First test - Hadnling dynamic web table getting column");
		 * testcase.log(Status.INFO, "Handling dynamic tableWebtables");
		
		testcase.createNode("scenario 01"); */
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takeScreenshot(result.getMethod().getMethodName());
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e);
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {

		try {
			takeScreenshot(result.getMethod().getMethodName());
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e);
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("Testing is completed");
		extentreport.flush();
	}

}
