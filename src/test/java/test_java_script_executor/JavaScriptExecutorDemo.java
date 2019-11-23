package test_java_script_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//for rightstartmath//mention code below is correct for rightstartmath
		/*driver.get("https://rightstartmath.com/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"#search-3 > div > form > input.s.search-input\").value='abc'");
		js.executeScript("document.querySelector(\"#text-3 > div > div > a:nth-child(1)\").setAttribute(\"style\",\"border: 3px solid SALMON\")");
		js.executeScript("document.querySelector(\"#text-14 > div > div > p > a\").scrollIntoView(true)");
		*/
		
		//for redbus//below code for redbus is correct
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"#onward_cal\").value=\"15-Dec-2019\"");
	}
}