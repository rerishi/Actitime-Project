package MethodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPosition {
	public static void main(String[] args) throws Throwable {
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//pass the main URL of the app
		driver.get("https://www.facebook.com/");
		//define the new window-webDriver
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.instagram.com/");
		Thread.sleep(5000);
		//set the size of the window
		//Create the Dimension Object to define the window target size- Dimension(int width, int height)
		Dimension targetWindowize = new Dimension(200, 300);
		//assign the specified dimension to the setSize(Dimension targetSize)
		driver.manage().window().setSize(targetWindowize);
		Thread.sleep(2000);
		//Specify the position or co-ordinates of the window on the screen
		Point targetWindowPosition = new Point(150, 200);
		driver.manage().window().setPosition(targetWindowPosition);
		
	}

}
