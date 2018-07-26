package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demoqa.com/registration/");
	//first name
	WebElement txtfirstname = driver.findElement(By.id("name_3_firstname"));
	txtfirstname.sendKeys("Sathish");
	WebElement txtlastname = driver.findElement(By.id("name_3_lastname"));
	txtlastname.sendKeys("Kumar");
	WebElement btnmarriedstatus = driver.findElement(By.xpath("//input[@value='married']"));
	btnmarriedstatus.click();
	WebElement btnhobby = driver.findElement(By.xpath("//input[@value = 'dance']"));
	btnhobby.click();
	WebElement btnsubmit = driver.findElement(By.xpath("//input[name = pie_submit']"));
	btnsubmit.click();
}
}
