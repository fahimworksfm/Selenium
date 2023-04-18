package StepDefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageObjectModel.simpleSendKeysPages;
import common.simpleSendKeysBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class simpleSendKeysSteps extends simpleSendKeysBase{
		
	simpleSendKeysPages page;
		
		@Given("I am on home page")
		public void i_am_on_home_page() {
		    
			getDriver();
			
			page = PageFactory.initElements(driver, simpleSendKeysPages.class);
			

		}

		@When("i click on sign in button")
		public void i_click_on_sign_in_button() {
		  
			//driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click(); // By is a selenium class
			
		page.getSigninbtn();
			
			//page.get
		}

		@When("i click on create a new amazon account")
		public void i_click_on_create_a_new_amazon_account() {
		    
			//driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
			
			page.getAccount();
			
		}

		@When("i enter user name as {string}")
		public void i_enter_user_name_as(String name) {
		   
			//driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(string);
			
			page.getUsername(name);
			
		}

		@When("i enter email address as {string}")
		public void i_enter_email_address_as(String address) {
		   
			//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(string);
			
			page.getEmail(address);
		}

		@When("i enter password as {string}")
		public void i_enter_password_as(String pass) {
		   
			//driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(string);
			
			page.getPassword(pass);
		}

		@When("i enter re-password as {string}")
		public void i_enter_re_password_as(String repass) {
		   
			//driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys(string);
			
			page.getRepassword(repass);
		}

		@When("i click sign in button")
		public void i_click_sign_in_button() {
		    
			//driver.findElement(By.xpath("//input[@id='continue']")).click();
			
			page.getFinalsigninbtn();
		}

		@Then("i can sign up successfully")
		public void i_can_sign_up_successfully() {
		   
			Assert.assertEquals(driver.getTitle(), "Authentication required");
			
			/* EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
			 
			File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
			 
			FileUtils.copyFile(srcFile, new File("path.*FILETYPE*")); */
		}
	}
