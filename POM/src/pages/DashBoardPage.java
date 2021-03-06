package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
	
	WebDriver driver;//class level webdriver
	
	public String confirmationMessage() {//we are returning string
		return driver.findElement(By.id("conf_message")).getText();
		}
	
	public String title() {
	   return driver.getTitle();
	}
	
	
	public void changePassword() {
		driver.findElement(By.linkText("Change password")).click();
		}
	
	public DashBoardPage(WebDriver driver){//constructor
		this.driver = driver ; //In constructor set the classlevel driver equal to the local variable driver. we need to pass the instance of the driver for each step
		
	}



}
