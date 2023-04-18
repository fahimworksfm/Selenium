package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathParameterizeSteps {

WebDriver driver;
	
	@Given("User on Expedia homepage")
	public void user_on_expedia_homepage() throws InterruptedException {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
	    
	}

	@When("User selects tab {string}")
	public void user_selects_tab(String tabs) throws InterruptedException {
	    
	    driver.findElement(By.xpath("//span[text()='"+tabs+"']")).click();
	    
	    Thread.sleep(4000);
	}

	@When("User click on {string}")
	public void user_click_on(String button) throws InterruptedException {
	    
	    driver.findElement(By.xpath("//button[text()='"+button+"']")).click();
	    
	    Thread.sleep(4000);
	}

	@Then("User varify the error message {string}")
	public void user_varify_the_error_message(String message) {
	    
	    Assert.assertEquals(driver.findElement(By.xpath("//div[@class='uitk-text uitk-type-300 uitk-text-default-theme uitk-banner-description']")).getText(), message);
	    
	    driver.close();
	}
}
