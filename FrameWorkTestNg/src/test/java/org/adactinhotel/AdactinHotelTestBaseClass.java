package org.adactinhotel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelTestBaseClass {

	WebDriver driver;

	public void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public WebElement loginId(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}

	public WebElement password(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}

	public WebElement loginButton(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}

	public void enterText(WebElement enterBox, String text) {
		enterBox.sendKeys(text);
	}

	public WebElement forgotPassword(String xpath) {
		WebElement forgot = driver.findElement(By.xpath(xpath));
		return forgot;
	}

	public WebElement enterEmail(String id) {
		WebElement enterEmail = driver.findElement(By.id(id));
		return enterEmail;
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void back() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public WebElement selectLocation(String id) {
		WebElement select = driver.findElement(By.id(id));
		Select s = new Select(select);
		boolean select1 = s.isMultiple();
		System.out.println(select1);
		s.selectByIndex(7);
		return select;
	}

	public WebElement hotelsselect(String id) {
		WebElement selectHotel = driver.findElement(By.id(id));
		Select s = new Select(selectHotel);
		s.selectByValue("Hotel Hervey");
		return selectHotel;
	}

	public WebElement roomType(String name) {
		WebElement selectRoom = driver.findElement(By.name(name));
		Select s = new Select(selectRoom);
		s.selectByIndex(3);
		return selectRoom;
	}

	public WebElement roomNos(String id) {
		WebElement selectRoomType = driver.findElement(By.id(id));
		Select s = new Select(selectRoomType);
		s.selectByVisibleText("4 - Four");
		return selectRoomType;
	}

	public WebElement checkInDate(String id) {
		WebElement inDate = driver.findElement(By.id(id));
		inDate.clear();
		inDate.sendKeys("01/07/2023");
		return inDate;
	}

	public WebElement checkOutDate(String id) {
		WebElement outDate = driver.findElement(By.id(id));
		outDate.clear();
		outDate.sendKeys("07/07/2023");
		return outDate;
	}

	public WebElement adultRoom(String name) {
		WebElement adult = driver.findElement(By.name(name));
		Select s = new Select(adult);
		s.selectByIndex(3);
		return adult;
	}

	public WebElement search(String name) {
		WebElement searchButton = driver.findElement(By.name(name));
		searchButton.click();
		return searchButton;
	}

	public WebElement confirmationHotel(String id) {
		WebElement confirmClick = driver.findElement(By.id(id));
		confirmClick.click();
		return confirmClick;

	}

	public WebElement clickContinue(String id) {
		WebElement click = driver.findElement(By.id(id));
		click.click();
		return click;
	}

	public WebElement firstName(String id) {
		WebElement first = driver.findElement(By.id(id));
		first.sendKeys("Mahesh");
		return first;
	}

	public WebElement lastName(String id) {
		WebElement last = driver.findElement(By.id(id));
		last.sendKeys("Razz");
		return last;
	}

	public WebElement billingAddress(String id) {
		WebElement billAdd = driver.findElement(By.id(id));
		billAdd.sendKeys("2/77, Demandi Colony, Adyar, Chennai-60009");
		return billAdd;
	}

	public WebElement creditCardNo(String id) {
		WebElement creditNo = driver.findElement(By.id(id));
		creditNo.sendKeys("6689782514782569");
		return creditNo;
	}

	public WebElement creditCardType(String id) {
		WebElement cardType = driver.findElement(By.id(id));
		Select s = new Select(cardType);
		s.selectByIndex(1);
		return cardType;
	}

	public WebElement expirydate(String id) {
		WebElement expiry = driver.findElement(By.id(id));
		Select s = new Select(expiry);
		s.selectByIndex(7);
		return expiry;
	}

	public WebElement expiryyear(String name) {
		WebElement expiryyear = driver.findElement(By.id(name));
		Select s = new Select(expiryyear);
		s.selectByValue("2028");
		return expiryyear;
	}

	public WebElement cVVNum(String id) {
		WebElement cvv = driver.findElement(By.id(id));
		cvv.sendKeys("963");
		return cvv;
	}

	public WebElement bookNow(String id) {
		WebElement book = driver.findElement(By.id(id));
		book.click();
		return book;
	}
}