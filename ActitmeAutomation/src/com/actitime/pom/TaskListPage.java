package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustdd;
	
	@FindBy(xpath = "//input[contains(@class,'newNameField')]")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,'Customer Description')]")
	private WebElement descriptionTxtbx;
	
	@FindBy(xpath = "//div[@class='dropdownButton']/..//div[text()='- Select Customer -']")
	private WebElement selectCustDD;
	
	@FindBy(xpath = "//div[@class='searchItemList']//div[text()='Big Bang Company']")
	private WebElement bigBangCoOption;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustBnt;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustID;
	
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProjectDD;
	
	@FindBy(xpath = "//input[contains(@class,'inputNameField')]")
	private WebElement enterProjectNameTbx;
	
	@FindBy(xpath = "//div[contains(@class,'customerSelectorPlaceholder')]")
	private WebElement selectCustDDBtn;
	
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescriptionTbx;
	
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath = "//div[contains(@class,'customerSelectorPlaceholder')]//div[text()='Our company']")
	private WebElement ourCompanyOptionInCreateProject;
	
	@FindBy(xpath = "//div[contains(@class,'titleEditButtonContainer')]//div[@class='title']")
	private WebElement actualProjectID;
	
	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement newTasksDD;
	
	@FindBy(xpath = "//tr[@class='selectCustomerRow']//div[@class='dropdownButton']")
	private WebElement custDD;
	
	@FindBy(xpath = "//div[contains(@class,'customerSelector ')]//div[text()='Our company']")
	private WebElement ourCompanyOptionInCreateTasks;
	
	@FindBy(xpath = "//div[contains(@class,'projectSelector ')]")
	private WebElement selectProjectDD;
	
	@FindBy(xpath = "//div[contains(@class,'projectSelector ')]//div[text()='Accounting']")
	private WebElement accountingOption;
	
	@FindBy(xpath = "//div[@id='createTasksPopup_content']//td[@class='nameCell first']")
	private WebElement enterTaskNameTxtBx;
	
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createTasksBtn;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustdd() {
		return newCustdd;
	}

	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}

	public WebElement getDescriptionTxtbx() {
		return descriptionTxtbx;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getBigBangCoOption() {
		return bigBangCoOption;
	}

	public WebElement getCreateCustBnt() {
		return createCustBnt;
	}

	public WebElement getActualCustID() {
		return actualCustID;
	}
	
}
