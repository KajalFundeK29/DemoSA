package seleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	public WebDriver driver;
  @Parameters({"bname"})
  @Test
  public void crossBrowserTest(String bname) {
	  if(bname.equals("Chrome")) {
		 driver= new ChromeDriver();
		  System.out.println("Executing test on Chrome browser");
	  }
	  else if(bname.equals("Firefox")) {
		  driver= new FirefoxDriver();
		  System.out.println("Executing test on Firefox browser");
	  }
	  else if(bname.equals("Edge")) {
		  WebDriverManager.edgedriver().setup();
		  driver= new EdgeDriver();
		  System.out.println("Executing test on Edge browser");
	  }
	  
	  //opening a amazon site
	  driver.get("https://www.amazon.com/");
	  System.out.println("Title of the page: " + driver.getTitle());
	  driver.close();
  }
  
}
