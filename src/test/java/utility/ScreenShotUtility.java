package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.*;

public class ScreenShotUtility extends DriverManager {
	
	public static void takeScreenshot() throws IOException {
		
		File screenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//created a screeshot file and store
		File destinationFile = new File("screenShot"+System.currentTimeMillis()+".png");//done string concatenation for getting seperate screenshots
		FileUtils.copyFile(screenshotFile, destinationFile);
		
		
	}

}
