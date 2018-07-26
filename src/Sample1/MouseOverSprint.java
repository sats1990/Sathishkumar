package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverSprint {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.sprint.com/");
	driver.manage().window().maximize();
	WebElement btnMySprint = driver.findElement(By.className("sprint-menu__float"));
	Actions Sprint = new Actions(driver);
	Sprint.moveToElement(btnMySprint).perform();
	WebElement btnPay = driver.findElement(By.xpath("//a[text()= 'Pay bill']"));
	Thread.sleep(3000);
	btnPay.click();
	Thread.sleep(2000);
	
}
}
