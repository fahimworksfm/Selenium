package advance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		
		sel.selectByIndex(8);
		


		List<WebElement> list = sel.getOptions();
		
		
		System.out.println(list.size());
		
		for(int i = 0; i<list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			
		}
	}
}
