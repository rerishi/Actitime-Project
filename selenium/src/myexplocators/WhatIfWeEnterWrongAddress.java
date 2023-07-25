package myexplocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWeEnterWrongAddress {
	public static void main(String[] args) {
		//Instantiate the Browser Specific class
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//pass the main URL of the app
		driver.get("https://www.facebook.com/");
		//Identify the login button
		//NoSuchElementException-run-unchecked-selenium
		//Reason-When we write the wrong address
		
		
		WebElement loginButton = driver.findElement(By.id("u_0_5_b5"));
		//Interact with the login Button- click
		loginButton.click();
	}

}
