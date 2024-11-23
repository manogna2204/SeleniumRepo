package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		// launch chrome browser and open leaftaps website and maximize
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();

		// using locators enter user name and password and click 'login' button

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);

		driver.findElement(By.className("decorativeSubmit")).click();

		// click on CRM/SFA link and go to leads tab

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);

		// Enter Account name, description, numberOfEmployees,Site name and click
		// on'Create Account'
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capita");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstTest");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LeafTaps");
		WebElement user = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		String titleText = "TestLead";
		user.sendKeys(titleText);
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();

		Thread.sleep(5000);

		String fetchedTitleText = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		// System.out.println(fetchedTitleText);

		if (fetchedTitleText.equals(titleText)) {
			System.out.println("Title displayed correctly");
		}

		driver.close();
	}

}
