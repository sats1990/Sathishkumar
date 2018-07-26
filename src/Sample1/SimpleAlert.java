package Sample1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	driver.manage().window().maximize();
	WebElement btnSimple = driver.findElement(By.xpath("//button[@onclick = 'pushAlert()']"));
	btnSimple.click();
	Alert al = driver.switchTo().alert();
	al.accept();
	driver.quit();
}
}
