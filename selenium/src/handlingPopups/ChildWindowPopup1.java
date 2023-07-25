package handlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pTitle=driver.getTitle();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			String aTitle = driver.getTitle();
			if(pTitle.equals(aTitle))
			{                           //CLOSING EVERY BROWSER WINDOW EXCEPT PARENT WINDOW  USING getTitle() METHOD
				
			}
			else
			{
				driver.close();
			}
		}

		
	}

}
