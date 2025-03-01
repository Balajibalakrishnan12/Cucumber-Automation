package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.DriverManager;

public class Payment extends DriverManager {

	public WebElement firstNameLocator = driver.findElement(By.xpath("//div[@class='checkout_info']/input[@id='first-name']"));
	public WebElement lastNameLocator = driver.findElement(By.xpath("//div[@class='checkout_info']/input[@id='last-name']"));
	public WebElement continueButton = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
	 public WebElement postalcodeLocator = driver.findElement(By.xpath("//div[@class='checkout_info']/input[@id='postal-code']"));
	
	public void paymentofproducts(String firstname, String lastname, Integer postalcode)  {
		firstNameLocator.sendKeys(firstname);
		lastNameLocator.sendKeys(lastname);
		
		 
		 postalcodeLocator.sendKeys(String.valueOf(postalcode));
		continueButton.click();

	}
	

}
