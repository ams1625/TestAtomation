package basicMain;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import functions.Functions_Staging;

public class MainMethods {
	
	public static void login() throws Throwable {
		System.setProperty("webdriver.safari.noinstall", "true"); //To stop uninstall each time
		WebDriver driver = new SafariDriver();
		driver.get("https://staging-engine.kurtosys.org/Account/Login?ReturnUrl=%2F");
		
		//STEP 1: Login to application URL with credentials
		Functions_Staging.username(driver,"at_012");
		Functions_Staging.password(driver,"TechGeek$123");
		Functions_Staging.login(driver);
		Thread.sleep(3000);
		
		Functions_Staging.expandMenu(driver); //STEP 2: Navigate to main menu
		Thread.sleep(3000);
		
		Functions_Staging.click_Submenu(driver); //STEP 3: Navigate to sub-menu
		Thread.sleep(3000);
		
		/*Functions_Staging.clickonCreate(driver);//STEP 4: Click on create Button
		Thread.sleep(3000);
		
		Functions_Staging.selectAccount(driver);//On pop up input as parent account
	    Thread.sleep(3000);
		
		Functions_Staging.fileUpload(driver);//STEP 5: Upload the File and Create task
		Thread.sleep(3000);
		
		Functions_Staging.uploadfileandCreateTask(driver);//STEP 5: Upload the File and Create task
		Thread.sleep(3000);
		
		Functions_Staging.closex(driver);
		Thread.sleep(3000);
		
		Functions_Staging.closePopup(driver);//Close pop up once file is uploaded successfully
		Thread.sleep(3000);*/
		
		Functions_Staging.searchforParentAccount(driver,"at_parent_account");//In the Grid search for Parent Account field as 'at_parent_account'
		Thread.sleep(3000);
		
		Functions_Staging.selectSystemdate(driver); //Filter based on most recent Date in dd/mm/yyyy
		Thread.sleep(3000);	
		
		//Functions_Staging.createdBy(driver, "at_012");//In the Grid search for Parent Account field as 'at_parent_account'
		Thread.sleep(3000);
		
		Functions_Staging.pressEnter(driver);//STEP 6: Click Enter
		Thread.sleep(3000);
		
		Functions_Staging.filtergreaterTask(driver);// STEP 7: Returns the highest task with the Taskname 
		Thread.sleep(3000);
		
		Functions_Staging.pressEnter(driver);//STEP 6: Click Enter
		Thread.sleep(3000);
		
		Functions_Staging.viewTask(driver);//click on green button to view the task for the above selection
		Thread.sleep(3000);
		
		Functions_Staging.refreshGrid(driver);// STEP 8: Refreshes the Grid 
		Thread.sleep(3000);
		
		Functions_Staging.clickonErrorlink(driver);// STEP 8: Refreshes the Grid 
		Thread.sleep(3000);
		
		Functions_Staging.Viewtoresolve(driver);// STEP 8: Refreshes the Grid 
		Thread.sleep(3000);
		
		Functions_Staging.bulkchange(driver);//On pop up input as parent account
	    Thread.sleep(3000);
	    
	    Functions_Staging.additionaldropdown(driver);//On pop up input as parent account
	    Thread.sleep(3000);
	    
	    Functions_Staging.filterNarration_test_1(driver);// STEP 8: Refreshes the Grid 
		Thread.sleep(3000);
	   
	    Functions_Staging.pressbulkchangebutton(driver);//On pop up input as parent account
	    Thread.sleep(3000);
	    
	    Functions_Staging.popupClickOk(driver);//On pop up input as parent account
	    Thread.sleep(3000);
	    
	    
	    /* ******STEP 11**** */
	    
	    Functions_Staging.filterNarration_test_2(driver);// STEP 8: Refreshes the Grid 
		Thread.sleep(3000);
	}
	
		

}
