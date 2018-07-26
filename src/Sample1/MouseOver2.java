package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/selenium-webdriver/mouse-hover-action/");
	driver.manage().window().maximize();
	WebElement btnTools = driver.findElement(By.xpath("//span[text() = 'ABOUT']"));
	Actions ac = new Actions(driver);
	ac.moveToElement(btnTools).perform();
	WebElement btnCont = driver.findElement(By.xpath("span[text() = 'Contact Us']"));
	btnCont.click();
}
}
