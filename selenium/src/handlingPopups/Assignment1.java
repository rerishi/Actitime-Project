package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		WebElement policyNoTextbox = driver.findElement(By.id("policynumber"));
		policyNoTextbox.click();
		policyNoTextbox.sendKeys("123");
		WebElement dateOfBirth = driver.findElement(By.id("dob"));
		dateOfBirth.click();
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		yearDropDown.click();
		Select yearSelect = new Select(yearDropDown);
		yearSelect.selectByValue("1993");
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		monthDropDown.click();
		Select monthSelect = new Select(monthDropDown);
		monthSelect.selectByVisibleText("Sep");
		driver.findElement(By.linkText("20")).click();
		WebElement contactNoTextField = driver.findElement(By.id("alternative_number"));
		contactNoTextField.click();
		contactNoTextField.sendKeys("9845098450");
		WebElement letsRenewButton = driver.findElement(By.id("renew_policy_submit"));
		letsRenewButton.click();
		WebElement invalidPolicyNoError = driver.findElement(By.id("policynumberError"));
		if (invalidPolicyNoError.isDisplayed()) {
			System.out.println("Pass and verified as Error Message(Please Enter Valid Policy No.) is displayed.");
		}
		else
		{
			System.out.println("Fail and verified as no Error Message is displayed.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
