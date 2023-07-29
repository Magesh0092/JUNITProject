package org.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pOJOCheckOutYourInformationClassSix extends SauceDemoBaseClass {
	public pOJOCheckOutYourInformationClassSix() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first-name")
	private WebElement firstName;
	@FindBy(id = "last-name")
	private WebElement lastName;
	@FindBy(id = "postal-code")
	private WebElement zipCode;
	@FindBy(id = "continue")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public void setZipCode(WebElement zipCode) {
		this.zipCode = zipCode;
	}

}
