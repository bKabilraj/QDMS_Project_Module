package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RealPOMCustomerPageObjects {
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-htpNat bEzDga']/child::div")
	public static WebElement master;
	////*[@class='sc-htpNat bEzDga']/child::div
	@FindBy(how = How.XPATH, using = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/customerlevel']")
	public static WebElement customer;
	
	@FindBy(how = How.XPATH, using = "//button[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw']")
	public static WebElement addProjectButton;
	
	@FindBy(how = How.XPATH, using = "//*[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search'][@name='plant']")
	public static WebElement selectPlant;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"plant\"]")
	public static WebElement selectPlant1;
	
	@FindBy(how = How.XPATH, using = "div[class='ant-select-item-option-content']")
	public static List<WebElement> dynamicList;
	
	@FindBy(how = How.ID, using = "project_name")
	public static WebElement enterProjectName;
	
	@FindBy(how = How.XPATH, using = "//*[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search'][@name='customer']")
	public static WebElement enterCustomer1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer\"]")
	public static WebElement enterCustomer2;
	
	@FindBy(how = How.ID, using = "contact_person")
	public static WebElement selectContactPerson;
	
	@FindBy(how = How.ID, using = "contact_no")
	public static WebElement enterContactNumber;
	
	@FindBy(how = How.ID, using = "start_date")
	public static WebElement selectDate;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement subProBut;
	
//	public static WebElement master(WebDriver driver) {
//		return driver.findElement(By.xpath
//				("//*[@class='sc-htpNat bEzDga']/child::div")); //ok
//		  
//	}
//	
//	public static WebElement customer(WebDriver driver) {
//		return driver.findElement(By.xpath
//				("//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/customerlevel']")); //ok
//	}
//	
//	public static WebElement addProjectButton(WebDriver driver) {
//		return driver.findElement(By.xpath
//				("//button[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw']")); //ok
//	}
//	
//	public static WebElement selectPlant(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search'][@name='plant']")); //ok
//		
//	}
//	
//	public static WebElement selectPlant1(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@id=\"plant\"]")); //ok
//		
//	}
//	
//	public static List<WebElement> dynamicList(WebDriver driver) {
//		return driver.findElements(By.cssSelector("div[class='ant-select-item-option-content']")); //ok
//		
//	}
//	
//	public static WebElement enterProjectName(WebDriver driver) {
//		return driver.findElement(By.id("project_name"));
//	}
//	
//	public static WebElement enterCustomer1(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search'][@name='customer']")); //ok
//	}
//	
//	public static WebElement enterCustomer2(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@id=\"customer\"]")); //ok
//	}
//	
//	public static WebElement selectContactPerson(WebDriver driver) {
//		return driver.findElement(By.id("contact_person"));  //ok
//	}
//	
//	public static WebElement enterContactNumber(WebDriver driver) {
//		return driver.findElement(By.id("contact_no")); //ok
//	}
//	
//	public static WebElement selectDate(WebDriver driver) {
//		return driver.findElement(By.id("start_date")); //ok
//	}
//	
//	public static WebElement subProBut(WebDriver driver) {
//		return driver.findElement(By.xpath
//				("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")); //ok
//	}
//	
}
