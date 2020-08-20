package Automation_Project;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AutomationMain extends BaseTests {

	@Test(priority=0)
	public void Accountpage() throws InterruptedException {
		Account a = PageFactory.initElements(driver, Account.class);
		a.createLogin();		
		
}
	
	@Test(priority=1,dependsOnMethods = { "Accountpage" })
	public void createAccountPage() throws InterruptedException {
		CreateAccount b = PageFactory.initElements(driver, CreateAccount.class);
		b.createAnAccount("Viral","Desai","123 Main St","Los Angeles","California","07306","1111111111","Oakland Park");
}
	

	@Test(priority=3)
	public void addtoCart() throws InterruptedException {
		MyAccount c = PageFactory.initElements(driver, MyAccount.class);
		c.accountPage(driver);
}

}
