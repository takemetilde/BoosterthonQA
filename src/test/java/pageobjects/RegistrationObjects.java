package pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

public class RegistrationObjects extends BaseObject{

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
    
    public RegistrationObjects(WebDriver driver) {
		super(driver);
	}
    
    public void testButtonRegistration(){
    	click(registerButtonLocator);
    }
    
    public void schoolSearchRegistration(){
    	type(schoolSearchLocator, schoolSearch);
    	waitFor(schoolSelectLocator, 8);
    	hover(schoolSelectLocator);
    	click(schoolSelectLocator);
    	waitFor(firstNameLocator, 8);
    }
    
    public void studentRegistration(){
    	type(firstNameLocator, firstNameRegis);
    	type(lastNameLocator, lastNameRegis);
    	select(genderLocator, genderRegis);
    	select(classroomLocator, classroomRegis);
    	click(checkboxLocator);
    	click(acceptButtonLocator);
    }
}
