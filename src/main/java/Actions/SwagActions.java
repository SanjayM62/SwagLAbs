package Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Objects.Swagobjects;


public class SwagActions {
	
	Swagobjects swagobj;
	Actions act;
	
	public SwagActions(WebDriver driver) {
		swagobj = PageFactory.initElements(driver, Swagobjects.class);
		act = new Actions(driver);
	}
	public void username(String userdata) {
		swagobj.username.sendKeys(userdata);
	}
	public void password(String password) {
		swagobj.password.sendKeys(password);
	}
	public void submit() {
		swagobj.login.click();
	}
	public String error() {
		String msg = swagobj.error.getText();
		return msg;
	}
	public String getproductname() {
		return swagobj.productname.getText();
	}
	public String getProductPrice() {
		return swagobj.productprice.getText();
	}
	
	public void clickAddToCart() {
		swagobj.addtocart.click();
	}
	
	public void cartlogo() {
		swagobj.cartlogo.click();
	}
	
	public void checkout() {
		swagobj.checkout.click();
	}
	
	public void firstName(String string) {
		swagobj.firstName.sendKeys(string);
	}
	public void lastName(String string) {
		swagobj.lastName.sendKeys(string);
	}
	public void postalCode(String string) {
		swagobj.postalCode.sendKeys(string);
	}
	public void continueButton() {
		swagobj.continueButton.click();
	}
	
	public String getActualProductName() {
		return swagobj.actualProductName.getText();
	}
	
	public String getActualProductPrice() {
		return swagobj.actualProductPrice.getText();
	}
	
	public void finishButton() {
		swagobj.finishButton.click();
	}
	
	public String verifyConfirmationMessage() {
		//swagobj.finishButton.click();
		return	swagobj.confirmMsg.getText();
	}
	

}
