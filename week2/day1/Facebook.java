package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		// launch chrome browser and open leaftaps website and maximize
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		
				
		WebElement allowCookies = driver.findElement(By.xpath("//span[contains(text(),'Allow all cookies')])"));
		
		if (allowCookies != null) {
			
			allowCookies.click();
		}

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("TestEngineer");
		driver.findElement(By.name("lastname")).sendKeys("Test");
		driver.findElement(By.name("reg_email__")).sendKeys("testemail@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("test@123");
		
		//using select element for Gender radio button
		
		WebElement radioOptions = driver.findElement(By.name("gender_wrapper"));
		Select option = new Select(radioOptions);
		
		option.selectByVisibleText("Female");
	
		Thread.sleep(3000);
		
	}

}
