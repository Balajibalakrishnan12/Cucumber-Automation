package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bind.annotation.Super;
import utility.DriverManager;

public class LoginPage extends DriverManager{

	public WebElement loginUserId = driver.findElement(By.id("user-name"));//properties locator
	public WebElement loginPassword = driver.findElement(By.id("password"));
	public WebElement loginButton= driver.findElement(By.id("login-button"));

		public void loginTextBox( String username,String password)//methods
		{
			loginUserId.sendKeys(username);
			loginPassword.sendKeys(password);
			loginButton.click();
			
		}
		
}
