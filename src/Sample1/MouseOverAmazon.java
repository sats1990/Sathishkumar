package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAmazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement btnShop = driver.findElement(By.xpath("//span[text() = 'Shop by']"));
	Actions Shop = new Actions(driver);
	Shop.moveToElement(btnShop).perform();
	WebElement btnBook = driver.findElement(By.xpath("//span[text() = 'Books']"));
	btnBook.click();
	WebElement btnAllBook = driver.findElement(By.xpath("//span[text() = 'All Books']"));
	btnAllBook.click();
	
}
}
