package org.practiceautomationjnuit;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;

public class PracticeAutomationJunit {
	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/");
	}

	@Before
	public void beforeStartTest() throws IOException {
		Date d = new Date();
		d.getTime();
		System.out.println(d);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,
				new File("C:\\Users\\Mahesh\\eclipse-workspace\\FrameWorkTestNg\\target\\BeforeExecution.png"));
	}

	@Test
	public void managerLogin() throws InterruptedException, AWTException {
		// Clear Cookies
		Robot r = new Robot();
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_SUBTRACT);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@id='wt-cli-privacy-save-btn']")).click();
		// Perform Actions
		// java Script:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='custom_btn btn_hover']")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		// Sliders:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[2]")).click();
		WebElement slide = driver.findElement(By.xpath("//input[@value='25']"));
		Actions s = new Actions(driver);
		s.dragAndDropBy(slide, 60, 100).perform();
		Thread.sleep(200);
		driver.navigate().back();
		// Tables:
		// Simple Tables
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[3]")).click();
		WebElement Table = driver.findElement(By.xpath("//*[@id=\"post-1076\"]/div/figure/table"));
		System.out.println("Simple Table (item prices)" + Table.getText());
		Thread.sleep(1000);
		driver.navigate().back();
		// Ads:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[4]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[@class='pum-close popmake-close'])[3]")).click();
		driver.navigate().back();
		// Click Events:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[5]")).click();
		driver.findElement(By.xpath("(//button[@class='custom_btn btn_hover'])[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//button[@class='custom_btn btn_hover'])[2]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//button[@class='custom_btn btn_hover'])[3]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//button[@class='custom_btn btn_hover'])[4]")).click();
		Thread.sleep(200);
		driver.navigate().back();
		// Form Fields:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[6]")).click();
		driver.findElement(By.xpath("(//input[@id='g1103-name'])[1]")).sendKeys("Mahesh");
		driver.findElement(By.xpath("//input[@value='Wine']")).click();
		driver.findElement(By.xpath("//input[@value='Red']")).click();
		WebElement select = driver.findElement(By.xpath("//span[@id='g1103-doyouhaveanysiblings-button']"));
		select.sendKeys("Yes");
		driver.findElement(By.name("email")).sendKeys("Mahesh007@gmail.com");
		driver.findElement(By.id("contact-form-comment-message"))
				.sendKeys("Well Enough, Everything is good, thank you!");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);

		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_SUBTRACT);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		for (int j = 0; j < 3; j++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_ADD);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_ADD);
		}
		// Calendars:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[7]")).click();
		driver.findElement(By.xpath("//input[@id='g1065-selectorenteradate']")).sendKeys("August 20, 2023");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(500);
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_SUBTRACT);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		// Windows Operations:
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[8]")).click();
		driver.findElement(By.xpath("(//button[@class='custom_btn btn_hover'])[1]")).click();
		String parentID = driver.getWindowHandle();
		Set<String> childTab = driver.getWindowHandles();
		/* Tab */ for (String a : childTab) {
			if (!parentID.equals(a)) {
				driver.switchTo().window(a);
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(parentID);
		driver.findElement(By.xpath("(//button[@class='custom_btn btn_hover'])[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//button[@class='custom_btn btn_hover'])[3]")).click();
		/* window */ Set<String> childWindow = driver.getWindowHandles();
		for (String b : childWindow) {
			if (!b.equals(parentID)) {
				driver.switchTo().window(b);
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parentID);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// Gestures:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[9]")).click();
		WebElement source = driver.findElement(By.id("moveMeHeader"));
		WebElement target = driver.findElement(By.xpath("(//div[@class='wp-block-spacer'])[1]"));
		Actions a = new Actions(driver);
		a.clickAndHold(source).moveToElement(target).release(target).perform();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// Pop-Ups:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[11]")).click();
		driver.findElement(By.id("alert")).click();
		org.openqa.selenium.Alert alertPopUp = driver.switchTo().alert();
		alertPopUp.accept();
		driver.findElement(By.id("confirm")).click();
		org.openqa.selenium.Alert confirmPopUp = driver.switchTo().alert();
		confirmPopUp.dismiss();
		driver.findElement(By.id("prompt")).click();
		org.openqa.selenium.Alert promptPopUp = driver.switchTo().alert();
		promptPopUp.sendKeys("Magesh");
		String text = promptPopUp.getText();
		System.out.println(text);
		promptPopUp.accept();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// Modals:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[12]")).click();
		driver.findElement(By.id("simpleModal")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.findElement(By.id("formModal")).click();
		driver.findElement(By.id("g1051-name")).sendKeys("Magesh");
		driver.findElement(By.id("g1051-email")).sendKeys("magesh.007@gmail.com");
		driver.findElement(By.id("contact-form-comment-g1051-message"))
				.sendKeys("Hello, Please Close this case as soon");
		driver.findElement(By.xpath("//button[@class='pushbutton-wide']")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// Hover:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[13]")).click();
		WebElement moveElement = driver.findElement(By.id("mouse_over"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(moveElement).build().perform();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// File Download:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[14]")).click();
		// driver.findElement(By.xpath("(//a[text()='Download'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_W);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// File Uploads:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[15]")).click();
		driver.findElement(By.id("file_upload")).sendKeys("C:\\Users\\Mahesh\\Documents\\Keyboard Key Names List.pdf");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// IFrames:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[16]")).click();
		/* parent */ WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[@class='Button Button--default UserMenu__Link']")).click();
		driver.switchTo().parentFrame();
		/* child */ WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(1000);
		// driver.switchTo().frame(frame1);
		driver.switchTo().parentFrame();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// Carousels:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[17]")).click();
		driver.findElement(By.xpath("(//img[@class='sp-no-webp jetpack-lazy-image jetpack-lazy-image--handled'])[2]"))
				.click();
		driver.findElement(By.xpath("(//img[@class='sp-no-webp jetpack-lazy-image jetpack-lazy-image--handled'])[3]"))
				.click();
		driver.findElement(By.xpath("(//img[@class='sp-no-webp jetpack-lazy-image jetpack-lazy-image--handled'])[4]"))
				.click();
		driver.findElement(By.xpath("(//img[@class='sp-no-webp jetpack-lazy-image jetpack-lazy-image--handled'])[5]"))
				.click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// Broken Links:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[18]")).click();
		driver.findElement(By.xpath("//a[text()='Click me']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		// Accordions:
		driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[20]")).click();
		driver.findElement(By.xpath("//summary[@class='wp-block-coblocks-accordion-item__title']")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	}

	@After
	public void afterfinishTest() throws IOException {
		Date d = new Date();
		d.getTime();
		System.out.println(d);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,
				new File("C:\\Users\\Mahesh\\eclipse-workspace\\FrameWorkTestNg\\target\\AfterExecution.png"));
	}

	@AfterClass
	public static void finishTheExecution() {
		driver.close();
	}

}
