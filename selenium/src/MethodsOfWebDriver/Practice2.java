package MethodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point windowPosition = driver.manage().window().getPosition();
		windowPosition.getX();
	}

}
