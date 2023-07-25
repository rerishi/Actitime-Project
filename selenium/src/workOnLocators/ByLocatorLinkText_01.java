package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLinkText_01 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Find the Forgotten Password
		
		WebElement linkText = driver.findElement(By.linkText("Forgotten password?"));
		linkText.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
