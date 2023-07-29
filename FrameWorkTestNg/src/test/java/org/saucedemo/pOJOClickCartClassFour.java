package org.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pOJOClickCartClassFour extends SauceDemoBaseClass {

	public pOJOClickCartClassFour() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement ClickCart;

	public WebElement getClickCart() {
		return ClickCart;
	}

	public void setClickCart(WebElement clickCart) {
		ClickCart = clickCart;
	}

}
