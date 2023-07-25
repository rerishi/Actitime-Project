package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentURL1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nationalgeographic.com/");
		String actualLoginPageUrl = driver.getCurrentUrl();
		System.out.println("actualLoginPageUrl= "+actualLoginPageUrl);
		String expectedLoginPageUrl="https://www.nationalgeographic.com/";
		System.out.println("expectedLoginPageUrl= "+expectedLoginPageUrl);
		if(actualLoginPageUrl.equals(expectedLoginPageUrl))
		{
			System.out.println("Pass: The Login Page URL is found correct and it is verified");
		}
		else
		{
			System.out.println("Fail: The Login Page URL is Found INcorrect and it is Verified");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
