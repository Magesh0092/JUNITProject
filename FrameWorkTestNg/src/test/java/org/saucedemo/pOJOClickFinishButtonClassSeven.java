package org.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pOJOClickFinishButtonClassSeven extends SauceDemoBaseClass {
	public pOJOClickFinishButtonClassSeven() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "finish")
	private WebElement finish;

	public WebElement getFinish() {
		return finish;
	}

	public void setFinish(WebElement finish) {
		this.finish = finish;
	}
}
