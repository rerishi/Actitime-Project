package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentURL {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		String actualLoginPageUrl=driver.getCurrentUrl();
		System.out.println("actual login page URL = "+actualLoginPageUrl);
		String expectedUrl="https://www.actitime.com/";
		System.out.println("expected login page Url = "+expectedUrl);
		if(actualLoginPageUrl.contains("login-to-product"))
			System.out.println("Pass: The Login Page Url is found correct and is verified");
		else
			System.out.println("Fail: The Login Page Url is Found Incorrect and is verified");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
