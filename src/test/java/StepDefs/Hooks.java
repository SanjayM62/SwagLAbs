package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void setup() {
		//Actions.driver = new ChromeDriver();
		//Actions.driver.manage().window().maximize();
		//loginActions.driver = new ChromeDriver();
		//loginActions.driver.manage().window().maximize();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}

}
