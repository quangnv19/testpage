package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAccountPage {

	final By CUST_ID = By.xpath("//input[@name=\"cusid\"]");
	final By INITIAL_DEPOSIT = By.xpath("//input[@name=\"inideposit\"]");
	final By SUBMIT_BTN = By.xpath("//input[@type=\"submit\"]");
	
//	Message screen
	final By CREATE_ACC_MSG = By.xpath("//table[@id=\"account\"]//p");
	final By CUST_ID_MSG = By.xpath("//table[@id=\"account\"]//td[contains(string(), 'Customer ID')]/following::td[1]");
	final By ACC_ID_MSG = By.xpath("//table[@id=\"account\"]//td[contains(string(), 'Account ID')]/following::td[1]");
	final By CURRENT_AMOUNT_MSG = By.xpath("//table[@id=\"account\"]//td[contains(string(), 'Current Amount')]/following::td[1]");
	
	WebDriver driver;
	public AddAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean setCustomerID(String custID) {
		boolean result = false;
		WebElement customerNameObj = driver.findElement(CUST_ID);
		customerNameObj.clear();
		customerNameObj.sendKeys(custID);
		result = true;
		return result;
	}
	
	public boolean setInitialDeposit(String initDepos) {
		boolean result = false;
		WebElement customerNameObj = driver.findElement(INITIAL_DEPOSIT);
		customerNameObj.clear();
		customerNameObj.sendKeys(initDepos);
		result = true;
		return result;
	}
	
	public boolean clickSubmitBtn() {
		boolean result = false;
		WebElement loginBtn = driver.findElement(SUBMIT_BTN);
		loginBtn.click();
		result = true;
		return result;
	}
	
	public String getCreateAccMsg() {
		String createMsg;
		WebElement customerNameObj = driver.findElement(CREATE_ACC_MSG);
		createMsg = customerNameObj.getText();
		return createMsg;
	}
	
	public String getAccIDMsg() {
		String createMsg;
		WebElement customerNameObj = driver.findElement(ACC_ID_MSG);
		createMsg = customerNameObj.getText();
		return createMsg;
	}
	
	public String getCustIDMsg() {
		String createMsg;
		WebElement customerNameObj = driver.findElement(CUST_ID_MSG);
		createMsg = customerNameObj.getText();
		return createMsg;
	}	
	
	public String getCurrentAmont() {
		String createMsg;
		WebElement customerNameObj = driver.findElement(CURRENT_AMOUNT_MSG);
		createMsg = customerNameObj.getText();
		return createMsg;
	}	
}
