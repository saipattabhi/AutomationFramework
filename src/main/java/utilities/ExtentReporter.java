package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	public static  ExtentReports getextentReport()
	{
		
		ExtentReports extentReports;
	    String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("Tutorial Ninja Application Results");
		reporter.config().setDocumentTitle("Test Results");
		
	    extentReports=new ExtentReports();
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("operatingsystem", "windows 10");
		extentReports.setSystemInfo("Tested By", "Sai Pattabhi");
		return extentReports;
		}

}
