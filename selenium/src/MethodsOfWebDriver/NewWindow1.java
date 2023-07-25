package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.canva.com/");
		Thread.sleep(5000);
		
		//Create the new Window upon the same Object Reference
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");
		//Close the Facebook Window
		Thread.sleep(5000);
		driver.quit();
	}
	

}
