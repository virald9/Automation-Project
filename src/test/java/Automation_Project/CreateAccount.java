package Automation_Project;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateAccount {
	
    static final Logger logger = Logger.getLogger(CreateAccount.class);
	
	@FindBy(xpath = "//input[@name='customer_firstname']")
	WebElement firstName;
	@FindBy(xpath = "//input[@name='customer_lastname']")
	WebElement lastName;
	@FindBy(xpath = "//input[@name='passwd']")
	WebElement password;
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement name;
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lname;
	@FindBy(xpath = "//input[@name='address1']")
	WebElement address;
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(name = "id_state")
	WebElement states;
	@FindBy(xpath = "//input[@name='postcode']")
	WebElement postcode;
	@FindBy(xpath = "//input[@name='phone_mobile']")
	WebElement mobile;
	@FindBy(xpath = "//input[@name='alias']")
	WebElement alias;
	@FindBy(css="button#submitAccount")
	WebElement submit;
	
	
  
	@Test
	public void createAnAccount(String testname,String testlastname,String testaddress,String testcity,String teststates,String testpostal,String testmobile,String testadd) throws InterruptedException {
		try {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		Thread.sleep(2000);
		firstName.clear();
		firstName.sendKeys(testname);
		lastName.clear();
		lastName.sendKeys(testlastname);
		password.sendKeys("Test"+randomInt);
		address.sendKeys(testaddress);
		city.sendKeys(testcity);
		Thread.sleep(2000);
		Select state = new Select(states);
		state.selectByVisibleText(teststates);
		postcode.sendKeys(testpostal);
		mobile.sendKeys(testmobile);
		alias.clear();
		alias.sendKeys(testadd);
		submit.click();
        logger.debug("Account Created");
		Thread.sleep(3000);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		}
		
  }

