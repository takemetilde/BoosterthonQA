package tests;

import org.junit.Before;
import org.junit.Test;

import pageobjects.RegisterStudentObjects;

public class RegisterStudentTest extends BaseTest {

	private RegisterStudentObjects registerTest;
	
	@Before
	public void setUp(){
		registerTest = new RegisterStudentObjects(driver);
	}

	@Test
	public void registerStudent(){
		registerTest.registerStudent();
	}
}
