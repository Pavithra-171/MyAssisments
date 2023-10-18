package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Pavithra");
		driver.findElement(By.id("officeSiteName")).sendKeys("google.com");
		WebElement tools = driver.findElement(By.name("industryEnumId"));
		Select drop1 =new Select(tools);
		drop1.selectByIndex(2);
		WebElement tool = driver.findElement(By.name("ownershipEnumId"));
		Select drop2 = new Select(tool);
		drop2.selectByVisibleText("S-Corporation");
		WebElement too = driver.findElement(By.id("dataSourceId"));
		Select drop3 = new Select(too);
		drop3.selectByValue("LEAD_EMPLOYEE");
		WebElement to = driver.findElement(By.id("marketingCampaignId"));
		Select drop4 = new Select(to);
		drop4.selectByIndex(5);
		WebElement t = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop5 = new Select(t);
		drop5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		

	}

}
