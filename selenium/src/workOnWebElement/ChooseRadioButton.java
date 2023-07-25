package workOnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseRadioButton {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(4000);
		
		//IDENTIFY THE RADIO BUTTON
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//label[text()='Female']/..//input[@type='radio']"));
		WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']"));
		
		//CHOOSE THE MALE RADIO BUTTON
		maleRadioButton.click();
		Thread.sleep(4000);
		
		//CHOOSE THE FEMALE RADIO BUTTON
		femaleRadioButton.click();
		Thread.sleep(4000);
		
		//CHOOSE THE CUSTOM RADIO BUTTON
		customRadioButton.click();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
