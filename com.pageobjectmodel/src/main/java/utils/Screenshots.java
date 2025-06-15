package utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshots {




	WebDriver driver;

	// Constructor
	public Screenshots(WebDriver driver) {
		this.driver = driver;
	}

	// Screenshot method
	public void captureScreenshot(String screenshotName) {
		// Create timestamp to avoid overwriting
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String fileName = screenshotName + "_" + timeStamp + ".png";
		String filePath = System.getProperty("user.dir") + "/screenshots/" + fileName;

		// Capture screenshot
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(filePath));
			System.out.println("Screenshot saved: " + filePath);
		} catch (IOException e) {
			System.out.println("Error saving screenshot: " + e.getMessage());
		}
	}
}

