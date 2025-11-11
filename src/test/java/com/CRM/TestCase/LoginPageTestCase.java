package com.CRM.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.Assert;


public class LoginPageTestCase extends BaseClass 
{
	@BeforeClass
	public void pageSetup()
	{
		hp.getLinkStatus();
	}
  @Test
  public void validateLogin() 
  {
	 String url= lp.doLogin("Test@gmail.com","test@123");
	  Assert.assertTrue(url.contains("customers"),"Test fails");
	  System.out.println("Login Successffull!");
  }
  
}
 