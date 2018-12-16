package guru99.pages;

import org.openqa.selenium.*;

public class Login {

	final By USER_NAME_PATH = By.xpath("//form//input[@name=\"uid\"]");
	final By PASS_WORD_PATH = By.xpath("//form//input[@name=\"password\"]");
	final By LOGIN_PATH = By.xpath("//form//input[@name=\"btnLogin\"]");

	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean open() {
		boolean result = false;
		driver.get("http://demo.guru99.com/v4/");
		result = true;
		return result;
	}
	
	public boolean setUserName(String userName) {
		boolean result = false;
		WebElement userNameObj = driver.findElement(USER_NAME_PATH);
		userNameObj.clear();
		userNameObj.sendKeys(userName);
		result = true;
		return result;
	}
	
	public boolean setPassWord(String passWord) {
		boolean result = false;
		WebElement passWordObj = driver.findElement(PASS_WORD_PATH);
		passWordObj.clear();
		passWordObj.sendKeys(passWord);
		result = true;
		return result;
	}
	
	public boolean clickLoginBtn() {
		boolean result = false;
		WebElement loginBtn = driver.findElement(LOGIN_PATH);
		loginBtn.click();
		result = true;
		return result;
	}
	
}
