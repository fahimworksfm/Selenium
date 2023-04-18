package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simpleTest {

public static void main(String[] args) {
		
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Quality Assurance");
		
		driver.findElement(By.name("btnK")).click();
		
		driver.close(); 
	}
}
