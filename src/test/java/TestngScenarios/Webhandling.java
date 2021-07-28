package TestngScenarios;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import methoJava.*;
import utilities.BaseClass;
import utilities.Listnerstart;

@Listeners(Listnerstart.class)

public class Webhandling extends BaseClass {
	
	
	@BeforeSuite
	void intiate() {

		driverintiateWeb();
		
	}

	@Test(priority = 1)
	void webhandling()  {
		
		driver.get("https://demoqa.com/webtables");
		HandlingDynamicWebtable meth = new HandlingDynamicWebtable();
		meth.GetRowandColum();
	}
	
	@AfterMethod
	void quitdr() {
		driver.quit();
		
	}
}
