package utilities;

import org.openqa.selenium.chrome.ChromeDriver;

public class Crossbrowser extends BaseClass{

	public static void Openbrowsers(String browsername) {
		
		switch (browsername) {
		
		case "chrome":
			
			ConfigurationReade ConfigurationReade = new ConfigurationReade();
			System.setProperty("webdriver.chrome.driver", ConfigurationReade.getdriverpath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		
		
		case "ie":
			
			ConfigurationReade ConfigurationReade1 = new ConfigurationReade();
			System.setProperty("webdriver.chrome.driver", ConfigurationReade1.getdriverpath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			
	}
		
	}


