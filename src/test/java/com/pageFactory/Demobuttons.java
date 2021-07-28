package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Demobuttons {

	
	@FindBy(xpath="//*[@id='doubleClickBtn']")
    private WebElement doubleclickMe;
	
	public WebElement getdoubleclickMe() {
		
		return doubleclickMe;
	}
	
	//

}
