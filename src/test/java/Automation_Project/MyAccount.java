package Automation_Project;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyAccount {
	
    static final Logger logger = Logger.getLogger(MyAccount.class);

	
	@FindBy(xpath="//a[text()='Women']")
	WebElement womenPage;
	@FindBy(css = "a.quick-view")
	WebElement quickview;
	@FindBy(css = "i.icon-plus")
	WebElement qty;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement cart;
	@FindBy(linkText="Proceed to checkout")
	WebElement checkout;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement checkout3;
	@FindBy(name ="processCarrier")
	WebElement checkout4;
	@FindBy(xpath="//input[@id='cgv']")
	WebElement terms;
	@FindBy(xpath="//span[@id='total_price']")
	WebElement price;
	@FindBy(css="a.bankwire")
	WebElement bankwire;
	@FindBy(xpath="//span[text()='I confirm my order']")
	WebElement confirm;
	@FindBy(xpath="//span[text()='Viral Desai']")
	WebElement viral;
	@FindBy(xpath="//span[text()='Order history and details']")
	WebElement orderhistory;
	@FindBy(css="span.price")
	WebElement verify;
	
	
	@Test
	public void accountPage(WebDriver driver) throws InterruptedException {
		
		womenPage.click();
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(quickview));
		element.click();*/
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", quickview);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
        logger.debug("Please select the quantity");
		qty.click();
        logger.debug("Add items to Cart");
		cart.click();
		Thread.sleep(5000);
		checkout.click();
		checkout.click();
		checkout3.click();
		terms.click();
		checkout4.click();
		String amt = price.getText();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("35.02", amt);
        logger.debug("Verify the Payment method");
		bankwire.click();
		confirm.click();
		viral.click();
        logger.debug("Check your Order History");
		orderhistory.click();
        logger.debug("Verify the Amount");
		String amt1 = verify.getText();
		SoftAssert sa1 = new SoftAssert();
		sa1.assertEquals("35.02", amt1);
		




	}

}
