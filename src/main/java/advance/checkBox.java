package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBox {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement check1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement check2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		Thread.sleep(3000);
		
		if(check2.isSelected()) {
			
			System.out.print("Check 2 is already selected");
			
		}
		else {
			
			check2.click();
		}
		

	}
}
