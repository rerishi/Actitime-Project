package assignmentQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAutoSuggestion {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		for(WebElement e:suggestions)
		{
			System.out.println(e.getText());
		}
	}

}
