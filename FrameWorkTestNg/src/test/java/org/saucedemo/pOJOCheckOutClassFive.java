package org.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pOJOCheckOutClassFive extends SauceDemoBaseClass {

	public pOJOCheckOutClassFive() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout")
	private WebElement checkOut;
	
	public WebElement getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(WebElement checkOut) {
		this.checkOut = checkOut;
	}
	
}
