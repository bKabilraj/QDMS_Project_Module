package testCases;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects2;
import pageObjects.RealPOMCustomerPageObjects;

public class RealPOMCustomer2Assertion {
 
//	String name="addProjectButton";
//	//Border shape=none;
//	Style style="rgb(0, 19, 40)";
//	boolean value=false;
	
	@Test
	public void addNewCustomer() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.35:8083/#/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, LoginPageObjects2.class);
		
		LoginPageObjects2.UserName.sendKeys("admin");
		LoginPageObjects2.PassWord.sendKeys("tokyo@admin");
		LoginPageObjects2.loginButton.click();
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, RealPOMCustomerPageObjects.class);
		
		RealPOMCustomerPageObjects.master.click();
		RealPOMCustomerPageObjects.customer.click();
		RealPOMCustomerPageObjects.addProjectButton.click();
		
		Point location = RealPOMCustomerPageObjects.addProjectButton.getLocation();
	//	   int actual_x = location.getX();
	 //      int actual_y = location.getY();
	       
        
		
		//Assert.assertTrue(false, "This should not be true");
//		Assert.assertEquals(name, "addProjectButton");
		
		//<button 
		//type="button" 
		//class="ant-btn sc-gZMcBi dMdnOw" 
		//style="background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;">
		

		
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
		
Point expectedLocation = new Point(102, 32);
        
        Dimension size_of_icon = RealPOMCustomerPageObjects.addProjectButton.getSize();
        System.out.println(size_of_icon);
    
        

        
        String colo = RealPOMCustomerPageObjects.addProjectButton.getCssValue("color");
        System.out.println(location);
        String expected_color = "rgb(255, 255, 255, 1)";
        Assert.assertEquals(expectedLocation,location);
        Assert.assertEquals(colo, expected_color);
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
