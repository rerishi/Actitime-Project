package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfReload {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
