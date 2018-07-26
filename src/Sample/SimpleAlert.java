package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Sample\\Lib\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	WebElement btnProceed = driver.findElement(By.xpath("//button[@onclick = 'pushAlert()']"));
	btnProceed.click();
	org.openqa.selenium.Alert Alertal = driver.switchTo().alert();
	Alertal.accept();
	driver.quit();
	
}
}
