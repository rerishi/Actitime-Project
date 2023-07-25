package handlingPopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/abc.html");
		Thread.sleep(4000);
		//File f = new File("C:\\Users\\91738\\Desktop\\Rishav\\selenium\\data\\Resume.pdf");
		//File f = new File("C:\\Users\\91738\\Desktop\\Resume.pdf");
		File f = new File("./data/Resume.pdf");
		String abPath=f.getAbsolutePath();
		System.out.println(abPath);
		driver.findElement(By.id("cv")).sendKeys(abPath);
		Thread.sleep(3000);
		driver.quit();
	}

}
//
