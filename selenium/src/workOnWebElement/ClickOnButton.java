package workOnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton {
	public static void main(String[] args) throws Throwable {
		
		//Instansiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Maximize the Browser specific Window
		driver.manage().window().maximize();
		//Pass the Main URL of the app
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		//Find the Login Button
		WebElement loginButton = driver.findElement(By.name("login"));
		
		//Click on login Button
		loginButton.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
