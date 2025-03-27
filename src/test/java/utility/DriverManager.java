package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public static WebDriver driver;
	
	public static void getDriver(String browserName) 
	
	{
	 switch(browserName){
	 
	 case "chrome":
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe");
		 	WebDriverManager.chromedriver().setup();// it automatically updated the current chrome browers
			driver = new ChromeDriver();
			
			break;
			
	 default:
		 
		 System.out.println("The option is not valid");
	 	}
	    
	}
	public static void url(String url)
	{
		driver.get(url);
	}
	public static void close() {
		driver.close();
	}
	
}
