package guru99.keywords;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import guru99.pages.AddAccountPage;
import objects.CustomerInfo;

public class AddAccountKeywords {
	
	private WebDriver driver;

	public AddAccountKeywords(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createNewAccountkeyword(CustomerInfo cust) {
		AddAccountPage accountPage =  new AddAccountPage(driver);
		accountPage.setCustomerID(cust.getCustID());
		accountPage.setInitialDeposit(cust.getInitialDeposit());
		accountPage.clickSubmitBtn();
	}
	
	public void VerifyCreateAccMsg(String expCreateMsg) {
		String actCreateMsg;
		AddAccountPage customerPage =  new AddAccountPage(driver);
		actCreateMsg = customerPage.getCreateAccMsg();
		assertEquals(actCreateMsg, expCreateMsg);
	}
	
	public void VerifyCustIDMsg(String expCustIDMsg) {
		String actCustIDMsg;
		AddAccountPage customerPage =  new AddAccountPage(driver);
		actCustIDMsg = customerPage.getCustIDMsg();
		assertEquals(actCustIDMsg, expCustIDMsg);
	}
	
	public void VerifyCurrentAmontMsg(String expCurAmontMsg) {
		String actCurAmontMsg;
		AddAccountPage customerPage =  new AddAccountPage(driver);
		actCurAmontMsg = customerPage.getCurrentAmont();
		assertEquals(actCurAmontMsg, expCurAmontMsg);
	}
	
	public String getAccountIDMsg() {
		AddAccountPage customerPage =  new AddAccountPage(driver);
		return customerPage.getAccIDMsg();
	}
	
	public String getCurrentAmountMsg() {
		AddAccountPage customerPage =  new AddAccountPage(driver);
		return customerPage.getCurrentAmont();
	}
}
