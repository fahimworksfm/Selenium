package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class simpleSendKeysPages {

public WebDriver driver;
	
	

	public simpleSendKeysPages(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id="nav-link-accountList")
	WebElement signinbtn;
	
	public void getSigninbtn() {
		
		signinbtn.click();
		
	}
	
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement account;
	
	public void getAccount() {
		
		account.click();
		
	}
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement username;
	
	public void getUsername(String name) {
		
		username.sendKeys(name);
		
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	public void getEmail(String address) {
		
		email.sendKeys(address);
		
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	public void getPassword(String pass) {
		
		password.sendKeys(pass);
		
	}
	
	@FindBy(xpath="//input[@id='ap_password_check']")
	WebElement repassword;
	
	public void getRepassword(String repass) {
		
		repassword.sendKeys(repass);
		
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement finalsigninbtn;
	
	public void getFinalsigninbtn() {
		
		finalsigninbtn.click();
		
	}
}
