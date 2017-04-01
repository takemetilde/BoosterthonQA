package tests;

import org.junit.Before;
import org.junit.Test;

import pageobjects.LoginObjects;
import pageobjects.RegisterStudentObjects;

public class RegisterStudentTest extends BaseTest {

	private RegisterStudentObjects registerTest;
	private LoginObjects loginTest;
	
	@Before
	public void setUp(){
		registerTest = new RegisterStudentObjects(driver);
		loginTest = new LoginObjects(driver);
	}

	@Test
	public void registerStudent(){
		loginTest.login(validEmail, validPassword);
		registerTest.registerStudent();
		// Assertion of registering
		
	}
}
