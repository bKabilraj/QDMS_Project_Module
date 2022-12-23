package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects2;

public class LoginTestCase2 {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/#/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjects2.class);
		
		LoginPageObjects2.UserName.sendKeys("admin");
		LoginPageObjects2.PassWord.sendKeys("tokyo@admin");
		LoginPageObjects2.loginButton.click();
		
		
//		 LoginPageObjects2.UserName(driver).sendKeys("admin");
//		 LoginPageObjects2.PassWord(driver).sendKeys("tokyo@admin");
//		 LoginPageObjects2.loginButton(driver).click();

	}
}
