package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class toolsQaWebhandle {
	
	@FindBy(xpath="//div[@class='rt-th rt-resizable-header -cursor-pointer']")
	private WebElement column ;
	
	
	public WebElement getcolumn() {
		return column;
	}

}
