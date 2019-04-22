package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashBoardPage;
import pages.LoginPage;


public class Login {
	
	@Test
	public void LoginTestPOM() {
	
	// 1. Initialize driver
	WebDriver driver = utilities.DriverFactory.open("Chrome");
	driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	
	// 2. Enter login information(Login Page)//LoginPage Object
	LoginPage loginPage = new LoginPage(driver);//pass driver to constructor
	loginPage.setUserName("shaswatasaha24@gmail.com");
	loginPage.setPassword("Fight2liv");
	loginPage.clickSubmit();
	
	// 3. Get confirmation(Dashboard)//Dasboard Object
	DashBoardPage dashboardPage = new DashBoardPage(driver);//pass driver to constructor
	String conf = dashboardPage.confirmationMessage();
	String title = dashboardPage.title();
	System.out.println("Title :" +title);
	System.out.println("Confirmation :" +conf);
	
	//Assertions
	Assert.assertTrue(conf.contains("Logged in successfully"));
	//Assert.assertTrue(conf.contains("account"));
	
	// 4. Close the driver
	driver.quit();

}
}