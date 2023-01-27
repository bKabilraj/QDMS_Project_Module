package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects2 {

	@FindBy(how = How.ID, using ="usernameOrEmail")
	public static WebElement UserName;
	
	@FindBy(how = How.ID, using = "password")
	public static WebElement PassWord;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
	public static WebElement loginButton;

	
} 


