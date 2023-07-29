package org.saucedemo;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class SauceDemoExecutionClass extends SauceDemoBaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		launchBrowser("https://www.saucedemo.com/");
		zoomOut();
		pOJOLoginPageClassOne p1 = new pOJOLoginPageClassOne();
		WebElement username = p1.getUserName();
		WebElement password = p1.getPassword();
		WebElement login = p1.getLoginButton();
		enterText(username, "performance_glitch_user");
		enterText(password, "secret_sauce");
		login.click();
		System.out.println("Page 1- Passed Successfully**************");
		
		pOJOProductsPageClassTwo p2 = new pOJOProductsPageClassTwo();
		WebElement backPack = p2.getSauceLabsBackpack();
		WebElement back1 = p2.getBackToProdctSauceLabsBoltTShirt();
		Thread.sleep(800);
		WebElement bikeLight = p2.getSauceLabsBikeLight();
		WebElement back2 = p2.getBackToProductPacksauceLabsBikeLight();
		Thread.sleep(800);
		WebElement boltTShirt = p2.getSauceLabsBoltTShirt();
		WebElement back3 = p2.getBackToProdctSauceLabsBoltTShirt();
		Thread.sleep(800);
		WebElement fleenceBoltTshirt = p2.getSauceLabsFleeceJacket();
		WebElement back4 = p2.getBackToProductSauceLabsFleeceJacket();
		Thread.sleep(800);
		WebElement onesie =  p2.getSauceLabsOnesie();
		WebElement back5 = p2.getBackToProductSauceLabsOnesie();
		Thread.sleep(800);
		WebElement redShirt = p2.getTestAllTheThingsTShirtRed();
		WebElement back6= p2.getBackToProductTestallTheThingsTShirtRed();
		Thread.sleep(800);
		backPack.click();
		back1.click();
		Thread.sleep(500);
		bikeLight.click();
		back2.click();
		Thread.sleep(500);
		boltTShirt.click();
		back3.click();
		Thread.sleep(500);
		fleenceBoltTshirt.click();
		back4.click();
		Thread.sleep(500);
		onesie.click();
		back5.click();
		Thread.sleep(500);
		redShirt.click();
		back6.click();
		System.out.println("page 2 - Passed Successfully**************");
		
		pOJOAddToCartPageClassThree p3= new pOJOAddToCartPageClassThree();
		WebElement back7 = p3.getAddToCartSauceLabsPack();
		WebElement back8 = p3.getAddToCartSauceBikeLight();
		WebElement back9 = p3.getAddToCartSauceBoltTShirt();
		WebElement back10 = p3.getAddToCartSauceFleencejacket();
		WebElement back11 = p3.getAddTocartSauceLabsOnesie();
		WebElement back12 = p3.getAddToCartSauceTshirtRed();
		back7.click();
		Thread.sleep(200);
		back8.click();
		Thread.sleep(200);
		back9.click();
		Thread.sleep(200);
		back10.click();
		Thread.sleep(200);
		back11.click();
		Thread.sleep(200);
		back12.click();
		System.out.println("Page 3 - Passed Successfully***************");
		
		pOJOClickCartClassFour p4 = new pOJOClickCartClassFour();
		WebElement addToCartClick= p4.getClickCart();
		Thread.sleep(1000);
		addToCartClick.click();
		System.out.println("Page 4 - Passed Successfully***************");
		
		pOJOCheckOutClassFive p5 = new pOJOCheckOutClassFive();
		WebElement clickCheckOut= p5.getCheckOut();
		Thread.sleep(1000);
		clickCheckOut.click();
		System.out.println("Page 5 - Passed Successfully***************");
		
		pOJOCheckOutYourInformationClassSix p6 = new pOJOCheckOutYourInformationClassSix();
		WebElement firstName = p6.getFirstName();
		WebElement lastName =p6.getLastName();
		WebElement zipCode = p6.getZipCode();
		WebElement clickContiine = p6.getContinueButton();
		Thread.sleep(200);
		enterText(firstName, "Mahesh");
		enterText(lastName, "Raz");
		enterText(zipCode, "600096");
		Thread.sleep(1000);
		clickContiine.click();
		System.out.println("page 6 - Passed Successfully****************");
		
		pOJOClickFinishButtonClassSeven p7 = new pOJOClickFinishButtonClassSeven();
		WebElement finishButton = p7.getFinish();
		Thread.sleep(1000);
		finishButton.click();
		takeScreenShot();
		System.out.println("page 7 - Passed Successfully****************");
		System.out.println("Cheerful..:)");
		
		
		
		
	}

}
