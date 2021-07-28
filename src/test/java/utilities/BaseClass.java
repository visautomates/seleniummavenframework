package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pageFactory.Demobuttons;


public class BaseClass {
	
	public static WebDriver driver;
   
	protected static ExtentReports extentreport;
	protected static ExtentTest testcase;
	static ExtentSparkReporter htmlreporter ;
	static String path = System.getProperty("user.dir") ;
 

	public static void driverintiateWeb() {
		 
			
			ConfigurationReade ConfigurationReade = new ConfigurationReade();
			System.setProperty("webdriver.chrome.driver", ConfigurationReade.getdriverpath());
			 extentreport = new ExtentReports();
			 htmlreporter = new ExtentSparkReporter(path+"\\target\\"+"ExtentReport.html");
			 extentreport.attachReporter(htmlreporter);
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		
		}
	
	public static void Dobleclick() {
	     
	     Actions action = new Actions(driver);
	     Demobuttons button = PageFactory.initElements(driver, Demobuttons.class);	
	// need more look into tis 
	}
	
	public static void  WaituntilDisplay(WebElement Locator) {
		
	    WebDriverWait  w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOf(Locator));
		
	}
	
	public static void takeScreenshot(String Methodname) {
		
		
		try {
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File(path+"\\target\\"+Methodname+".png");
			FileHandler.copy(sourcefile, destinationfile);
			testcase.addScreenCaptureFromPath(Methodname+".png");
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Unable to capture thr screenshot check the issue");
		
		}
		
	
	}
	

}
