package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomerPage {
	
	final By CUSTOMER_NAME = By.xpath("//input[@name=\"name\"]");
	final By GENDER_MALE = By.xpath("//input[@value=\"m\"]");
	final By GENDER_FEMALE = By.xpath("//input[@value=\"f\"]");
	final By DATE_OF_BIRTH = By.xpath("//input[@name=\"dob\"]");
	final By ADDRESS = By.xpath("//textarea[@name=\"addr\"]");
	final By CITY = By.xpath("//input[@name=\"city\"]");
	final By STATE = By.xpath("//input[@name=\"state\"]");
	final By PIN = By.xpath("//input[@name=\"pinno\"]");
	final By MOBILE_NUMBER = By.xpath("//input[@name=\"telephoneno\"]");
	final By SUBMIT_BTN = By.xpath("//input[@name=\"sub\"]");
	final By EMAIL = By.xpath("//input[@name=\"emailid\"]");
	final By CREATE_CUS_MSG = By.xpath("//table[@id=\"customer\"]//p");
	final By PASS_WORD = By.xpath("//input[@name=\"password\"]");
	
	//Customer Registered
	final By CUST_ID_MSG = By.xpath("//table[@id=\"customer\"]//td[contains(string(), 'Customer ID')]/following::td[1]");
		
	WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean setPassWord(String passWord) {
		boolean result = false;
		WebElement passWordObj = driver.findElement(PASS_WORD);
		passWordObj.clear();
		passWordObj.sendKeys(passWord);
		result = true;
		return result;
	}
	
	public boolean setCustomerName(String cusName) {
		boolean result = false;
		WebElement customerNameObj = driver.findElement(CUSTOMER_NAME);
		customerNameObj.clear();
		customerNameObj.sendKeys(cusName);
		result = true;
		return result;
	}
	
	public boolean setDateofBirth(String date) {
		boolean result = false;
		WebElement dateBirthObj = driver.findElement(DATE_OF_BIRTH);
		dateBirthObj.clear();
		dateBirthObj.sendKeys(date);
		result = true;
		return result;
	}
	
	public boolean setAddress(String address) {
		boolean result = false;
		WebElement addressObj = driver.findElement(ADDRESS);
		addressObj.clear();
		addressObj.sendKeys(address);
		result = true;
		return result;
	}
	
	public boolean setCity(String city) {
		boolean result = false;
		WebElement cityObj = driver.findElement(CITY);
		cityObj.clear();
		cityObj.sendKeys(city);
		result = true;
		return result;
	}
	
	public boolean setState(String state) {
		boolean result = false;
		WebElement stateObj = driver.findElement(STATE);
		stateObj.clear();
		stateObj.sendKeys(state);
		result = true;
		return result;
	}
	
	public boolean setPIN(String pin) {
		boolean result = false;
		WebElement pinObj = driver.findElement(PIN);
		pinObj.clear();
		pinObj.sendKeys(pin);
		result = true;
		return result;
	}
	
	public boolean setMobileNumber(String mobileNumber) {
		boolean result = false;
		WebElement mobileNumberObj = driver.findElement(MOBILE_NUMBER);
		mobileNumberObj.clear();
		mobileNumberObj.sendKeys(mobileNumber);
		result = true;
		return result;
	}
	
	public boolean setEmail(String email) {
		boolean result = false;
		WebElement emailObj = driver.findElement(EMAIL);
		emailObj.clear();
		emailObj.sendKeys(email);
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
	
	public boolean selectGender(String type) {
		boolean result = false;
		if(type.equalsIgnoreCase("MALE")) {
			WebElement loginBtn = driver.findElement(GENDER_MALE);
			loginBtn.click();
			result = true;
		}else {
			WebElement loginBtn = driver.findElement(GENDER_FEMALE);
			loginBtn.click();
			result = true;
		}
		return result;
	}
	
	public String getCreateCusMsg() {
		String createMsg;
		WebElement createMsgObj = driver.findElement(CREATE_CUS_MSG);
		createMsg = createMsgObj.getText();
		return createMsg;
	}
	
	public String getCreateCusID() {
		String custIDMsg;
		WebElement customerIDMsgObj = driver.findElement(CUST_ID_MSG);
		custIDMsg = customerIDMsgObj.getText();
		return custIDMsg;
	}
}
