package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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

		// click on CRM/SFA link and go to accounts tab

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);

		// click on create account in Accounts tab
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(2000);

		// Enter Account name, description, numberOfEmployees,Site name and click
		// on'Create Account'
		String accountNameForCreate = "TestAccount1256";
		driver.findElement(By.id("accountName")).sendKeys(accountNameForCreate);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		Thread.sleep(2000);

		driver.findElement(By.className("smallSubmit")).click();

		String fetchedAccountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		//System.out.println(fetchedAccountName);

		if (fetchedAccountName.contains(accountNameForCreate)) {

			System.out.println("The account name displayed correctly");

		}

		Thread.sleep(3000);
		driver.close();

	}

}
