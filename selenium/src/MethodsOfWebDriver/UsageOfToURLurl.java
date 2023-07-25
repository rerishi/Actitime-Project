package MethodsOfWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToURLurl {
	public static void main(String[] args) throws MalformedURLException, Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
//		URL mainURL = new URL("https://www.dassault-aviation.com/en/");
		URL mainUrl=new URL("https://www.dassault-aviation.com/en/");
		//build the ghroups page URL
		URL groupsPageUrl=new URL(mainUrl,"group/");
		//buid the Defence page URL
		URL defencePageUrl=new URL(mainUrl, "defense/");
		//Build the civil page URL
		URL civilPageUrl=new URL(mainUrl, "civil/");
		//Build the Space page URL
		URL spacePageUrl=new URL(mainUrl, "space/");
		//Build the Passion page URL
		URL passionPageUrl=new URL(mainUrl, "passion/");
		//----------------------------------------------
		Thread.sleep(3000);
		
		driver.navigate().to(defencePageUrl);
		Thread.sleep(3000);
		
		driver.navigate().to(groupsPageUrl);
		Thread.sleep(3000);
		
		driver.navigate().to(passionPageUrl);
		Thread.sleep(3000);
		
		driver.navigate().to(spacePageUrl);
		Thread.sleep(3000);
		
		driver.navigate().to( civilPageUrl);
		Thread.sleep(3000);
		
		//Post-Condition
		driver.manage().window().minimize();
		
		//terminate the session
		driver.quit();
		
		
		
		
	}

}
