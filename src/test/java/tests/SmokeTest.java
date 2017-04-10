package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pageobjects.LoginObjects;
import pageobjects.RegistrationObjects;

public class SmokeTest extends BaseTest{

	private LoginObjects loginTest;
	private RegistrationObjects registerTest;
	
	@Before
	public void setUp(){
		// Instantiate login object
		loginTest = new LoginObjects(driver);
		registerTest = new RegistrationObjects(driver);
	}

	@Test
	public void TC_0140_registerStudentSuccess(){
		loginTest.login(validEmail, validPassword);
		assertFalse("Log-in functionality error", loginTest.isDisplayed(loginTest.invalidPopover));
		registerTest.testButtonRegistration();
		assertTrue("Registration button works correctly", registerTest.isDisplayed(registerTest.schoolSearchLocator));
		registerTest.schoolSearchRegistration();
		assertTrue("School search successful", registerTest.isDisplayed(registerTest.firstNameLocator));
		registerTest.studentRegistration();
		assertFalse("Form error", registerTest.isDisplayed(registerTest.duplicateError));
	}
}
