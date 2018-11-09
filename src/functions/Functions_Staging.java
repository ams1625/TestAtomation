package functions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
//import java.security.KeyFactorySpi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import locators.Locators_Staging;


public class Functions_Staging {
	
	
	public static void username(WebDriver driver,String a)
	{
		Locators_Staging.username(driver).clear();
		Locators_Staging.username(driver).sendKeys(a);
	}
	
	public static void password(WebDriver driver, String psw)
	{
		Locators_Staging.password(driver).clear();
		Locators_Staging.password(driver).sendKeys(psw);
	}
	
	public static void login(WebDriver driver)
	{
		Locators_Staging.login(driver).click();
	}
	
	/* ************************************************ */
	
	public static void navigate(WebDriver driver)
	{
		Locators_Staging.navigate(driver).click();
	}
	
	public static void expandMenu(WebDriver driver)
	{
		Locators_Staging.expandMenu(driver).click();
	}
	
	public static void click_Submenu(WebDriver driver)
	{
		Locators_Staging.click_Submenu(driver).click();
	}
	
	public static void clickonCreate(WebDriver driver)
	{
		Locators_Staging.clickonCreate(driver).click();
	}
	
	/* ************************************************ */
	public static void selectAccount(WebDriver driver) throws Throwable
	{		
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
		  driver.switchTo().window(childWindowHandle);
		} 	
		WebDriverWait wait = new WebDriverWait(driver,60);
		WebElement firstDropDown = driver.findElement(By.cssSelector("body > div.modal.in > div > div > form > div.modal-body > section > div > form > div:nth-child(2) > div > div > span"));
	    firstDropDown.click();
	    List<WebElement> options = driver.findElements(By.cssSelector("div.k-list-container ul.k-list li.k-item"));
	    for(Iterator<WebElement> iterator = options.iterator(); iterator.hasNext();) {
	    	WebElement webElement = (WebElement) iterator.next();
	    		if (webElement.getText().equals("at_parent_account"))
	    			webElement.click();
	    		
	    }
	    //closing child window
	    
	}

	
	public static void closex(WebDriver driver)
	{
		Locators_Staging.closex(driver).click();
	}
	
	public static void fileUpload(WebDriver driver) throws Throwable	
	{
		//Browser.findElement(By.cssSelector("body > div.modal.in > div > div > form > div.modal-body > section > div > form > div:nth-child(5) > div > div > input"));
        //a.click();
		WebElement browseBtn = driver.findElement(By.cssSelector("body > div.modal.in > div > div > form > div.modal-body > section > div > form > div:nth-child(5) > div > div > input"));
		Thread.sleep(2000);
		
		File file = new File("/Users/amritha/Desktop/TestDoc.xls");
		StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot robot = new Robot();
		// Cmd + Tab is needed since it launches a Java app and the browser looses focus
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(5000);
		
		//Open Goto window
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_G);

		//Paste the clipboard value

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_V);

		//Press Enter key to close the Goto window and Upload window

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//a.click();
		
		//WebElement uploadBtn = driver.findElement(By.id("submit"));
		browseBtn.click();
	}
	
	
	public static void uploadfileandCreateTask(WebDriver driver) throws Throwable	
	{
		Locators_Staging.uploadfileandCreateTask(driver).click();
	}

	public static void closePopup(WebDriver driver)
	{
		Locators_Staging.closePopup(driver).click();
		
		
	}	
	
	/* ************************************************ */
	
	
	public static void searchforParentAccount(WebDriver driver, String a) throws Throwable
	{
	 
	 Locators_Staging.searchforParentAccount(driver).sendKeys(a);
	}	
	
	
	public static void selectSystemdate(WebDriver driver) throws Throwable
	{
	   WebElement selectDate = driver.findElement(By.cssSelector("#new > stashboard-task-grid-component > section > div > div.k-grid-header > div > table > thead.tableFloatingHeaderOriginal > tr.k-filter-row > th:nth-child(7) > span > span > span.k-widget.k-datepicker.k-header > span > span > span"));
	   selectDate.click();
	   //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	   DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	   // get current date time with Date()
	   Date date = new Date();
	   String datess = dateFormat.format(date);
	   //System.out.println(datess);
	   WebElement previousLink = driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//div[@class='k-header']//a[contains(@class,'k-link k-nav-prev')]"));
	  
	   //button to click in center of calendar header
	   WebElement nextLink = driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//div[@class='k-header']//a[contains(@class,'k-link k-nav-next')]"));
	   String date_yyyy_MM_dd[] = (datess.split("-"));
	   int yearDiff = Integer.parseInt(date_yyyy_MM_dd[2])- Calendar.getInstance().get(Calendar.YEAR);
	  
	   WebElement midLink = driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//div[@class='k-header']//a[contains(@class,'k-link k-nav-fast')]"));
	    Thread.sleep(1000);
	   midLink.click();
	  
	   if(yearDiff!=0){
	            //if you have to move next year
	        if(yearDiff>0){
	        		for(int i=0;i< yearDiff;i++){
	                    System.out.println("Year Diff->"+i);
	                    nextLink.click();
	                    
	                }
	            }
	            //if you have to move previous year
	            else if(yearDiff<0){
	                for(int i=0;i< (yearDiff*(-1));i++){
	                    System.out.println("Year Diff->"+i);
	                    previousLink.click();            
	                }
	            }
	        }
	        
	        Thread.sleep(1000);

	        //Get all months from calendar to select correct one	        
	        List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@class='k-animation-container']//table//tbody//td[not(contains(@class,'k-other-month'))]"));    
	        list_AllMonthToBook.get(Integer.parseInt(date_yyyy_MM_dd[1])-1).click();
	        
	        //Get all dates from calendar to select correct one	  
	        List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@class='k-animation-container']//table//tbody//td[not(contains(@class,'k-other-month'))]"));	        
	        list_AllDateToBook.get(Integer.parseInt(date_yyyy_MM_dd[0])-1).click();
	}

	public static void createdBy(WebDriver driver, String a)
	{
		Locators_Staging.createdBy(driver).sendKeys(a);
	}       
	
	public static void pressEnter(WebDriver driver)
	{
		Locators_Staging.pressEnter(driver).sendKeys(Keys.ENTER);

	}
	
	public static void filtergreaterTask(WebDriver driver)
	{
		WebElement TableElement = driver.findElement(By.cssSelector("#new > stashboard-task-grid-component > section > div > div.k-grid-content.k-auto-scrollable > table"));
		List<WebElement> FirstColumns = TableElement.findElements(By.xpath("//tr/td[4]"));		
		int n = TableElement.findElements(By.tagName("tr")).size();	
		int maxNumber = 0;
	    int index = 0;
	    for (int i = 0; i <= n; i++) { 	
	        for (int j = i + 1; j <= n; j++) {       	
	        	String trim = FirstColumns.get(j-1).getText();
	        	trim = trim.substring(1);
	            if (maxNumber <= Integer.valueOf(trim)) {
	                maxNumber = Integer.valueOf(trim);
	            }
	            if (maxNumber == Integer.valueOf(trim)) {
	                index = i;
	              
	            }
	        }
		}
	    String Taskt = "T";
	    String greatertask  = Taskt + String.valueOf(maxNumber);
		Locators_Staging.filtergreaterTask(driver).sendKeys(greatertask);			
	}

	public static void viewTask(WebDriver driver)
	{
		Locators_Staging.viewTask(driver).click();

	}
	
	public static void refreshGrid(WebDriver driver)
	{
		Locators_Staging.refreshGrid(driver).click();

	}
	public static void clickonErrorlink(WebDriver driver)
	{
		Locators_Staging.clickonErrorlink(driver).click();

	}
	
	public static void Viewtoresolve(WebDriver driver) throws Throwable
	{
	driver.findElement(By.cssSelector("body > div.modal.in > div > div > form > div.modal-body > section > form > div:nth-child(2) > div > button.btn.btn-success"));
	/*https://github.com/seleniumhq/selenium/issues/1511*/
	//driver.findElement(By.xpath("//input[@class='btn btn-success'][@onclick='return checkinput(this.form, 1);'][@type='button']")).click();
	driver.get("https://staging-engine.kurtosys.org/Normalization/Preview?sessionIds=7c7b148f-b75d-4199-9dc6-e116e2dc6793");
	}

	
	public static void filterNarration_test_1(WebDriver driver) 
	{	 
		WebElement table = driver.findElement(By.cssSelector("#normalizedTransactionsGrid > div.k-grid-content.k-auto-scrollable > table"));	
		
		List <WebElement> row = table.findElements(By.tagName("tr"));
        row.size();
        for (int i=0;i<row.size();i++){
        	List <WebElement> col = row.get(i).findElements(By.tagName("td"));
            col.size();       
             
        	 for (int j=0;j<col.size();j++){
                 String cv = col.get(j).getText();               
                 if(cv.equalsIgnoreCase("test-1")) {                                                       
                     String xp1 = "#normalizedTransactionsGrid > div.k-grid-content.k-auto-scrollable > table > tbody > tr:nth-child(";
                     String xp2 = ") > td:nth-child(2) > input";   
                     driver.findElement(By.cssSelector(xp1+(i+1)+xp2)).click();
                    // driver.findElement(By.cssSelector("#normalizedTransactionsGrid > div.k-grid-content.k-auto-scrollable > table > tbody > tr:nth-child(1) > td:nth-child(2) > input")).click();                     
                 }
        	    // System.out.println(cv);                                        	 
        	 }       	 
        }
	}
	
	
	public static void bulkchange(WebDriver driver) throws Throwable
	{	
		WebDriverWait wait = new WebDriverWait(driver,60);
		WebElement firstDropDown = driver.findElement(By.cssSelector("#normalizedTransactionsGrid > div.k-header.k-grid-toolbar > div > div:nth-child(2) > div:nth-child(1) > span"));
	    firstDropDown.click();
	    List<WebElement> options = driver.findElements(By.cssSelector("div.k-list-container ul.k-list li.k-item"));
	    for(Iterator<WebElement> iterator = options.iterator(); iterator.hasNext();) {
	    	WebElement webElement = (WebElement) iterator.next();
	    		if (webElement.getText().equals("CCY Account Code"))
	    			webElement.click();
	    }
	}
	
	public static void additionaldropdown(WebDriver driver) throws Throwable
	{		
		Locators_Staging.additionaldropdown(driver).click();
		WebElement Dropdown = driver.findElement(By.cssSelector("#types-list > span > input"));
		String elementm = "at_parent_account-test-01-usd-01"; 
		Dropdown.sendKeys(elementm);
		Thread.sleep(1000);
		Dropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(200);
		Dropdown.sendKeys(Keys.ENTER);	
	}

	public static void pressbulkchangebutton(WebDriver driver)
	{
		Locators_Staging.pressbulkchangebutton(driver).click();

	}
	
	
	public static void popupClickOk(WebDriver driver)
	{
		Locators_Staging.popupClickOk(driver).click();

	}
	/* ******STEP 11**** */
	public static void filterNarration_test_2(WebDriver driver) throws Throwable 
	{	 
		WebElement table = driver.findElement(By.cssSelector("#normalizedTransactionsGrid > div.k-grid-content.k-auto-scrollable > table"));	
		
		List <WebElement> row = table.findElements(By.tagName("tr"));
        row.size();
        for (int i=0;i<row.size();i++){
        	List <WebElement> col = row.get(i).findElements(By.tagName("td"));
            col.size();       
             
        	 for (int j=0;j<col.size();j++){
                 String cv = col.get(j).getText();               
                 if(cv.equalsIgnoreCase("test-2")) {  
                	 
                	 
                	String xp1 = "#normalizedTransactionsGrid > div.k-grid-content.k-auto-scrollable > table > tbody > tr:nth-child(";
                    String xp2 = ") > td:nth-child(8)";   
                    driver.findElement(By.cssSelector(xp1+(i+1)+xp2)).click();
                    WebElement selectDd = driver.findElement(By.cssSelector("#normalizedTransactionsGrid_active_cell > span > span > span.k-select > span"));
                    selectDd.click();
                    selectDd.click();
                 
                    /*WebElement Dropdown = driver.findElement(By.cssSelector("div.k-list-container span.k-list-filter input.k-textbox"));
                    WebElement Dropdown = driver.findElement(By.cssSelector("body > div:nth-child(147) > div > span"));
             		String elementm = "at_parent_account-test-01-usd-01"; 
             		Dropdown.sendKeys(elementm);
             		Thread.sleep(1000);
             		Dropdown.sendKeys(Keys.ARROW_DOWN);
             		Thread.sleep(200);
             		Dropdown.sendKeys(Keys.ENTER);	*/
                 
                 
                 }
        	 }
        }
	}
                   
                 
        	    
        	
	
	
	public static void waitForNewWindowAndSwitchToIt(WebDriver driver) throws Throwable {
        String cHandle = driver.getWindowHandle();
        String newWindowHandle = null;
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("c:");
        //Wait for 20 seconds for the new window and throw exception if not found
        for (int i = 0; i < 20; i++) {
            if (allWindowHandles.size() > 1) {
                for (String allHandlers : allWindowHandles) {
                    if (!allHandlers.equals(cHandle))
                    	newWindowHandle = allHandlers;
                }
                driver.switchTo().window(newWindowHandle);
                break;
            } else {
                Thread.sleep(1000);
            }
        }
        if (cHandle == newWindowHandle) {
            throw new RuntimeException(
                    "Time out - No window found");
        }
    }
}
	/*public static void fileUpload1(WebDriver driver) throws Throwable
	
	{
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
		  driver.switchTo().window(childWindowHandle);
		} 
		Thread.sleep(2000);
		//String text=Locators_Staging.fileUpload(driver).getText();
		System.out.println("1");
		WebDriverWait wait = new WebDriverWait(driver,60);
		System.out.println("2");
		wait.until(ExpectedConditions.elementToBeClickable(Locators_Staging.fileUpload1(driver)));
		System.out.println("3");
		String path="/Users/amritha/Desktop/TestDoc.xls";
		//File file = new File("/Users/amritha/Desktop/TestDoc.xls");

		System.out.println("4");
		String x=path.toUpperCase();
		
		Locators_Staging.fileUpload1(driver).click();
		
		Robot r = new Robot();
		
		for(int i=0;i<x.length();i++)
		{
			
			r.keyPress(x.charAt(i));
			r.keyRelease(x.charAt(i));
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		/*WebElement filePath=driver.findElement(By.xpath("/html/body/div[143]/div/div/form/div[2]/section/div/form/div[5]/div/div/input"));
		filePath.sendKeys(path);//enter file location
		WebElement upload=driver.findElement(By.xpath("/html/body/div[149]/div/div/form/div[2]/section/div/form/div[7]/div/div[1]/input"));
		upload.click(); //Click on upload button
	}*/
	


