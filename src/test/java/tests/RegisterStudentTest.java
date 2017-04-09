package tests;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import pageobjects.LoginObjects;
import pageobjects.RegistrationObjects;

public class RegisterStudentTest extends BaseTest {

	private RegistrationObjects registerTest;
	private LoginObjects loginTest;
	
	@Before
	public void setUp(){
		registerTest = new RegistrationObjects(driver);
		loginTest = new LoginObjects(driver);
	}

	@Test
	public void TC_0140_registerStudentSuccess(){
		loginTest.login(validEmail, validPassword);
		registerTest.studentRegistration();
		// Assertion of registering
		assertFalse("Form error", registerTest.isDisplayed(registerTest.duplicateError));
	}
}
