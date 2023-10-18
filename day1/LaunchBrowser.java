package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.linkText("CRM/SFA")).click();
String leadPage = driver.getTitle();
System.out.println(leadPage);
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gajapathy");
driver.findElement(By.name("submitButton")).click();
String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
System.out.println(firstName);
String lastName =driver.findElement(By.id("viewLead_lastName_sp")).getText();
System.out.println(lastName);
if(firstName.contains("Pavithra")) {
	System.out.println("The Lead is Created");
	}
	else
	{
		System.out.println("The Lead is not Created");

	}

	}}
