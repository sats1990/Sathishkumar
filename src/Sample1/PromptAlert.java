package Sample1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	driver.manage().window().maximize();
	WebElement btnPrompt = driver.findElement(By.xpath("//button[@onclick = 'promptConfirm()']"));
	btnPrompt.click();
	Alert al = driver.switchTo().alert();
	al.sendKeys("yes");
	al.accept();
	driver.quit();
}
}
