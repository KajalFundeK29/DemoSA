package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	public WebDriver driver;
  @Parameters({"bname"})
  @Test
  public void crossBrowserTest(String bname) throws MalformedURLException, InterruptedException {
	  
	  System.out.println("Remote Driver connectivity is Started!!!");
	  if(bname.equalsIgnoreCase("Chrome")) {
		  ChromeOptions options = new ChromeOptions();
		 driver= new RemoteWebDriver(new URL("http://localhost:4444"), options);
		  System.out.println("Executing test on Chrome browser");
	  }
	  else if(bname.equalsIgnoreCase("Firefox")) {
		 FirefoxOptions options = new FirefoxOptions();
			 driver= new RemoteWebDriver(new URL("http://localhost:4444"), options);
		  System.out.println("Executing test on Firefox browser");
	  }
	  else if(bname.equalsIgnoreCase("Edge")) {
		  //WebDriverManager.edgedriver().setup();
		  EdgeOptions options = new EdgeOptions();
			 driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		  System.out.println("Executing test on Edge browser");
	  }
	  
	  //opening a amazon site
	  System.out.println("Remote Driver connectivity is completed!!!");
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.com/");
	  System.out.println("Title of the page: " + driver.getTitle());
	  driver.close();
  }
  
}
