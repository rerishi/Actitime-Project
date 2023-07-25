package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

//@Listeners(com.actitime.genericc.ListenerImplementation.class)
public class CustomerModule {                                                       // Test Class
	@Test(priority = 1, invocationCount = 3)                                        // Method which contain Test annotation
	public void createCustomer() {
		Reporter.log("createCustomer", true);
	}

	@Test(priority = 2, dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer", true);
		//Assert.fail();
	}

	@Test(priority = 3, dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("deleteCustomer", true);
	}

}
