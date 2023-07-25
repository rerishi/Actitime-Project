package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertionUsingSoftAssert {
	@Test
	public void verifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle="Soogle";
		String aTitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		driver.quit();
		s.assertAll();
	}

}
