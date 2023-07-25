package assignmentQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon");
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(.,'mazon')]"));

		int suggestionsCount = allSuggestions.size();
		System.out.println(suggestionsCount);

		int printedSugg = 0;
		for(int i=0;i<=suggestionsCount;i++)
		{
			WebElement sugg = allSuggestions.get(i);
			try {
				String suggText = sugg.getText();
				System.out.println(suggText);
				printedSugg++;
				// Clicking 2ndLast suggestions
				if (i == (suggestionsCount - 1))
					sugg.click();
			} catch (StaleElementReferenceException s) {

			}
		}

		System.out.println("Totel printed suggestions = "+printedSugg);
		Thread.sleep(5000);
		driver.quit();
		}

		//		for(WebElement sugg:allSuggestions)
		//		{
		//			System.out.println(sugg.getText());
		//			
		//		}
	}


