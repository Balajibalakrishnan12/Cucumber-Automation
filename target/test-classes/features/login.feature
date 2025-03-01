

	Feature: Login
  I want to test the login functionality

	Background: launch browser and url
	Given user navigate to the login page

  
  Scenario: Positive Flow
	When user enters valid username and password
	Then user should be successfully logged in and navigates to product page
 

 	Scenario: Negative Flow
	When user enters invalid username and password
	Then user not able login and should get error 

	@Login @E2E
	#seconario outline is used to run the test using table
	Scenario Outline: Login Flow With Parameter 
  #Given user navigate to the login page
  #passing parameter(if we pass in diamond bracket means passing variable parameter from examples
	When user enters valid username-"<username>" and password-"<password>"
	Then user should be successfully logged in and navigates to product page
	
	@important
	Examples:
	|username|password|
	|standard_user|secret_sauce|

	
	@notimportant
	Examples:
	|username|password|
	|problem_user|secret_sauce|
	
	@ProductPage
	Scenario: Login Flow With Parameter and Checking Selected products is available in cart
  #Given user navigate to the login page
	When user enters valid username-"standard_user" and password-"secret_sauce"
	Then user should be successfully logged in and navigates to product page
	And user select products
	|Sauce Labs Backpack|
	|Sauce Labs Bike Light|
	|Sauce Labs Bolt T-Shirt|
	When user is able to click the add to cart container
	Then user able to view the selected item added in cart
	|Sauce Labs Backpack|
	|Sauce Labs Bike Light|
	|Sauce Labs Bolt T-Shirt|
	And user click the checkoutbutton
	


	
	
	
	
	