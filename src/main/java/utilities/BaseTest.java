package utilities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BaseTest {
	protected static WebDriver driver;
	

  @BeforeClass
  public void beforeClass() {
	  String exePath = "drivers/chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", exePath);
      driver = new ChromeDriver();
  }


  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
