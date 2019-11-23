package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import test.Test_2;
public class NewTest
{

	@Test
	public void launchBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
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
	@Test
	
  	public void launchBrowser1()
  	{
	  Test_2 t=new Test_2();
	  //int x=t.m1();
	  
	  //System.out.println("Hello");
  	}
}
