package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	    String webPageTitle=driver.getTitle();
	    System.out.println("webpagetitle = "+webPageTitle);
	    Thread.sleep(4000);
	    driver.get("https://www.facebook.com/");
	    String loginPageTitle=driver.getTitle();
	    System.out.println("loginpagetitle = "+loginPageTitle);
	}

}
