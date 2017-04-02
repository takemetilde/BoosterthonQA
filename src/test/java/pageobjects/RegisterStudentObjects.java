package pageobjects;

import static org.junit.Assert.*;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

public class RegisterStudentObjects extends BaseObject{

	By registerButtonLocator = By.linkText("Register a Student");
    By schoolSearchLocator = By.id("query");
    By schoolSelectLocator = By.cssSelector("div[registration_code='316649']");
    By firstNameLocator = By.name("first_name");
    By lastNameLocator = By.name("last_name");
    By genderLocator = By.id("gender");
    By classroomLocator = By.name("classroom_id");
    By checkboxLocator = By.className("unselectable");
    By acceptButtonLocator = By.id("ButtonAcceptTerms");
    public By duplicateError = By.className("alert");
    
    public RegisterStudentObjects(WebDriver driver) {
		super(driver);
	}
    
    public void registerStudent(){
    	// TC_008.0
    	click(registerButtonLocator);
    	
    	// TC_009.0
    	type(schoolSearchLocator, schoolSearch);
    	waitFor(schoolSelectLocator, 8);
    	hover(schoolSelectLocator);
    	click(schoolSelectLocator);
    	waitFor(firstNameLocator, 8);
    	
    	// TC_015.0
    	type(firstNameLocator, firstNameRegis);
    	type(lastNameLocator, lastNameRegis);
    	select(genderLocator, genderRegis);
    	select(classroomLocator, classroomRegis);
    	click(checkboxLocator);
    	click(acceptButtonLocator);
    	assertFalse("Form error", isDisplayed(duplicateError));
    }
}
