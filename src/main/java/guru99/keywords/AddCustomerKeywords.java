package guru99.keywords;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import guru99.pages.AddCustomerPage;
import guru99.pages.Login;
import objects.CustomerInfo;
import utilities.BaseTest;

public class AddCustomerKeywords{

	private WebDriver driver;

	public AddCustomerKeywords(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createNewCustomerkeyword(CustomerInfo cust) {
		AddCustomerPage customerPage =  new AddCustomerPage(driver);
		
		customerPage.setCustomerName(cust.getCustomerName());
		customerPage.selectGender(cust.getGender());
		customerPage.setDateofBirth(cust.getDateOfBirth());
		customerPage.setAddress(cust.getAddress());
		customerPage.setCity(cust.getCity());
		customerPage.setState(cust.getState());
		customerPage.setPIN(cust.getPin());
		customerPage.setMobileNumber(cust.getMobileNumber());
		customerPage.setEmail(cust.getEmail());
		customerPage.setPassWord(cust.getPassWord());
		customerPage.clickSubmitBtn();
	}
	
	public void VerifyCreateCustomerMsg(String expCreateMsg) {
		String actCreateMsg;
		AddCustomerPage customerPage =  new AddCustomerPage(driver);
		actCreateMsg = customerPage.getCreateCusMsg();
		assertEquals(actCreateMsg, expCreateMsg);
	}
	
	public String getCreatedCustID() {
		String createdCustID;
		AddCustomerPage customerPage =  new AddCustomerPage(driver);
		createdCustID = customerPage.getCreateCusID();
		return createdCustID;
	}
}
