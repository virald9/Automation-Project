package Automation_Project;

import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTests 
{
	public static WebDriver driver;

    static final Logger logger = Logger.getLogger(BaseTests.class);

	
	@BeforeTest
	public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\viral\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        driver=new ChromeDriver();  
        driver.get("http://automationpractice.com/index.php");  
        driver.manage().window().maximize(); 
        logger.debug("Welcome to Automation Project");
    	WebElement signin = driver.findElement(By.cssSelector("a.login"));
		signin.click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	
}
