package handlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		Set<String> wind = driver.getWindowHandles();
		for(String s: wind)
		{
			driver.switchTo().window(s);
		}
		
	}

}
// Address of the browser present on the desktop is called Window Handle(Session ID).
//To retrieve it(Session ID/Address), we use getWindowHandle() method.

//What is the difference between getWindowHandle and getWindowHandles()?
