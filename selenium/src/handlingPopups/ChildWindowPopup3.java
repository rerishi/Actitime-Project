package handlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			driver.close();    //CLOSING ALL THE BROWSERS WITHOUT USING quit() METHOD
		}

		
	}


}
