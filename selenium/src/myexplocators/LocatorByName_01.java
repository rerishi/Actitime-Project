package myexplocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByName_01 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Find the login Button
		WebElement loginButton = driver.findElement(By.name("login"));
		
		//Click on the login button
		loginButton.click();
		
		
		
	}

}
