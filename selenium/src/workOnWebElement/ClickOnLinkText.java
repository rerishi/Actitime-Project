package workOnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//Identify the Forgotten Password? link text
		WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPassword.click();
		
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
