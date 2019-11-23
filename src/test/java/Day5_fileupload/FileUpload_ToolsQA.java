package Day5_fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_ToolsQA
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,900)");
		
		WebElement uploadElement = driver.findElement(By.id("photo"));
		Thread.sleep(5000);
		uploadElement.sendKeys("C:\\Users\\91976\\Pictures\\Saved Pictures\\Junonia_lemonias_-_Lemon_Pansy_25.jpg");
		
		
		//StringSelection selection= new StringSelection("C:\\Users\\91976\\Pictures\\Saved Pictures");
		//Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//clip.setContents(selection, selection);
		
		//Runtime run = Runtime.getRuntime();
		//run.exec("C:\\Windows\\notepad.exe");
		Thread.sleep(5000);
		
		Robot r = new Robot();
		Thread.sleep(5000);
		
		/* to refresh the page
		 	//r.keyPress(KeyEvent.VK_5);
			//r.keyRelease(KeyEvent.VK_5);
		*/
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_V);
		
	}

}