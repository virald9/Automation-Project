package Automation_Project;

import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Account {
	
    static final Logger logger = Logger.getLogger(Account.class);
	
	@FindBy(xpath = "//input[@id='email_create']")
	WebElement emailaddress;
	@FindBy(css = "button#SubmitCreate")
	WebElement createAccount;
	@FindBy(xpath = "//input[@id='email']")
	WebElement login;
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password;
	@FindBy(css = "button#SubmitLogin")
	WebElement SignIn;
	@FindBy(css = "a.logout")
	WebElement logout;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement submit;
	
	String emailStr;
	
	
	@Test
	public void createLogin() throws InterruptedException {
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(10000);
		emailStr = "viral"+ randomInt +"@gmail.com";
		emailaddress.sendKeys(emailStr);
		createAccount.click();
        logger.debug("Account Creation Begins");
		Thread.sleep(5000);

	}
	

	
	
	
	


}
