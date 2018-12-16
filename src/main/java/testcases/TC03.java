package testcases;

import org.testng.annotations.Test;
import guru99.keywords.AddAccountKeywords;
import guru99.keywords.AddCustomerKeywords;
import guru99.keywords.DepositKeywords;
import guru99.keywords.LoginPageKeywords;
import guru99.pages.HomeNavigate;
import objects.AccountInfo;
import objects.CustomerInfo;
import utilities.BaseTest;
import utilities.TestDataBuilder;

public class TC03 extends BaseTest{
	@Test(description="Verify deposit function work fine with the account just created")
	  public void testScript() {
		  LoginPageKeywords login = new LoginPageKeywords(driver);
		  login.loginkeyword("mngr168269", "satYnam");
		  
		  HomeNavigate navigate = new HomeNavigate(driver);
		  navigate.clickNewCustomer();
		  
		  CustomerInfo cust = new CustomerInfo();
		  TestDataBuilder custData = new TestDataBuilder();
		  cust = custData.quickCustomerInfo();
		  
		  AddCustomerKeywords addCust = new AddCustomerKeywords(driver);
		  addCust.createNewCustomerkeyword(cust);
		  cust.setCustID(addCust.getCreatedCustID());
		  
		  navigate.clickNewAccount();
		  AddAccountKeywords addAcc = new AddAccountKeywords(driver);
		  addAcc.createNewAccountkeyword(cust);
		 
		  TestDataBuilder accData = new TestDataBuilder();
		  AccountInfo acc = new AccountInfo();
		  acc = accData.accountInfoWithoutID();
		  
		  acc.setAccountID(addAcc.getAccountIDMsg());
		  acc.setCurrentAmount(addAcc.getCurrentAmountMsg());
		  
		  // Navigate to Deposit screen
		  navigate.clickDeposit();
		  
		  //Fill Deposit form
		  DepositKeywords deposit = new DepositKeywords(driver);
		  deposit.addNewDepositkeyword(acc);
		  
		  deposit.VerifyAccountIDMsg(acc.getAccountID());
		  deposit.VerifyAmountCreditedMsg(acc.getAmount());
		  int expCurAmount = Integer.parseInt(acc.getCurrentAmount()) + Integer.parseInt(acc.getAmount());
		  deposit.VerifyCurrentBalanceMsg(expCurAmount + "");
	  }
}
