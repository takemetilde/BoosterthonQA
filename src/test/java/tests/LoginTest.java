package tests;

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
	public void login(){
		// Call login method
		loginTest.logIn();
	}
}
