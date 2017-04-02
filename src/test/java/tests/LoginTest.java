package tests;

import static org.junit.Assert.assertFalse; 

import org.junit.Before;
import org.junit.Test;
import pageobjects.LoginObjects;

public class LoginTest extends BaseTest{

	private LoginObjects loginTest;
	
	@Before
	public void setUp(){
		// Instantiate login object
		loginTest = new LoginObjects(driver);
	}
	
	@Test
	public void TC_0050_loginSuccessful(){
		loginTest.login(validEmail, validPassword);
		assertFalse("Log-in functionality error", loginTest.isDisplayed(loginTest.invalidPopover));
	}
	
	@Test
	public void TC_0060_loginUnsuccessful(){
		loginTest.login(invalidEmail, invalidPassword);
		assertFalse("Log-in functionality error", loginTest.isDisplayed(loginTest.invalidPopover));
	}
}
