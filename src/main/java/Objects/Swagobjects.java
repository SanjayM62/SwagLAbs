package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Swagobjects {
	
	@FindBy(id="user-name")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement login;
	
	@FindBy(xpath="//*[@data-test='error']")
	public WebElement error;
	
	@FindBy(xpath="//*[@id='item_2_title_link']")
	public WebElement productname;
	
	@FindBy(xpath="(//div[@class='inventory_item_price'])[1]")
	public WebElement productprice;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public WebElement addtocart;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public WebElement cartlogo;
	
	@FindBy(id= "checkout")
	public WebElement checkout;

	@FindBy(xpath = "//*[@name='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//*[@name='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath = "//*[@name='postalCode']")
	public WebElement postalCode;
	
	@FindBy(xpath = "//*[@name='continue']")
	public WebElement continueButton;
	
	@FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
	public WebElement actualProductName;
	
	@FindBy(xpath = "//div[@class='inventory_item_price']")
	public WebElement actualProductPrice;
	
	@FindBy(id= "finish")
	public WebElement finishButton;
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	public WebElement confirmMsg;


}
