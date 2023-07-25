package handlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPrintPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//STEP-1: oPEN CHROME BROWSER
		WebDriver driver=new FirefoxDriver();
		
		//STEP-2: GO TO DOWNLOADS PAGE OF SELENIUM
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		Robot r=new Robot();
		
		//STEP-3: PRESS THE CONTROL + P TO GET THE POPUP
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		//STEP-4: PRESS THE TAB BUTTON TWO TIMES, TO SELECT THE PAGE 
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
		
		//STEP-5: PRESS DOWN ARROW KEY 4-TIMES TO SELECT CUSTOM
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		//STEP-6: PRESS 1-2 TO TAKE FIRST TWO PAGES
		r.keyPress(KeyEvent.VK_1);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_MINUS);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(2000);
		
		//STEP-7: CLICK ON PRINT BUTTON BY PRESSING ENTER KEY
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		//STEP-8: TYPE THE DOC NAME BY WHICH WE WANT TO TAKE THE PRINT
		r.keyPress(KeyEvent.VK_K);
		Thread.sleep(2000);
		
		//STEP-9: FINALLY CLICK ON ENTER TO TAKE THE PRINT
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
