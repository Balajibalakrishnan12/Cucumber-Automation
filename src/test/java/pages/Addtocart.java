package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utility.DriverManager;

public class Addtocart extends DriverManager{
	
	public WebElement cartcontainerButton = driver.findElement(By.id("shopping_cart_container"));
		
	
	public void checkingItemisAvailable(List<String>available) throws InterruptedException {
		Thread.sleep(3000);
		for (String availableItem : available) {
            driver.findElement(By.xpath("//div[@class='cart_item']//div[@class='inventory_item_name'][text()='" + availableItem + "']"));
           Assert.assertTrue(true);
//            if (cartItem.isDisplayed()) {
//                System.out.println("Item successfully added to the cart: " + cartItem.getText());
//            } else {
//                System.out.println("Item not found in the cart: " + availableItem);
//            }
        }
	}
	public void container() {
		cartcontainerButton.click();
		
	}
	public void checkout()  {
		
		
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		
	}
	

}
