package handlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		String pWh = driver.getWindowHandle();
		System.out.println(pWh);      //GETTING PARENT WINDOE HANDLE
		Set<String> allWh = driver.getWindowHandles();
		int count=allWh.size();
		System.out.println(count);   //GETTING COUNT OF NUMBER OF OPEN BROWSER WINDOW'S
		for(String wh:allWh)
		{
			System.out.println(wh);   // GETTING WINDOW HANDLE OF EACH OPEN BROWSER WINDOW'S
		}
		driver.quit();
	}

}
