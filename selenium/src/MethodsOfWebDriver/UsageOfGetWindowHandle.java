package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//pass the main URL of the application
		driver.get("https://www.facebook.com/");
		
		//get the Window ID
		//Capture the current wid which is under driver control
		
		String facebookWid=driver.getWindowHandle();
		
		System.out.println(facebookWid);
		
		//Terminate the session
		
		driver.quit();
	}

}
