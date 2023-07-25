package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindow {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//Create the new Window upon the same Object Reference
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.instagram.com/");
		
		//Close the Instagram Window
		Thread.sleep(3000);
//		driver.close();
		driver.quit();
	}

}
