package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class DataWithHeader {
	WebDriver driver;
	
	@Given("Go to the webpage")
	public void go_to_the_webpage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/www.saucedemo.com");
	}
	@When("enter the below credentials")
	public void enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>>  keyValue=dataTable.asMaps(String.class, String.class);
		String userName =keyValue.get(0).get("Username");
		String passWord=keyValue.get(0).get("Password");
		
		 
		 driver.findElement(By.id("user-name")).sendKeys(userName);
		 driver.findElement(By.id("password")).sendKeys(passWord);
	}
	@When("click login btn")
	public void click_login_btn() {
	  driver.findElement(By.id("login-button")).click();
	}

	
}

