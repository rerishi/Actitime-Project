package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindowTab {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nationalgeographic.com/");
		Thread.sleep(5000);
		
		//Create the new tab in the same window with the same object reference
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		//driver is referring to the latest tab in the same window
		
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		
	}

}
