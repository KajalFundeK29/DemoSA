package com.CRM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.Screenshot;

public class LoginPage
{
 
	 private WebDriver driver;
	 
	 //Initialize driver
	 public LoginPage(WebDriver driver)// from base class session
	 {
		 this.driver=driver;
     }

	 //locators
	 private By email=By.id("email-id");
	 private By psd=By.id("password");
	 private By btn=By.name("submit-name");
	 
	 //methods
	 public String doLogin(String em,String ps)
	 {
		 driver.findElement(email).sendKeys(em);
		 driver.findElement(psd).sendKeys(ps);
		 driver.findElement(btn).click();
		 Screenshot.captureScreenshot(driver);
		 return driver.getCurrentUrl();	
		 }
}
