package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenShot {
	
	@Test
	public void testScreenshot() throws IOException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    TakesScreenshot t=(TakesScreenshot) driver;     //typeCasting
    
    File src = t.getScreenshotAs(OutputType.FILE);   //taking Screenshot (temporarily)
    
    File dest = new File("./ScreenShot/ss.png");     //making empty Screenshot file
    
    FileUtils.copyFile(src, dest);                //Copying the file (Screenshot)
    driver.close();
	}
}
