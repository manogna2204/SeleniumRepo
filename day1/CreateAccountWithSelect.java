package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelect {

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
		
		String accountName = "TestLeafAccount345";

		// Enter Account name, description
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// locate the select element and initialise the select object
		WebElement dropDown = driver.findElement(By.name("industryEnumId"));
		Select option = new Select(dropDown);

		option.selectByVisibleText("Computer Software");

		// locate select element for 'Ownership'and initialise the select object
		WebElement list = driver.findElement(By.name("ownershipEnumId"));
		Select opt = new Select(list);

		opt.selectByVisibleText("S-Corporation");

		// locate select element for 'Source'and initialise the select object
		WebElement options = driver.findElement(By.name("dataSourceId"));
		Select var = new Select(options);

		var.selectByValue("LEAD_EMPLOYEE");

		// locate select element for 'marketing campaign'and initialise the select
		// object
		WebElement dropList = driver.findElement(By.name("marketingCampaignId"));
		Select temp = new Select(dropList);

		temp.selectByIndex(5);

		// locate select element for 'state/province'and initialise the select object
		WebElement dropDnList = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select op = new Select(dropDnList);

		op.selectByValue("TX");

		Thread.sleep(3000);

		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(5000);
		
		String fetchedAccountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		//System.out.println(fetchedAccountName);
		
		if(fetchedAccountName.equals(accountName)) {
			
			System.out.println("The account name displayed correctly");
			
		}
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
