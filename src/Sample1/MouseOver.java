package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement btnCourse = driver.findElement(By.xpath("//a[text() = 'COURSES']"));
	// need to give in Case sensitive (COURSES) as in the Websites. 
	// First Perform Action 
	Actions ac = new Actions(driver);
	//To Move cursor to the location use moveToElement and to perform the action use the method "Perform".
	ac.moveToElement(btnCourse).perform();
	WebElement btnBigData = driver.findElement(By.xpath("//span[text() = 'Bigdata Training']"));
	btnBigData.click();
	driver.quit();
	
	
}
}
