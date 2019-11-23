package Ethans_selenium_batch2_Maven1.Ethans_selenium_batch2_Maven1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportDemo
{
	public static void main(String[] args)
	{
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("C:\\Report_Maven_selenium\\batch.html");
		ExtentReports report=new ExtentReports();
		
		report.attachReporter(htmlreporter);
		
		ExtentTest logger=report.createTest("Aut_01_VerifyLoginToFlightApplication","verify user is able to login successfully");
		logger.log(Status.PASS, "Flight app url is lauched");
		logger.log(Status.PASS, "successfully enter username");
		logger.log(Status.PASS, "successfully enter password");
		logger.log(Status.PASS, "click on login button");
		report.flush();
	}

}
