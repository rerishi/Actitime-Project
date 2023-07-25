package MethodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandles {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		
		//Create a new Window upon the same Object Reference
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.nationalgeographic.com/");
		
		//Capture all the WindowID
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		//Check for How Many WindowID
		
		int windowIdCount = allWindowId.size();
		
		//Print the Count of the Window ID
		System.out.println(windowIdCount);
		
		//Iterate the set of window ID
		
		for(String wid:allWindowId)
		{
			//Print Each Window ID
			System.out.println(wid);
		}
		
	}

}
