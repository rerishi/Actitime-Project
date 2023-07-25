package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorId_01 {
	public static void main(String[] args) {
		//Instantiate the Browser specific class
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//pass the main URL of the app
		driver.get("https://www.amazon.in/");
		//Identify the search Dropdown
		WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
		searchDropDown.click();
		
		
	}

}
