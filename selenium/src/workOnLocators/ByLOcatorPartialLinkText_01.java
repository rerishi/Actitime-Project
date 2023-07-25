package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;                                             ////??????????????
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByLOcatorPartialLinkText_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alvas.org/");
		
		//Alva’s College of Medical Laboratory Technology & Post Graduate Research Center
		//Note: Partial Link Text will work for only continuous sequential tag text <a>
		
		//<a> When it is very lengthy
		//<a> tag-text contains unbreakable spaces
		
		WebElement college = driver.findElement(By.partialLinkText("College of Medical Laboratory Technology & Post"));
		
		new Actions(driver).scrollToElement(college).perform();
		
		college.click();
	}

}
