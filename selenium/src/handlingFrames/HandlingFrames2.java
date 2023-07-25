package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//WAS TO TYPE abcd IN t1 AND t2 TEXTBOX ALTERNATIVELY, CHARACTER BY CHARACTER.
public class HandlingFrames2 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/91738/Desktop/Page1.html");
		driver.findElement(By.id("f1")).sendKeys("a");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys("d");
	}

}
