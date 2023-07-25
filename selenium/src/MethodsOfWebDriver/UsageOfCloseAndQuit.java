package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCloseAndQuit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//it will be used to close the specific one window in a session
		//it will be used as an intermediate method to close window
        //it will not close the browser API  in the backend
//		driver.close();
		//post condition
		//terminate the condition completely
		//it will close all the windows in the session irrespective of driver control
		//it will control the browser API in the backend
		driver.quit();
	}

}
