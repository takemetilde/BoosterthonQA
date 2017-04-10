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
	public void TC_0050_loginSuccessful(){
		loginTest.login(validEmail, validPassword);
		assertFalse("Log-in functionality error", loginTest.isDisplayed(loginTest.invalidPopover));
	}
	
	@Test
	public void TC_0080_registrationButtonSuccessful(){
		loginTest.login(validEmail, validPassword);
		registerTest.testButtonRegistration();
		assertTrue("Registration button works correctly", registerTest.isDisplayed(registerTest.schoolSearchLocator));
	}
	
	@Test
	public void TC_0090_schoolSearchSuccessful(){
		loginTest.login(validEmail, validPassword);
		registerTest.testButtonRegistration();
		registerTest.schoolSearchRegistration();
		assertTrue("School search successful", registerTest.isDisplayed(registerTest.firstNameLocator));
	}
	
	@Test
	public void TC_0140_registerStudentSuccess(){
		loginTest.login(validEmail, validPassword);
		registerTest.testButtonRegistration();
		registerTest.schoolSearchRegistration();
		registerTest.studentRegistration();
		assertFalse("Form error", registerTest.isDisplayed(registerTest.duplicateError));
	}
}
