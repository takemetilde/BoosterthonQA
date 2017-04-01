package pageobjects;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseObject{

	// Create instance of Selenium webdriver
	private WebDriver driver; 

	// Constructor for Base class declaring driver
	public BaseObject(WebDriver driver) {
		this.driver = driver;
	}

	// Method to navigate page
	public void visit(String url) {
		driver.get(url);
	}

	// Method to find element
	public WebElement find(By locator) {
		return driver.findElement(locator);
	}

	// Method to click
	public void click(By locator) {
		find(locator).click();
	}

	// Method to type
	public void type(String inputText, By locator) {
		find(locator).sendKeys(inputText);
	}

	// Method to submit
	public void submit(By locator) {
		find(locator).submit();
	}
	
	// Method to hover
	public Actions hover(By locator) {
		Actions hover = new Actions(driver);
		return hover.moveToElement(find(locator));
	}

	// Method to find and display locator
	public Boolean isDisplayed(By locator) {
		try {
			return find(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException exception) {
			return false;
		}
	}
	
	// Method to explicit wait 
	public void waitFor(By locator){
		WebDriverWait waitFor = new WebDriverWait(driver, 10);
		waitFor.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}

