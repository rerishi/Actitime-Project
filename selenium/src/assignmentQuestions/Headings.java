package assignmentQuestions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		String eTitle = "actiTIME Online Terms of Service";
		Set<String> addr = driver.getWindowHandles();
		for(String s:addr)
		{
			driver.switchTo().window(s);
			String aTitle = driver.getTitle();
			if(eTitle.equals(aTitle))
			{
				List<WebElement> headings = driver.findElements(By.tagName("h2"));
				for(WebElement e:headings)
					System.out.println(e.getText());
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
