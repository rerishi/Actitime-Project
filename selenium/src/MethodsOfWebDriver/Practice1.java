package MethodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension windowSize = driver.manage().window().getSize();
		int windowHeight = windowSize.getHeight();
		int windowWidth = windowSize.getWidth();
		System.out.println("Height= "+windowHeight);
		System.out.println("Width ="+windowWidth);
		
	}

}
