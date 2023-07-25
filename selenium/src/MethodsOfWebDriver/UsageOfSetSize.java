package MethodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSize {
	public static void main(String[] args) throws Throwable {
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//pass the main URL of the app
		driver.get("https://www.facebook.com/");
		//Define the new Window- WebDriver
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		//Set the size of the window
		//Create the Dimension Object to define the window target Size- 
		// Dimension(int width,. int height)
		Dimension targetWindowSize = new Dimension(200, 300);
		//assign the specified dimension to the setSize(Dimension targetSize)
		
		driver.manage().window().setSize(targetWindowSize);
		
	}

}
