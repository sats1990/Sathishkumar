package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");;
//to find locator of username
WebElement txtusername = driver.findElement(By.id("email"));
txtusername.sendKeys("Satsksr31@gmail.com");
// to fiind locator of password
WebElement txtpassword = driver.findElement(By.id("pass"));
txtpassword.sendKeys("Telstra@2015");
WebElement btnlogin = driver.findElement(By.xpath("//input[@value='Log In']"));
btnlogin.click();
	
}
}