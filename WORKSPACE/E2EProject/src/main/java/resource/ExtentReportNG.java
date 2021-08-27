package resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		
		String path =System.getProperty("user.dir") +"\\reports\\testReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); 
		reporter.config().setReportName("Web Automation Testing");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vijay Shankar");
		return extent;
		}

}
