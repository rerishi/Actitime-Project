package workOnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObscuredElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		// Identify the Customer Service Option
		WebElement customerService = driver.findElement(By.xpath("//a[.=\"Today's Deals\"]/following-sibling::a[.='Customer Service']"));
		
		//ElementClickInterceptedException
		
		//When we try to click on the target element, unknown element will be in between, we call it has OBSCURED ELEMENT
		WebElement obscuredElement = driver.findElement(By.xpath("//span[contains(.,\"Don't Change\")]/preceding-sibling::input"));
        
		obscuredElement.click();
		Thread.sleep(3000);
		customerService.click();
		

	}

}
        //  "//a[.=\"Today's Deals\"]/following-sibling::a[.='Customer Service']"
