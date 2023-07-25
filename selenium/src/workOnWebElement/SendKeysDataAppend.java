package workOnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDataAppend {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		//identify the username textfield
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		
		//Append the data to the same
		
		usernameTextField.clear();
		usernameTextField.sendKeys("Selenium");
		
	}

}
