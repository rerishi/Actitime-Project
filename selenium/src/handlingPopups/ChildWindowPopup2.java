package handlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pWh=driver.getWindowHandle();
		
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			if(pWh.equals(wh))
			{                      //CLOSING EVERY BROWSER WINDOW EXCEPT PARENT WINDOW  USING getWindowHandle() METHOD
				
			}
			else
			{
				driver.close();
			}
		}

		
	}

}
