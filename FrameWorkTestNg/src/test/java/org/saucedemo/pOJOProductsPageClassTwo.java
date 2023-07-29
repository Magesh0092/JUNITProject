package org.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class pOJOProductsPageClassTwo extends SauceDemoBaseClass {
	public pOJOProductsPageClassTwo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement sauceLabsBackpack;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	private WebElement sauceLabsBikeLight;
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement sauceLabsBoltTShirt;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement sauceLabsFleeceJacket;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	private WebElement sauceLabsOnesie;
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement testAllTheThingsTShirtRed;
	
	@FindBy(id = "back-to-products")
	private WebElement backToProductSacucelabsPack;
	
	public WebElement getBackToProductSacucelabsPack() {
		return backToProductSacucelabsPack;
	}

	public void setBackToProductSacucelabsPack(WebElement backToProductSacucelabsPack) {
		this.backToProductSacucelabsPack = backToProductSacucelabsPack;
	}

	public WebElement getBackToProductPacksauceLabsBikeLight() {
		return backToProductPacksauceLabsBikeLight;
	}

	public void setBackToProductPacksauceLabsBikeLight(WebElement backToProductPacksauceLabsBikeLight) {
		this.backToProductPacksauceLabsBikeLight = backToProductPacksauceLabsBikeLight;
	}

	public WebElement getBackToProdctSauceLabsBoltTShirt() {
		return backToProdctSauceLabsBoltTShirt;
	}

	public void setBackToProdctSauceLabsBoltTShirt(WebElement backToProdctSauceLabsBoltTShirt) {
		this.backToProdctSauceLabsBoltTShirt = backToProdctSauceLabsBoltTShirt;
	}

	public WebElement getBackToProductSauceLabsFleeceJacket() {
		return backToProductSauceLabsFleeceJacket;
	}

	public void setBackToProductSauceLabsFleeceJacket(WebElement backToProductSauceLabsFleeceJacket) {
		this.backToProductSauceLabsFleeceJacket = backToProductSauceLabsFleeceJacket;
	}

	public WebElement getBackToProductSauceLabsOnesie() {
		return backToProductSauceLabsOnesie;
	}

	public void setBackToProductSauceLabsOnesie(WebElement backToProductSauceLabsOnesie) {
		this.backToProductSauceLabsOnesie = backToProductSauceLabsOnesie;
	}

	public WebElement getBackToProductTestallTheThingsTShirtRed() {
		return backToProductTestallTheThingsTShirtRed;
	}

	public void setBackToProductTestallTheThingsTShirtRed(WebElement backToProductTestallTheThingsTShirtRed) {
		this.backToProductTestallTheThingsTShirtRed = backToProductTestallTheThingsTShirtRed;
	}
	@FindBy(id = "back-to-products")
	private WebElement backToProductPacksauceLabsBikeLight;
	@FindBy(id = "back-to-products")
	private WebElement backToProdctSauceLabsBoltTShirt;
	@FindBy(id = "back-to-products")
	private WebElement backToProductSauceLabsFleeceJacket;
	@FindBy(id = "back-to-products")
	private WebElement backToProductSauceLabsOnesie;
	@FindBy(id = "back-to-products")
	private WebElement backToProductTestallTheThingsTShirtRed;
	
	public WebElement getSauceLabsBackpack() {
		return sauceLabsBackpack;
	}

	public void setSauceLabsBackpack(WebElement sauceLabsBackpack) {
		this.sauceLabsBackpack = sauceLabsBackpack;
	}

	public WebElement getSauceLabsBikeLight() {
		return sauceLabsBikeLight;
	}

	public void setSauceLabsBikeLight(WebElement sauceLabsBikeLight) {
		this.sauceLabsBikeLight = sauceLabsBikeLight;
	}

	public WebElement getSauceLabsBoltTShirt() {
		return sauceLabsBoltTShirt;
	}

	public void setSauceLabsBoltTShirt(WebElement sauceLabsBoltTShirt) {
		this.sauceLabsBoltTShirt = sauceLabsBoltTShirt;
	}

	public WebElement getSauceLabsFleeceJacket() {
		return sauceLabsFleeceJacket;
	}

	public void setSauceLabsFleeceJacket(WebElement sauceLabsFleeceJacket) {
		this.sauceLabsFleeceJacket = sauceLabsFleeceJacket;
	}

	public WebElement getSauceLabsOnesie() {
		return sauceLabsOnesie;
	}

	public void setSauceLabsOnesie(WebElement sauceLabsOnesie) {
		this.sauceLabsOnesie = sauceLabsOnesie;
	}

	public WebElement getTestAllTheThingsTShirtRed() {
		return testAllTheThingsTShirtRed;
	}

	public void setTestAllTheThingsTShirtRed(WebElement testAllTheThingsTShirtRed) {
		this.testAllTheThingsTShirtRed = testAllTheThingsTShirtRed;
	}

}
