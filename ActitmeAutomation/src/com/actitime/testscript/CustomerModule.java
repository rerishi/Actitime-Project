package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, Throwable
	{
		FileLib f=new FileLib();
		String custName = f.getExcelData("CreateCustomer", 6, 3);
		String custDescription = f.getExcelData("CreateCustomer", 1, 4);
		Reporter.log("Create Customer", true);
		HomePage h=new HomePage(driver);
		h.setTasksTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustdd().click();
		t.getEnterCustNameTbx().sendKeys(custName);
		t.getDescriptionTxtbx().sendKeys(custDescription);
		t.getSelectCustDD().click();
		t.getBigBangCoOption().click();
		t.getCreateCustBnt().click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Thread.sleep(3000);
		try
		{
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			
		}
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustID(), custName));
		
		String actualText=t.getActualCustID().getText();
		Assert.assertEquals(actualText, custName);
		
	}

}
