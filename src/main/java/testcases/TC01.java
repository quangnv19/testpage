package testcases;

import org.testng.annotations.Test;

import guru99.keywords.AddCustomerKeywords;
import guru99.keywords.LoginPageKeywords;
import guru99.pages.HomeNavigate;
import objects.CustomerInfo;
import utilities.BaseTest;
import utilities.TestDataBuilder;

public class TC01 extends BaseTest{
	  
  @Test(description="Verify new customer can be created")
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
	  addCust.VerifyCreateCustomerMsg("Customer Registered Successfully!!!");
  }

}
