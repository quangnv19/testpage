package guru99.keywords;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import guru99.pages.AddCustomerPage;
import guru99.pages.DepositPage;
import objects.AccountInfo;
import objects.CustomerInfo;

public class DepositKeywords {
	private WebDriver driver;

	public DepositKeywords(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addNewDepositkeyword(AccountInfo acc) {
		DepositPage depositp =  new DepositPage(driver);
		depositp.setAccountID(acc.getAccountID());
		depositp.setAmount(acc.getAmount());
		depositp.setDescription(acc.getDes());
		depositp.clickSubmitBtn();
	}
	
	public void VerifyAccountIDMsg(String expAccIDMsg) {
		String actAccIDMsg;
		DepositPage customerPage =  new DepositPage(driver);
		actAccIDMsg = customerPage.getAccIDMsg();
		assertEquals(actAccIDMsg, expAccIDMsg);
	}
	
	public void VerifyAmountCreditedMsg(String expAmountMsg) {
		String actAmountMsg;
		DepositPage customerPage =  new DepositPage(driver);
		actAmountMsg = customerPage.getAmountCreditedMsg();
		assertEquals(actAmountMsg, expAmountMsg);
	}
	
	public void VerifyCurrentBalanceMsg(String expCurBalanceMsg) {
		String actCurBalanceMsg;
		DepositPage customerPage =  new DepositPage(driver);
		actCurBalanceMsg = customerPage.getCurrentBalanceMsg();
		assertEquals(actCurBalanceMsg, expCurBalanceMsg);
	}
}
