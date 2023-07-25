package MethodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point currentWinPosition = driver.manage().window().getPosition();
		int startX = currentWinPosition.getX();
		int startY = currentWinPosition.getY();
		System.out.println("X = "+startX);
		System.out.println(" y = "+startY);
		Thread.sleep(3000);
		Point targetPosition = new Point(151, 210);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
