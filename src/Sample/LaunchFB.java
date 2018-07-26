package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFB {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//firstname
	WebElement txtfirstname = driver.findElement(By.name("firstname"));
	txtfirstname.sendKeys("Sathish");
	//surname
	WebElement txtsurname = driver.findElement(By.name("lastname"));
	txtsurname.sendKeys("Ponnusamy");
	//mail id
	WebElement txtmail = driver.findElement(By.name("reg_email__"));
	txtmail.sendKeys("sathishksr31@gmail.com");
	//password
	WebElement txtpassword = driver.findElement(By.name("reg_passwd__"));
	txtpassword.sendKeys("asdfgh@123");
	//click male button
	WebElement btnmale = driver.findElement(By.id("u_0_a"));
	btnmale.click();
	// click signup
	WebElement btnsignup = driver.findElement(By.xpath("//button[@type='submit']"));
	btnsignup.click();
}
}
