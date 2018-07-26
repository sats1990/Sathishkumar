package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement btnCourse = driver.findElement(By.xpath("//a[text() = 'COURSES']"));
	Actions A = new Actions(driver);
	A.moveToElement(btnCourse).perform();
	WebElement btnSoft = driver.findElement(By.xpath("//span[text() = 'Software Testing Training']"));
	Actions B = new Actions(driver);
	B.moveToElement(btnSoft).perform();
	WebElement btnsoftTesting = driver.findElement(By.xpath("//span[text() = 'Software Testing Training']"));
	btnsoftTesting.click();	
}
}
