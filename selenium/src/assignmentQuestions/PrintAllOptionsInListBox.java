package assignmentQuestions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsInListBox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("C:\\Users\\91738\\Desktop\\select.html");
		WebElement dropdown = driver.findElement(By.id("1"));
		Select select = new Select(dropdown);
		List<WebElement> alloptions = select.getOptions();

		Iterator<WebElement> option = alloptions.iterator();
		while (option.hasNext()) {
			WebElement o = option.next();
			System.out.println(o.getText());
		}
		driver.quit();
	}

}
