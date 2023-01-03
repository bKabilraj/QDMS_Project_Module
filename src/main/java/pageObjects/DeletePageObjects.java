package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeletePageObjects {

//	@FindBy(how = How.XPATH, using = "//*[@class='sc-htpNat bEzDga']/child::div")
//	public static WebElement master;
	
	@FindBy(how = How.XPATH, 
			using = "//*[@viewBox='64 64 896 896'][@focusable='false'][@data-icon='delete'][@width='1em'][@height='1em'][@fill='currentColor'][@aria-hidden='true']")
	public static WebElement deleteicon;
	
	
	@FindBy(how = How.XPATH, 
			using = "/html/body/div[3]/div/div/div/div[2]/div/div[2]/button[1]/span")
	public static WebElement cancelltext;
	
	@FindBy(how = How.XPATH, 
			using = "//*[@viewBox='64 64 896 896'][@focusable='false'][@data-icon='delete'][@width='1em'][@height='1em'][@fill='currentColor'][@aria-hidden='true']")
	public static WebElement deleteicon2;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[2]/div/div[2]/button[2]/span")
	public static WebElement okButton;
}
