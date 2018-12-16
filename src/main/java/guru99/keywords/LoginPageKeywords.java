package guru99.keywords;

import org.openqa.selenium.WebDriver;

import guru99.pages.*;
import utilities.BaseTest;

public class LoginPageKeywords{
	
	private WebDriver driver;

	public LoginPageKeywords(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginkeyword(String userName, String passWord) {
		Login login = new Login(driver);
		login.open();
		login.setUserName(userName);
		login.setPassWord(passWord);
		login.clickLoginBtn();
	}
}
