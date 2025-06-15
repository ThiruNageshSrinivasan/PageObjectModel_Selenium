package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.LoginPage;
import utils.ExtentReport;
import utils.LoggerUtil;

public class Login {

	WebDriver driver;
	LoginPage loginPage;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void setup() {
		report = ExtentReport.getReportInstance();
		test = report.createTest("Login Test");

		driver = new ChromeDriver();
		driver.get("https://stock.scriptinglogic.in/");

		loginPage = new LoginPage(driver);
		test.info("Browser Launched and URL Loaded");
	}

	@Test
	public void testValidLogin() {
		loginPage.loginToApp("testuser", "testpassword");
		loginPage.loginclick();
		test.pass("Login successful");

		LoggerUtil.getLogger(Login.class).info("Test ran for user: testuser");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		report.flush();
		test.info("Test Completed and Report Generated");
	}
}