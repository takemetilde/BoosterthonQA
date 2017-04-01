package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterStudentObjects extends BaseObject{

	By registerButtonLocator = By.linkText("Register a Student");
    By schoolSearchLocator = By.id("query");
    By schoolSelectLocator = By.cssSelector("div.search-result-program");
    By firstNameLocator = By.name("first_name");
    By lastNameLocator = By.name("last_name");
    By genderLocator = By.id("gender");
    By classroomLocator = By.name("classroom_id");
    By checkboxLocator = By.id("waiver-check-box");
    By acceptButtonLocator = By.id("ButtonAcceptTerms");
    
    public RegisterStudentObjects(WebDriver driver) {
		super(driver);
	}
    
    public void registerStudent(){
    	click(registerButtonLocator);
    	type(schoolSearchLocator, schoolSearch);
    	waitFor(schoolSelectLocator);
    	hover(schoolSelectLocator);
    	click(schoolSelectLocator);
    	waitFor(firstNameLocator);
    	type(firstNameLocator, firstNameRegis);
    	type(lastNameLocator, lastNameRegis);
    	select(genderLocator, genderRegis);
    	select(classroomLocator, classroomRegis);
    	click(checkboxLocator);
    	click(acceptButtonLocator);
    }
}
