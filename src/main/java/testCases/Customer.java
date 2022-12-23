//package testCases;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//public class Customer {
// 
//	@Test
//	public void addNewCustomer() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/#/login");
//		Thread.sleep(3000);
//		
//		WebElement UserName=driver.findElement(By.id("usernameOrEmail"));
//		UserName.sendKeys("admin");
//		
//		WebElement PassWord=driver.findElement(By.id("password"));
//		PassWord.sendKeys("tokyo@admin");
//		
//		WebElement loginButton=driver.findElement(By.xpath
//				("//button[@type='submit'][@class='ant-btn login-form-button']"));
//		loginButton.click();
//		Thread.sleep(2000);
//		
//		WebElement master=driver.findElement(By.xpath
//				("//*[@class='sc-htpNat bEzDga']/child::div")); //Locating a child element
//		master.click();
//		Thread.sleep(3200);
//		 
//		WebElement customer=driver.findElement(By.xpath
//				("//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/customerlevel']"));
//		customer.click();
//		Thread.sleep(4800);
//		
//		
//		WebElement addProjectButton=driver.findElement(By.xpath
//				("//button[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw']"));
//		addProjectButton.click();
//		Thread.sleep(3000);
//		
//		
//		WebElement selectPlant=driver.findElement(By.xpath("//*[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search'][@name='plant']"));
//		selectPlant.click(); 
//		Thread.sleep(3000);
//		 
//		WebElement selectPlant1=driver.findElement(By.xpath("//*[@id=\"plant\"]"));
//		selectPlant1.sendKeys("RMC Anuradhapura Plant");
//		
//		List<WebElement>dynamicList=driver.findElements(By.cssSelector("div[class='ant-select-item-option-content']"));
//		
//		for (int i = 0; i < dynamicList.size(); i++) {
//			String text=dynamicList.get(i).getText();
//			System.out.println("Text is" +text);
//			if (text.contains("RMC Anuradhapura Plant")) {
//				dynamicList.get(i).click();
//				break;
//			}
//		}
//		
//		 
//		WebElement enterProjectName=driver.findElement(By.id("project_name"));
//		enterProjectName.sendKeys("Kabil_Project03");
//		
//		////*[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search'][@name='customer']
//		WebElement enterCustomer1=driver.findElement(By.xpath("//div[@class='input_wrapper']/label"));
//		enterCustomer1.click();
//		Thread.sleep(3000);
//		
//		////*[@id='customer']
//		WebElement enterCustomer2=driver.findElement(By.xpath("//*[@id=\"customer\"]"));
//		enterCustomer2.sendKeys("RR Construction pvt Ltd");
//		Thread.sleep(3000);
//		enterCustomer2.sendKeys(Keys.ENTER);
//		
//		//span[class='ant-select-selection-item']
//		//List<WebElement> dynamicList1=driver.findElements(By.cssSelector("div[class='ant-select-item-option-content']"));
//		
////		for (int i = 0; i < dynamicList1.size(); i++) {
////			String text=dynamicList1.get(i).getText();
////			//dynamicList1.get(i).getT
////			System.out.println("Text is 1 " +text);
////			if (text.contains("RR Construction pvt Ltd")) { 
////				dynamicList1.get(i).click(); 
////				enterCustomer2.
////				break;
////			} 
////		} 
//		enterCustomer2.sendKeys(Keys.RETURN);
//
//		
//		WebElement selectContactPerson=driver.findElement(By.id("contact_person"));
//		selectContactPerson.sendKeys("Kabil_Contact03");
//		
//		WebElement enterContactNumber=driver.findElement(By.id("contact_no"));
//		enterContactNumber.sendKeys("0779434693");
//		
//		WebElement selectDate=driver.findElement(By.id("start_date"));
//		selectDate.sendKeys("2022-12-15");
//		selectDate.sendKeys(Keys.RETURN);
//		Thread.sleep(3000);
//		
//		WebElement subProBut=driver.findElement(By.xpath
//				("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]"));
//		subProBut.click();
//	
//		
//		
//	}
//}
