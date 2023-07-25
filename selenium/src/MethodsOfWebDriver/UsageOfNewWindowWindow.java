package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindowWindow {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//Create the new Window with the same browser object Reference
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//driver is controlling the latest window in the session
		
		driver.get("https://www.nationalgeographic.com/");
		
		
	}

}
