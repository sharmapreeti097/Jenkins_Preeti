package Day5_RobotDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotDemo
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		
		Thread.sleep(5000);
		
		StringSelection selection= new StringSelection("C:\\Users\\91976\\Pictures\\Saved Pictures\\Junonia_lemonias_-_Lemon_Pansy_25.jpg");
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(selection, selection);
		System.out.print(clip);
		
		//Runtime run = Runtime.getRuntime();
		 //run.exec("C:\\Windows\\notepad.exe");
		 
		//driver.findElement(By.name("photo")).click();
		WebElement Source= driver.findElement(By.xpath("//*[@id=\"photo\"]"));
		Source.click();
		//Thread.sleep(2000);
		
		
		// Create object of Robot class
		Robot robot = new Robot();
	
		Thread.sleep(1000);
				      
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
				 
		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
				 
		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
				 
		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
				        
		//Press Enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		 
		
	}

}
