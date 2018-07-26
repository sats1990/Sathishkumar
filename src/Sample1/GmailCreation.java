package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailCreation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/gmail/about/#");
	WebElement btnCreate = driver.findElement(By.xpath("//a[@data-g-label = 'Create an account button']"));
	btnCreate.click();
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@aria-label = 'First name']"));
	txtFirstName.sendKeys("Sathish");
	WebElement txtLastName = driver.findElement(By.id("lastName"));
	txtLastName.sendKeys("Kumar");
	WebElement txtUserName = driver.findElement(By.id("username"));
	txtUserName.sendKeys("sathishshylu3126");
	WebElement txtPassword = driver.findElement(By.name("passwd"));
	txtPassword.sendKeys("telstra@2015");
	WebElement txtConfirmPassword = driver.findElement(By.name("ConfirmPasswd"));
	txtConfirmPassword.sendKeys("telstra@2015");
	WebElement btnNext = driver.findElement(By.xpath("//span[@class = 'RveJvd snByac']"));
	btnNext.click();
	
}
}
