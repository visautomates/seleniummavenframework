package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeroInternet {

	@FindBy(xpath="//a[@href ='/dynamic_loading']")
	private WebElement DynamicLoading;
	

	@FindBy(xpath="//a[@href ='/dynamic_loading/1']")
	private WebElement HiddenElementonPage;
	
	@FindBy(xpath="//div[@id='start']//following::button")
	private WebElement HiddenElementonPageClick;

	@FindBy(xpath="//div[@id='finish']//following::h4")
	private WebElement HiddenElementDisp;
	
	
	public WebElement getDynamicLoading() {
		
		return DynamicLoading;
	}
	
	public WebElement getHiddenElementonPage() {
		
		return HiddenElementonPage;
	}
	
	public WebElement getHiddenElementonPageClick() {
		return HiddenElementonPageClick ;
	}
	
	public WebElement getHiddenElementDisp() {
		return HiddenElementDisp;
	}
}

