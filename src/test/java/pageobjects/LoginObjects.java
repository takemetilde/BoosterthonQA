package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObjects extends BaseObject {

	By emailLocator = By.name("identity");
    By passwordLocator = By.name("password");
    By loginButtonLocator = By.xpath("//input[@value='LOGIN']");
    
	public LoginObjects(WebDriver driver) {
		super(driver);
	}

	public void logIn(){
		visit(baseURL);
		type(emailLocator, emailLogin);
		type(passwordLocator, passwordLogin);
		click(loginButtonLocator);
	}    
}
