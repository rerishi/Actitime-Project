package workOnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickReleatedException {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);                                            //doubt
		
		//IDENTIFY THE MEN T-Shirts UNDER TOP WEAR
		WebElement menTshirts = driver.findElement(By.linkText("//a[text()='Topwear']/../..//a[text()='T-Shirts']"));
		
		//ElementNotInteractableException
		
		//NoSuchElementException
		
		//Element is there in DOM but it is not visible and hence it is non-intractable
		
		menTshirts.click();
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
