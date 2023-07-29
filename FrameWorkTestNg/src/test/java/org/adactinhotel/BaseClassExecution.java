package org.adactinhotel;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseClassExecution extends AdactinHotelTestBaseClass {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		BaseClassExecution execute = new BaseClassExecution();
		execute.browserLaunch("https://adactinhotelapp.com/");
		WebElement Username = execute.loginId("username");
		WebElement Password = execute.password("password");
		execute.enterText(Username, "MaheshRaz");
		execute.enterText(Password, "Mahesh@123");
		WebElement forgotPassword=execute.forgotPassword("//*[@id=\"login_form\"]/table/tbody/tr[4]/td[2]/div/a");
		forgotPassword.click();
		WebElement enterbox = execute.enterEmail("emailadd_recovery");
		enterbox.sendKeys("magesh.skull@gmail.com");
		execute.refresh();
		execute.back();
		WebElement l=execute.loginButton("login");
		l.click();
		WebElement s = execute.selectLocation("location");
		WebElement s1 =execute.hotelsselect("hotels");
		WebElement roomtype =execute.roomType("room_type");
		WebElement roomNO =execute.roomNos("room_nos");
		WebElement checIn= execute.checkInDate("datepick_in");
		WebElement checUut =execute.checkOutDate("datepick_out");
		WebElement search=  execute.search("Submit");
		Thread.sleep(2000);
		WebElement click = execute.confirmationHotel("radiobutton_0");
		Thread.sleep(2000);
		WebElement clickCont = execute.clickContinue("continue");
		WebElement firstname = execute.firstName("first_name");
		WebElement lastname = execute.lastName("last_name");
		WebElement bill = execute.billingAddress("address");
		WebElement cardNo= execute.creditCardNo("cc_num");
		WebElement cardType = execute.creditCardType("cc_type");
		WebElement expDate = execute.expirydate("cc_exp_month");
		WebElement expYear = execute.expiryyear("cc_exp_year");
		WebElement cvv = execute.cVVNum("cc_cvv");
		WebElement bookNow = execute.bookNow("book_now");
	}	
}
