package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Addtocart;
import pages.LoginPage;
import pages.ProductPage;
import utility.DriverManager;


public class LoginSteps {


	@Given("user navigate to the login page")
	public void user_navigate_to_the_login_page() {
		DriverManager.getDriver("chrome");
		DriverManager.url("https://www.saucedemo.com/v1/");

	}

	@When("user enters valid username-{string} and password-{string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		LoginPage page = new LoginPage();
		page.loginTextBox(username, password);
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		LoginPage page = new LoginPage();
		page.loginTextBox("standard_user", "secret_sauce");

	}

	@Then("user should be successfully logged in and navigates to product page")
	public void user_should_be_successfully_logged_in_and_navigates_to_product_page() {
		System.out.println("user is in product page");
		ProductPage product = new ProductPage();

		product.dropDownByIndex(2);

	}
	
	@Then("user select products")
	public void user_select_products(io.cucumber.datatable.DataTable dataTable) {//datatable in cucuumber
	   
	  List<String> productList = dataTable.asList();
		ProductPage product = new ProductPage();

	  product.productSelection(productList);
	  
	}
	
	@When("user is able to click the add to cart container")
	public void user_is_able_to_click_the_add_to_cart_container() {
		Addtocart cart=new Addtocart();
		cart.container();
		
	}
	@Then("user able to view the selected item added in cart")
	public void user_able_to_view_the_selected_item_added_in_cart(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Addtocart cart=new Addtocart();
		 List<String> productList = dataTable.asList();
		 cart.checkingItemisAvailable(productList);
		
	}
	@Then("user click the checkoutbutton")
	public void user_click_the_checkoutbutton() {
		Addtocart cart=new Addtocart();
		cart.checkout();
	}







}
