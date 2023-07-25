package workOnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndDeselectCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		//Identify the keepLoggedInCheckBox
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		//Select the CheckBox
		keepLoggedInCheckBox.click();
		Thread.sleep(4000);
		
		//UnCheck the check Box
		keepLoggedInCheckBox.click();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
