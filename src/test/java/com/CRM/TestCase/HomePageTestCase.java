package com.CRM.TestCase;

import org.testng.annotations.Test;
import org.testng.Assert;


public class HomePageTestCase extends BaseClass
{
	
  @Test (priority=1)
  public void verifyURL() 
  {
	   String actUrl= hp.getAppUrl();
	   Assert.assertTrue(actUrl.contains("crm"),"Test Fails:URL not Matched!");
	   System.out.println("Test Pass:URL  matched!");
  }

@Test (priority=2)
public void verifyTitle() 
  {
	String actTitle= hp.getTitle();
	Assert.assertTrue(actTitle.contains("Customer"),"Test Fails:Title did not match!");
	System.out.println("Test Pass:Title Matched!"); // this will print only if condition will be true
  }

@Test (priority=3)
public void validateSignInLink()
 {
	String nxtPageUrl=hp.getLinkStatus();
	Assert.assertTrue(nxtPageUrl.contains("login"),"Test Fails:Login page not Open");
	System.out.println("Test pass: Aplication navigating to Login Page");
}
}

