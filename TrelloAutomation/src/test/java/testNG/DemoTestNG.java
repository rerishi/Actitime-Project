package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
	public void demoTest()
	{
		Reporter.log("Welcome to testNG", true);
	}

}
