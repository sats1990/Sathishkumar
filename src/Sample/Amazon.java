package Sample;


import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	//config
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	//launch
	ChromeDriver driver = new ChromeDriver();
	//url
	driver.get("https://www.amazon.in/");
	//title
      String title = driver.getTitle();
     System.out.println(title);
     //quit
     driver.quit();
}   
}
