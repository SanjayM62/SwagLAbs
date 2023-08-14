package stepDefs;


import Actions.SwagActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class SauceDemoDef {
	
	String productname;
	String productprice;
	
	SwagActions swagac = new SwagActions(Hooks.driver);
	@Given("user launch the url1 {string}")
	public void user_launch_the_url1 (String string) {
		Hooks.driver.get(string);
	}

	@When("user enter the valid username {string}")
	public void user_enter_the_valid_username(String string) {
		swagac.username(string);

	}

	@And("user enter the vaild password {string}")
	public void user_enter_the_vaild_password(String string) {
		swagac.password(string);
	}
	
	@And("user click on login button")
	public void user_click_on_login_button(){
		swagac.submit();
	}

	@Then("user able to login application")
	public void user_able_to_login_application() {
		System.out.println(Hooks.driver.getTitle());
		Assert.assertEquals("Swag Labs", Hooks.driver.getTitle());
	}
	
	@And("user get name and price of fifth availaible item")
	public void user_get_name_and_price_of_fifth_availaible_item() {
		productname = swagac.getproductname();
		System.out.println(productname);
		productprice = swagac.getActualProductPrice();
		System.out.println(productprice);
	}

	@And("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		swagac.clickAddToCart();

	}

	@And("user navigate to cart")
	public void user_navigate_to_cart() {
		swagac.cartlogo();
	}

	@And("user continue to checkout the item")
	public void user_continue_to_checkout_teh_item() {
		
	}

	@And("user fill the details for delivery")
	public void user_fill_the_details_for_delivery() throws InterruptedException {
		Thread.sleep(3000);
		swagac.checkout();
	}
	
	@And("user enter the firstname {string}")
	public void user_enter_the_firstname(String string) {
		swagac.firstName(string);
	}

	@And("user enter the lastname {string}")
	public void user_enter_the_lastname(String string) {
		swagac.lastName(string);
	}

	@And("user enter the postalcode {string}")
	public void user_enter_the_postalcode(String string) {
		swagac.postalCode(string);
	}
	
	@And("user click on continue")
	public void user_click_on_continuee() {
		swagac.continueButton();
	}
	
	@And("user validate the actual name {string} and price {string}")
	public void user_validate_the_actual_name_and_price(String string, String string2) {
		String productname = swagac.getActualProductName();
		System.out.println(productname);
		Assert.assertEquals(string, swagac.getActualProductName());
		
		String productprice = swagac.getActualProductPrice();
		System.out.println(productprice);
		Assert.assertEquals(string2, swagac.getActualProductPrice());
	}
	
	@And("user click on finish button")
	public void user_click_on_finish_button() {
		swagac.finishButton();
	}
	
	@Then("user verfiy the confirmation message {string}")
	public void user_verfiy_the_confirmation_message(String string) {
		String confirmsg = swagac.verifyConfirmationMessage();
		System.out.println(confirmsg);
		Assert.assertEquals(string, swagac.verifyConfirmationMessage());
	}

	@Given("user launch the url {string}")
	public void user_launch_the_url(String string) {
		Hooks.driver.get(string);
	}

	@When("user enter the Invalid username {string}")
	public void user_enter_the_invalid_username(String string) {
		swagac.username(string);
	}

	@And("user enter the Invalid password {string}")
	public void user_enter_the_invalid_password(String string) {
		swagac.password(string);
	}

	@Then("user should failed to login and showing Error")
	public void user_failed_to_login_and_showing_error() {
		System.out.println(Hooks.driver.getTitle());
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", swagac.error());
	}
	}

