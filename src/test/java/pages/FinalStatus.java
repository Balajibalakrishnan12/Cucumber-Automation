package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.DriverManager;

public class FinalStatus extends DriverManager {
	public String finalItemTotal= driver.findElement(By.className("summary_subtotal_label")).getText();
	public String taxamountfinal= driver.findElement(By.className("summary_tax_label")).getText();
	public String totalFinalamount = driver.findElement(By.className("summary_total_label")).getText();
	
	public void calculation() {
		double itemTotal = Double.parseDouble(finalItemTotal.replace("Item total: $", ""));//double parse is used to remove the dollar sign and convert to double
        double tax = Double.parseDouble(taxamountfinal.replace("Tax: $", ""));
        double displayedTotal = Double.parseDouble(totalFinalamount.replace("Total: $", ""));
        double calculatetotal=itemTotal+tax;
        
        if(calculatetotal==displayedTotal)
        {
        	System.out.println("correct value");
        }
        else {
        	System.out.println("worngvalue");
        }
        
		
	}
	public void finish()   {
		
		 WebElement finishbutton = driver.findElement(By.xpath("//a[text()='FINISH']"));

		finishbutton.click();
	}

}
