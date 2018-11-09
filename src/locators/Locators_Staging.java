package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators_Staging {
	
	public static WebElement username(WebDriver driver)
	{
		WebElement user =driver.findElement(By.name("username"));
		return user;

	}
	
	public static WebElement password(WebDriver driver)
	{
		WebElement password = driver.findElement(By.name("password"));
		return password;
	}
	
	public static WebElement login(WebDriver driver)
	{
		
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div[3]/div/button"));
		return Login;
	}
	
	public static WebElement navigate(WebDriver driver)
	{
		WebElement Navigate = driver.findElement(By.id("toggleMenu"));
		return Navigate;
	}
	
	public static WebElement expandMenu(WebDriver driver)//Function skipped 
	{
		WebElement ExpandMenu = driver.findElement(By.id("1"));
		return ExpandMenu;
	}
	
	public static WebElement click_Submenu(WebDriver driver)
	{
		WebElement ClickSubmenu = driver.findElement(By.xpath("//*[@id=\"menu_pb_active\"]/ul/li[2]/a"));
		return ClickSubmenu;
	}
	
	public static WebElement clickonCreate(WebDriver driver)
	{
		WebElement ClickonCreate = driver.findElement(By.xpath("//*[@id=\"new\"]/stashboard-task-grid-component/section/div/div[1]/div/span/a[7]"));
		return ClickonCreate;
	}
		
	public static WebElement selectAccount(WebDriver driver)
	{
		return null;
	}
	
	public static WebElement fileUpload(WebDriver driver)
	{
		return null;
	}
	
	public static WebElement uploadfileandCreateTask(WebDriver driver)
	{
		WebElement upload=driver.findElement(By.cssSelector("body > div.modal.in > div > div > form > div.modal-body > section > div > form > div:nth-child(7) > div > div.col-sm-2 > input"));
		return upload;
	}
	
	public static WebElement closex(WebDriver driver)
	{
		WebElement CloseX = driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-alert.in > div > div > div.modal-footer > button"));
		return CloseX;
	}
	
	public static WebElement closePopup(WebDriver driver)
	{
		WebElement ClosePopup = driver.findElement(By.cssSelector("body > div.modal.in > div > div > form > div.modal-header > div:nth-child(1) > button"));
		return ClosePopup;
	}
	
	public static WebElement searchforParentAccount(WebDriver driver)
	{
		WebElement SelectAccount=driver.findElement(By.cssSelector("#new > stashboard-task-grid-component > section > div > div.k-grid-header > div > table > thead.tableFloatingHeaderOriginal > tr.k-filter-row > th:nth-child(5) > span > span > span > input"));
		return SelectAccount;
	}

	public static WebElement selectSystemdate(WebDriver driver)
	{
		return null;
	}
	
	public static WebElement createdBy(WebDriver driver)
	{
		WebElement CreatedBy=driver.findElement(By.cssSelector("//div[@class='k-grid k-widget']//table//tbody//td[(contains(@span,'k-input'))]"));
		return CreatedBy;
	}
	
	public static WebElement pressEnter(WebDriver driver)
	{
		WebElement EntertheSearch=driver.findElement(By.cssSelector("#new > stashboard-task-grid-component > section > div > div.k-grid-header > div > table > thead.tableFloatingHeaderOriginal > tr.k-filter-row > th:nth-child(5) > span > span > span > input"));
		return EntertheSearch;
	}

	
	public static WebElement filtergreaterTask(WebDriver driver)
	{
		WebElement greatertask = driver.findElement(By.xpath("//*[@id=\"new\"]/stashboard-task-grid-component/section/div/div[4]/div/table/thead[1]/tr[2]/th[4]/span/span/span/input"));
		return greatertask;
	}
	
	public static WebElement viewTask(WebDriver driver)
	{
		WebElement ClickGreenButton = driver.findElement(By.xpath("//*[@id=\"new\"]/stashboard-task-grid-component/section/div/div[5]/table/tbody/tr[1]/td[3]/button[2]"));
		return ClickGreenButton;
	}
	
	public static WebElement refreshGrid(WebDriver driver)
	{
		WebElement RefreshGrid = driver.findElement(By.xpath("//*[@id=\"stashboardGrid\"]/div[3]/a[5]/span"));
		return RefreshGrid;
	}
	public static WebElement clickonErrorlink(WebDriver driver)
	{
		WebElement clicklink = driver.findElement(By.xpath("//*[@id=\"stashboardGrid\"]/div[5]/table/tbody/tr/td[6]/a"));
		return clicklink;
	}
	public static WebElement Viewtoresolve(WebDriver driver)
	{
		return null;
	}
	public static WebElement filterNarration_test_1(WebDriver driver)
	{
		WebElement filterNarration1 = driver.findElement(By.cssSelector("#normalizedTransactionsGrid_active_cell > input"));
		return filterNarration1;
	}	
	public static WebElement bulkchange(WebDriver driver)
	{
		return null;
	}
	
	public static WebElement additionaldropdown(WebDriver driver)
	{
		WebElement additionaldropdown = driver.findElement(By.cssSelector("#normalizedTransactionsGrid > div.k-header.k-grid-toolbar > div > div:nth-child(2) > div.col-sm-4 > span > span"));
		return additionaldropdown;
	}
	
	public static WebElement pressbulkchangebutton(WebDriver driver)
	{
		WebElement submitbulk=driver.findElement(By.cssSelector("#normalizedTransactionsGrid > div.k-header.k-grid-toolbar > div > div:nth-child(2) > div:nth-child(3) > span > a"));
		return submitbulk;
	}
	
	public static WebElement popupClickOk(WebDriver driver)
	{
		WebElement popupClickOk=driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary"));
		return popupClickOk;
	}
	
	/* ******STEP 11**** */
	public static WebElement filterNarration_test_2(WebDriver driver)
	{
		WebElement filterNarration2 = driver.findElement(By.cssSelector("#normalizedTransactionsGrid_active_cell > input"));
		return filterNarration2;
	}	
	
}	

