package myexplocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById_01 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//find the signin button
		WebElement signinButton = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		//click on the signin button
		signinButton.click();
	}

}

