package tests;

import org.junit.Rule; 
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements Config{
	
	protected WebDriver driver;

	// Create new instance of external resource to handle processing
	@Rule
	public ExternalResource resource = new ExternalResource() {
		
		// Override before method to set up external resource
		@Override
		protected void before() throws Throwable {
			
			// Set property to reference driver in vendor folder
			System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/vendor/chromedriver_win32.exe");
			
			// Initialize chrome browser driver
			driver = new ChromeDriver();
		}
		// Override teardown method: load after testing method
		@Override
		protected void after() {
			driver.quit();
		}
	};
	
}

