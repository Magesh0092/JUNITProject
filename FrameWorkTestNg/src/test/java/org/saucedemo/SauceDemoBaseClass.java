package org.saucedemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoBaseClass {
	public static WebDriver driver;

	public static void launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void zoomOut() throws AWTException {
		Robot r = new Robot();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_SUBTRACT);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_SUBTRACT);
		}

	}

	public static void enterText(WebElement enterBox, String text) {
		enterBox.sendKeys(text);
	}
	
	public static void takeScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File destScreenhot = new File("./PlaceOrderSnap/img.png");
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\Mahesh\\eclipse-workspace\\FrameWorkTestNg\\target\\OrderPlacedSuccessful"+".png"));
		
	}

//	public static WebElement enterUserName(String id) {
//		WebElement userName = driver.findElement(By.id(id));
//		return userName;
//	}
//
//	public static WebElement enterPass(String name) {
//		WebElement password = driver.findElement(By.name(name));
//		return password;
//	}
//
//	public static WebElement loginButton(String xpath) {
//		WebElement login = driver.findElement(By.xpath(xpath));
//		return login;
//	}
//

//
//	public static WebElement sauceLabsBackpack(String xpath) {
//		WebElement baclPack = driver.findElement(By.xpath(xpath));
//		return baclPack;
//	}
//
//	public static WebElement sauceLabsBikeLight(String xpath) {
//		WebElement bikeLight = driver.findElement(By.xpath(xpath));
//		return bikeLight;
//	}
//
//	public static WebElement sauceLabsBoltTShirt(String xpath) {
//		WebElement bolt = driver.findElement(By.xpath(xpath));
//		return bolt;
//	}
//
//	public static WebElement sauceLabsFleeceJacket(String xpath) {
//		WebElement jacket = driver.findElement(By.xpath(xpath));
//		return jacket;
//	}
//
//	public static WebElement sauceLabsOnesie(String xpath) {
//		WebElement onesie = driver.findElement(By.xpath(xpath));
//		return onesie;
//	}
//
//	public static WebElement testAllTheThingsTShirtRed(String xpath) {
//		WebElement redShirt = driver.findElement(By.xpath(xpath));
//		return redShirt;
}
