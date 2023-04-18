package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement a = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		WebElement b = driver.findElement(By.xpath("//span[contains(text(),'Find a List or Registry')]"));
		
		Actions acts = new Actions(driver);
		
		acts.moveToElement(a).moveToElement(b).click().build().perform();
		
		driver.close();

	}
}
