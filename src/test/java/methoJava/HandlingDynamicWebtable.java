package methoJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.aventstack.extentreports.Status;


import utilities.BaseClass;

public class HandlingDynamicWebtable extends BaseClass {

	public void GetRowandColum()  {
	
		List<WebElement> column = driver
				.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
		int columnSize = column.size();
	
		System.out.println("Size of colum = " + columnSize);
		testcase.log(Status.PASS, "Captured column value");
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='rt-tr-group']")); 
		
		int rowsize =row.size(); System.out.println("Size of row = " + rowsize);
		
		testcase.log(Status.PASS, "Captured row value");
	
		  
		  }
		 
		 
	
	}



