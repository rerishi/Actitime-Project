package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfFullScreen {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/shorts/kszVmSqPYMs");
		Thread.sleep(6000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.quit();
	}

}
