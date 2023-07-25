package assignmentQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAmazonAutoSuggestionsNClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//Locating Search-bar
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon");
		
		//Finding and Storing All Auto Suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(.,'mazon')]"));
		
        //Printing Count of all Auto suggestions
		int suggestionsCount = allSuggestions.size();
		System.out.println(suggestionsCount);
		
		int printedSuggestion = 0;
		for(int i=0;i<=suggestionsCount;i++)
		{
			WebElement suggestion = allSuggestions.get(i);
			String SuggestedText = suggestion.getText();
			System.out.println(SuggestedText);
			printedSuggestion++;
			
			//Clicking Second-last suggestion
			if(i==(suggestionsCount-1))
			{
				suggestion.click();
			}
			System.out.println("Total printed Suggestion = "+ printedSuggestion);
			Thread.sleep(5000);
			driver.manage().window().minimize();
			driver.quit();
		}
		
	}

}
