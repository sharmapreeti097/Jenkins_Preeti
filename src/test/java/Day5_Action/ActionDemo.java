package Day5_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rightstartmath.com/");
		Thread.sleep(5000);
		
		WebElement eleCur=driver.findElement(By.xpath("//a[text()='Curriculum']"));
		WebElement eleResearch=driver.findElement(By.xpath("//*[@id=\"menu-item-80\"]/a"));
		Actions act = new Actions(driver);
		
		act.moveToElement(eleCur).build().perform();
		
		Thread.sleep(5000);
		
		//act.moveToElement(eleResearch).build().perform();
		
		eleResearch.click();
		
		//act.click(eleResearch).build().perform();
		
	}

}
