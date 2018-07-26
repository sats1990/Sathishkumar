package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoautotestingRegister {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	txtfirstname.sendKeys("Sathish");
	WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder = 'Last Name']"));
	txtlastname.sendKeys("Kumar");
	WebElement txtaddress = driver.findElement(By.xpath("//textarea[@ng-model = 'Adress']"));
	txtaddress.sendKeys("Chennai");
	WebElement txtemail = driver.findElement(By.xpath("//input[@type = 'email']"));
	txtemail.sendKeys("sathishksr31@gmail.com");
	WebElement txtmob = driver.findElement(By.xpath("//input[@type = 'tel']"));
	txtmob.sendKeys("9952632704");
	WebElement btnsex = driver.findElement(By.xpath("//input[@value = 'Male']"));
	btnsex.click();
	WebElement btnsubmitt = driver.findElement(By.id("submitbtn"));
	btnsubmitt.click();
}
}
