package org.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pOJOAddToCartPageClassThree extends SauceDemoBaseClass {

	public pOJOAddToCartPageClassThree() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCartSauceLabsPack;
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement addToCartSauceBikeLight;
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addToCartSauceBoltTShirt;
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement addToCartSauceFleencejacket;
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	private WebElement addTocartSauceLabsOnesie;
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement addToCartSauceTshirtRed;

	
	public WebElement getAddToCartSauceLabsPack() {
		return addToCartSauceLabsPack;
	}

	public void setAddToCartSauceLabsPack(WebElement addToCartSauceLabsPack) {
		this.addToCartSauceLabsPack = addToCartSauceLabsPack;
	}

	public WebElement getAddToCartSauceBikeLight() {
		return addToCartSauceBikeLight;
	}

	public void setAddToCartSauceBikeLight(WebElement addToCartSauceBikeLight) {
		this.addToCartSauceBikeLight = addToCartSauceBikeLight;
	}

	public WebElement getAddToCartSauceBoltTShirt() {
		return addToCartSauceBoltTShirt;
	}

	public void setAddToCartSauceBoltTShirt(WebElement addToCartSauceBoltTShirt) {
		this.addToCartSauceBoltTShirt = addToCartSauceBoltTShirt;
	}

	public WebElement getAddToCartSauceFleencejacket() {
		return addToCartSauceFleencejacket;
	}

	public void setAddToCartSauceFleencejacket(WebElement addToCartSauceFleencejacket) {
		this.addToCartSauceFleencejacket = addToCartSauceFleencejacket;
	}

	public WebElement getAddTocartSauceLabsOnesie() {
		return addTocartSauceLabsOnesie;
	}

	public void setAddTocartSauceLabsOnesie(WebElement addTocartSauceLabsOnesie) {
		this.addTocartSauceLabsOnesie = addTocartSauceLabsOnesie;
	}

	public WebElement getAddToCartSauceTshirtRed() {
		return addToCartSauceTshirtRed;
	}

	public void setAddToCartSauceTshirtRed(WebElement addToCartSauceTshirtRed) {
		this.addToCartSauceTshirtRed = addToCartSauceTshirtRed;
	}
}
