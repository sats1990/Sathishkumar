package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@type = 'text']"));
	txtFirstName.sendKeys("Sathish");
	WebElement txtSureName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
	txtSureName.sendKeys("Ponnusamy");
	WebElement txtMobileNumber = driver.findElement(By.xpath("//input[@aria-label = 'Mobile number or email address']"));
	txtMobileNumber.sendKeys("9952632704");
	WebElement txtPassword = driver.findElement(By.xpath("//input[@aria-label='New password']"));
	txtPassword.sendKeys("Sathish@2015");
	WebElement btnMale = driver.findElement(By.id("u_0_a"));
	btnMale.click();
	WebElement btnSignUp = driver.findElement(By.xpath("//button[@type='submit']"));
	btnSignUp.click();	
}
}
