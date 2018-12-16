package testcases;

import org.testng.annotations.Test;

import guru99.keywords.AddAccountKeywords;
import guru99.keywords.AddCustomerKeywords;
import guru99.keywords.LoginPageKeywords;
import guru99.pages.HomeNavigate;
import objects.CustomerInfo;
import utilities.BaseTest;
import utilities.TestDataBuilder;

public class TC02 extends BaseTest{
	@Test(description="Verify to create new account based on the customer just created above")
	  public void testScript() {
		  LoginPageKeywords login = new LoginPageKeywords(driver);
		  login.loginkeyword("mngr168269", "satYnam");
		  
		  HomeNavigate navigate = new HomeNavigate(driver);
		  navigate.clickNewCustomer();
		  
		  CustomerInfo cust = new CustomerInfo();
		  TestDataBuilder custdata = new TestDataBuilder();
		  cust = custdata.quickCustomerInfo();
		  
		  AddCustomerKeywords addCust = new AddCustomerKeywords(driver);
		  addCust.createNewCustomerkeyword(cust);
		  cust.setCustID(addCust.getCreatedCustID());
		  
		  navigate.clickNewAccount();
		  AddAccountKeywords addAcc = new AddAccountKeywords(driver);
		  addAcc.createNewAccountkeyword(cust);
		  addAcc.VerifyCreateAccMsg("Account Generated Successfully!!!");
		  addAcc.VerifyCurrentAmontMsg(cust.getInitialDeposit());
		  addAcc.VerifyCustIDMsg(cust.getCustID());
	  }
}
