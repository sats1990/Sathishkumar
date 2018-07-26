package Sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	WebElement btnConfirm = driver.findElement(By.xpath("//button[@onclick = 'pushConfirm()']"));
	btnConfirm.click();
	Alert al = driver.switchTo().alert();
	al.dismiss();
	
	
}
}
