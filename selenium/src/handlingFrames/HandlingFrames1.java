package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS TO TYPE jsp IN t2-TEXTBOX AND qsp IN t1-TEXTBOX.
public class HandlingFrames1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("JSP");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("QSP");
	}

}
