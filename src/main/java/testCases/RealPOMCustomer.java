package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects2;
import pageObjects.RealPOMCustomerPageObjects;

public class RealPOMCustomer {
 
	@Test
	public void addNewCustomer() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/#/login");
		Thread.sleep(3000);
		
		
		PageFactory.initElements(driver, LoginPageObjects2.class);
		
		LoginPageObjects2.UserName.sendKeys("admin");
		LoginPageObjects2.PassWord.sendKeys("tokyo@admin");
		LoginPageObjects2.loginButton.click();
		Thread.sleep(5000);
//		LoginPageObjects2.UserName(driver).sendKeys("admin");
//		LoginPageObjects2.PassWord(driver).sendKeys("tokyo@admin");
//		LoginPageObjects2.loginButton(driver).click();
//		Thread.sleep(3000); 
		PageFactory.initElements(driver, RealPOMCustomerPageObjects.class);

		
		RealPOMCustomerPageObjects.master.click();
		Thread.sleep(3300); 
		
		RealPOMCustomerPageObjects.customer.click();
		Thread.sleep(3200);
		
		RealPOMCustomerPageObjects.addProjectButton.click();
		Thread.sleep(3200);
		
		RealPOMCustomerPageObjects.selectPlant.click();
		Thread.sleep(3200); 
		
		RealPOMCustomerPageObjects.selectPlant1.sendKeys("RMC Anuradhapura Plant");
		
		
		for (int i = 0; i < RealPOMCustomerPageObjects.dynamicList.size(); i++) {
		String text=RealPOMCustomerPageObjects.dynamicList.get(i).getText();
		System.out.println("Text is" +text);
		if (text.contains("RMC Anuradhapura Plant")) {
			RealPOMCustomerPageObjects.dynamicList.get(i).click();
			break;
		} 
	}
		RealPOMCustomerPageObjects.selectPlant1.sendKeys(Keys.ENTER);
		
		RealPOMCustomerPageObjects.enterProjectName.sendKeys("Kabil_Project06");
		Thread.sleep(3200);
		
		RealPOMCustomerPageObjects.enterCustomer1.click();
		RealPOMCustomerPageObjects.enterCustomer2.sendKeys("RR Construction pvt Ltd");
		Thread.sleep(3200);
		RealPOMCustomerPageObjects.enterCustomer2.sendKeys(Keys.ENTER);
				
		RealPOMCustomerPageObjects.selectContactPerson.sendKeys("Kabil_Contact08");
		RealPOMCustomerPageObjects.enterContactNumber.sendKeys("0779434695");
		RealPOMCustomerPageObjects.selectDate.sendKeys("2022-12-17");
		RealPOMCustomerPageObjects.selectDate.sendKeys(Keys.RETURN);
		RealPOMCustomerPageObjects.subProBut.click();
		
//		
//		RealPOMCustomerPageObjects.master(driver).click();
//		Thread.sleep(3200);
//		
//		RealPOMCustomerPageObjects.customer(driver).click();
//		Thread.sleep(3200);
//		
//		RealPOMCustomerPageObjects.addProjectButton(driver).click();
//		Thread.sleep(3200);
//		
//		RealPOMCustomerPageObjects.selectPlant(driver).click();
//		Thread.sleep(3200);
//		
//		RealPOMCustomerPageObjects.selectPlant1(driver).sendKeys("RMC Anuradhapura Plant");
//		
//		for (int i = 0; i < RealPOMCustomerPageObjects.dynamicList(driver).size(); i++) {
//			String text=RealPOMCustomerPageObjects.dynamicList(driver).get(i).getText();
//			System.out.println("Text is" +text);
//			if (text.contains("RMC Anuradhapura Plant")) {
//				RealPOMCustomerPageObjects.dynamicList(driver).get(i).click();
//				break;
//			}
//		}
//		
//		RealPOMCustomerPageObjects.enterProjectName(driver).sendKeys("Kabil_Project05");
//		Thread.sleep(3200);
//		
//		RealPOMCustomerPageObjects.enterCustomer1(driver).click();
//		RealPOMCustomerPageObjects.enterCustomer2(driver).sendKeys("RR Construction pvt Ltd");
//		Thread.sleep(3200);
//		RealPOMCustomerPageObjects.enterCustomer2(driver).sendKeys(Keys.ENTER);
//				
//		RealPOMCustomerPageObjects.selectContactPerson(driver).sendKeys("Kabil_Contact05");
//		RealPOMCustomerPageObjects.enterContactNumber(driver).sendKeys("0779434695");
//		RealPOMCustomerPageObjects.selectDate(driver).sendKeys("2022-12-17");
//		RealPOMCustomerPageObjects.selectDate(driver).sendKeys(Keys.RETURN);
//		RealPOMCustomerPageObjects.subProBut(driver).click();
		
	
	}
}
