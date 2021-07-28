package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage {

	@FindBy(xpath = "(//span[@class='nav-line-2'])2")
	private WebElement HelloSig;

	public WebElement getHelloSig() {
		return HelloSig;
	}

}
