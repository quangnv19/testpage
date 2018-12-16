package utilities;

import java.sql.Timestamp;
import java.util.Random;

import objects.AccountInfo;
import objects.CustomerInfo;

public class TestDataBuilder {

	public CustomerInfo quickCustomerInfo() {
		CustomerInfo custInfo = new CustomerInfo();
		custInfo.setCustomerName("Nguyen Van A");
		custInfo.setGender("Male");
		custInfo.setDateOfBirth("10221999");
		custInfo.setAddress("144 CMT8 Street");
		custInfo.setCity("HCM");
		custInfo.setState("Tan Binh Dis");
		custInfo.setPin("111111");
		custInfo.setMobileNumber("0909123456");
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		custInfo.setEmail(timestamp.getTime() + "test@gmail.ug");
		custInfo.setPassWord("satYnam");
		custInfo.setInitialDeposit("800");
		return custInfo;
	}
	
	public AccountInfo accountInfoWithoutID() {
		AccountInfo accInfo = new AccountInfo();
		accInfo.setAmount("50");
		accInfo.setDes("Automation test");
		return accInfo;
	}
	
}
