package MethodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	public static void main(String[] args) throws Throwable {
		//Instantiate the Browser Specific Class
		WebDriver driver=new ChromeDriver();
		//Maximize the Window
		driver.manage().window().maximize();
		//Pass The MAin URL of the App
		driver.get("https://www.facebook.com/");
		//Define the New Window- Web Driver
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(5000);
		//Set the Size of the Window
		//Create the Dimension Object to Define the Window Target Size- Dimension(int width, int height)
		
		Dimension targetWindowSize=new Dimension(600, 300);
		//assign the specified dimension to the setSize(dimension targetSize)
		driver.manage().window().setSize(targetWindowSize);
		Thread.sleep(5000);
		//Specify the position or co-ordinates of the window on the screen
		Point targetWindowPosition=new Point(150, 200);
		driver.manage().window().setPosition(targetWindowPosition);
		//Capture the Window Size
		Dimension windowSize = driver.manage().window().getSize();
		int windowWidth = windowSize.getWidth();
		System.out.println("windowWidth= "+ windowWidth);
		int windowHeight = windowSize.getHeight();
		System.out.println("windowHeight= "+windowHeight);
		//Capture the Window Position
		Point windowPosition = driver.manage().window().getPosition();
		int windowStartX = windowPosition.getX();
		System.out.println("windowStartX= "+windowStartX);
		int windowStartY = windowPosition.getY();
		System.out.println("windowStartY= "+windowStartY);
	}

}
