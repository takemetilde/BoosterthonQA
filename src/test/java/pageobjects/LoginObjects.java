package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObjects extends BaseObject {

	By emailLocator = By.name("identity");
    By passwordLocator = By.name("password");
    By loginButtonLocator = By.xpath("//input[@value='LOGIN']");
    public By invalidPopover = By.className("popover-content");
    
	public LoginObjects(WebDriver driver) {
		super(driver);
	}

	public void login(String email, String password){
		visit(baseURL);
		type(emailLocator, email);
		type(passwordLocator, password);
		click(loginButtonLocator);
		waitFor(invalidPopover, 8);
	}
	  
}
