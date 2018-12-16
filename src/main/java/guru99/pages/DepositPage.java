package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepositPage {
	final By ACCOUNT_ID = By.xpath("//input[@name=\"accountno\"]");
	final By AMOUNT = By.xpath("//input[@name=\"ammount\"]");
	final By DES = By.xpath("//input[@name=\"desc\"]");
	final By SUBMIT_BTN = By.xpath("//input[@type=\"submit\"]");
	
	//Transaction details of Deposit
	final By ACC_ID_MSG = By.xpath("//table[@id=\"deposit\"]//td[contains(string(), 'Account No')]/following::td[1]");
	final By AMOUNT_MSG = By.xpath("//table[@id=\"deposit\"]//td[contains(string(), 'Amount Credited')]/following::td[1]");
	final By CURRENT_AMOUNT_MSG = By.xpath("//table[@id=\"deposit\"]//td[contains(string(), 'Current Balance')]/following::td[1]");
	
	WebDriver driver;
	public DepositPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean setAccountID(String accID) {
		boolean result = false;
		WebElement customerNameObj = driver.findElement(ACCOUNT_ID);
		customerNameObj.clear();
		customerNameObj.sendKeys(accID);
		result = true;
		return result;
	}
	
	public boolean setAmount(String amount) {
		boolean result = false;
		WebElement customerNameObj = driver.findElement(AMOUNT);
		customerNameObj.clear();
		customerNameObj.sendKeys(amount);
		result = true;
		return result;
	}
	
	public boolean setDescription(String des) {
		boolean result = false;
		WebElement customerNameObj = driver.findElement(DES);
		customerNameObj.clear();
		customerNameObj.sendKeys(des);
		result = true;
		return result;
	}
	
	public boolean clickSubmitBtn() {
		boolean result = false;
		WebElement newCustLink = driver.findElement(SUBMIT_BTN);
		newCustLink.click();
		result = true;
		return result;
	}
	
	public String getAccIDMsg() {
		String createMsg;
		WebElement customerNameObj = driver.findElement(ACC_ID_MSG);
		createMsg = customerNameObj.getText();
		return createMsg;
	}
	
	public String getAmountCreditedMsg() {
		String amountMsg;
		WebElement amountCreditedObj = driver.findElement(AMOUNT_MSG);
		amountMsg = amountCreditedObj.getText();
		return amountMsg;
	}
	
	public String getCurrentBalanceMsg() {
		String curAmountMsg;
		WebElement currentBalanceObj = driver.findElement(CURRENT_AMOUNT_MSG);
		curAmountMsg = currentBalanceObj.getText();
		return curAmountMsg;
	}
}
