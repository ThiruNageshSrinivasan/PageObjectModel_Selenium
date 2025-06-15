package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Executed By", "THIRU");
            extent.setSystemInfo("Environment", "QA");
        }
        return extent;
    }

	public ExtentTest createTest(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}