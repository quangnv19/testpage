package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeNavigate {
	WebDriver driver;
	final By NEW_CUSTOMER_LINK = By.xpath("//ul[@class=\"menusubnav\"]//a[contains(string(), 'New Customer')]");
	final By NEW_ACCOUNT_LINK = By.xpath("//ul[@class=\"menusubnav\"]//a[contains(string(), 'New Account')]");
	final By DEPOSIT_LINK = By.xpath("//ul[@class=\"menusubnav\"]//a[contains(string(), 'Deposit')]");
	
	public HomeNavigate(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean clickNewCustomer() {
		boolean result = false;
		WebElement newCustLink = driver.findElement(NEW_CUSTOMER_LINK);
		newCustLink.click();
		result = true;
		return result;
	}
	
	public boolean clickNewAccount() {
		boolean result = false;
		WebElement newCustLink = driver.findElement(NEW_ACCOUNT_LINK);
		newCustLink.click();
		result = true;
		return result;
	}
	
	public boolean clickDeposit() {
		boolean result = false;
		WebElement newCustLink = driver.findElement(DEPOSIT_LINK);
		newCustLink.click();
		result = true;
		return result;
	}
}
