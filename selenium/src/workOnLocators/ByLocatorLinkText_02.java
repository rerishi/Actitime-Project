package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLinkText_02 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//Identify the forgot password option
		
		//WebElement forgotPasswordOption = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		//WebElement forgotPasswordOption = driver.findElement(By.linkText("Forgot your password?"));
		WebElement forgotPasswordOption = driver.findElement(By.partialLinkText("Forgot your password?"));
		forgotPasswordOption.click();
	}

}
