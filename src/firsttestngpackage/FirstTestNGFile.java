package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	
	public String baseUrl = "https://www.google.com/";	
	public String driverPath = "D:\\chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void vrifyHomePageTitle() {
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("Launching the chrome driver");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close(); 
  }
}
