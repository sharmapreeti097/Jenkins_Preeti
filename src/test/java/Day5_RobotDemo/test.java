package Day5_RobotDemo;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.querySelector(\"#photo\").click()");
		
		Thread.sleep(5000);
	}

}
