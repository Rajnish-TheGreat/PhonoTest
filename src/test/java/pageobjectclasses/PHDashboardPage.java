package pageobjectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class PHDashboardPage {
	
	private WebDriver driver=null;
	public PHDashboardPage(WebDriver driver) {
	//public PHLogInPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@SuppressWarnings("deprecation")
	public void UserLoggedIn() throws Exception {
		//BrowserConfig.SetDriver();
		driver.get("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");
	
		//driver.navigate().to("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");
		Thread.sleep(2000);
		//VALIDATE PAGE URL
		
		String ActualResult = driver.getCurrentUrl();
		String ExpectedResult = "https://staging.dh8h2bodd8qh6.amplifyapp.com/login";
		System.out.println("ExpectedResult :-"+ExpectedResult);
		System.out.println("ActualResult :-"+ActualResult);
		Assert.assertEquals(ActualResult, ExpectedResult);
		//driver.get(ExpectedResult);
		
				
				//VALIDATE LOGIN TEXT ON PAGE
        Thread.sleep(4000);
		Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed());
        System.out.println("**********"+driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed()+"**********");

	    Thread.sleep(2000);
	driver.findElement(By.xpath("//form/div/input[@type='text']")).sendKeys("aryan79067@gmail.com");
driver.findElement(By.xpath("//form/div/div/input[@type='password']")).sendKeys("Admin@123");
driver.findElement(By.xpath("//button[text()='Login']")).click();	
	    ValidateDBPage();
		
		
		/*
		 * //AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
		 * Assert.assertTrue(driver.findElement(By.xpath(
		 * "//h2[contains(text(),'Dashboard')]")).isDisplayed());
		 * 
		 * System.out.print(driver.findElement(By.xpath(
		 * "//h2[contains(text(),'Dashboard')]")).isDisplayed());
		 */
	}
	@SuppressWarnings("deprecation")
	public void ValidateDBPage() throws Exception {
		//AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
		Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]")).isDisplayed());

        System.out.println("**********"+driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]")).isDisplayed()+"**********");

		
	}
	public void SelectDropdownlistValues() throws InterruptedException {
		

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-select']")));
		Thread.sleep(2000);

		dropdown.selectByValue("Next 7 Days");  

	}
	public void GetPlanExpiryreport() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Plan Expiry Report')]")).click();
	}
	public void ViewPlanExpiryReport()
	{
		System.out.print("Inside Plan Expiry Report: User Can View List");
	}
	
	public void NaviagteBack()
	{
		driver.navigate().back();
	}
	public void GetSlotBookedReport() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Slot Book Report')]")).click();
	}
	public void ViewSlotBookedlist()
	{
		System.out.print("Inside Slot Booked Report: User Can View List");
	
	}
	public void GetSlotCompletedReport() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Slot Complete Report')]")).click();
	}
	public void ViewSlotCompletedlist()
	{
		System.out.print("Inside Slot Completed Report: User Can View List");
	
	}
	
	public void GetAssesmentReport() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Assessments Report')]")).click();
	}
	public void ViewAssessmentlist()
	{
		System.out.print("Inside Assessment Report: User Can View List");
	
	}
	
	
}

