package assignmentQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testAdvancePropertySearch {
	
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://bhumijankari.bihar.gov.in/BiharPortal/Admin/AdvSearch/AdvSearch.aspx");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_search")).click();
		Thread.sleep(5000);
	}
}
