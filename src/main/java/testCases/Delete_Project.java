package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.DeletePageObjects;
import pageObjects.LoginPageObjects2;
import pageObjects.RealPOMCustomerPageObjects;

public class Delete_Project {

	@Test
	public void addNewCustomer() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/#/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		PageFactory.initElements(driver, LoginPageObjects2.class);
		
		LoginPageObjects2.UserName.sendKeys("admin");
		LoginPageObjects2.PassWord.sendKeys("tokyo@admin");
		LoginPageObjects2.loginButton.click();
		Thread.sleep(5000);
		
		PageFactory.initElements(driver, RealPOMCustomerPageObjects.class);
		
		RealPOMCustomerPageObjects.master.click();
		Thread.sleep(3300);
		
		RealPOMCustomerPageObjects.customer.click(); 
		Thread.sleep(3200);
		
		PageFactory.initElements(driver, DeletePageObjects.class);
		
		DeletePageObjects.deleteicon.click();
		Thread.sleep(3000);
		
		DeletePageObjects.cancelltext.click();
		Thread.sleep(3000);
		
		DeletePageObjects.deleteicon2.click();
		Thread.sleep(3000);
		
		DeletePageObjects.okButton.click();
		
}}
