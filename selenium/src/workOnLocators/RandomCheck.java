package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomCheck {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		
		//Find the login/ Register Button
		//By ID
		//driver.findElement(By.id("my-acc-btn")).click();
		//By class-Name
		//driver.findElement(By.className("transparent")).click();
		//By TagName
		//NOTE: Here there are 7-duplicates out of that first button is the one which we want to identify
		
		//Since we know that findElements() will always identify the first available element
		//here address is working by chance- It should not be reality
		//driver.findElement(By.tagName("button")).click();
		//By CSS
		//driver.findElement(By.cssSelector("button[id='my-acc-btn']")).click();            
		//driver.findElement(By.cssSelector("button[class='transparent']")).click();
		//By Xpath
		//driver.findElement(By.xpath("//button[@id='my-acc-btn']")).click();        //By ID Complete Att. Value
		//driver.findElement(By.xpath("//button[@class='transparent']")).click();    //By Class Complete Att. Value
		//driver.findElement(By.xpath("//button[contains(@id,'my-acc')]")).click();  //By ID Partial Att. Value
		//driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();     //By Partial sub tag text
		//driver.findElement(By.xpath("//button[contains(.,'Register')]")).click();    //By Partial sub tag text
		
		//Independent and Dependent Xpath
		driver.findElement(By.xpath("//span[@class='loginRegister']/parent::button")).click();   
	}

}
