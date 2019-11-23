package Day5_TableAutomation_ToolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableAutomation_ToolsQA {

	public static void main(String[] args) throws InterruptedException {  
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		Thread.sleep(5000);
		
		List <WebElement> rows = driver.findElements(By.tagName("tr"));
		
		for(int i=2; i<rows.size()-1;i++) {
			WebElement Str_struct = driver.findElement(By.xpath("//tr["+i+"]//th[@scope='row']"));
			if(Str_struct.getText().contentEquals("Clock Tower Hotel")) {
				
				String strRank = driver.findElement(By.xpath("//tr["+i+"]//th[@scope='row']//following-sibling::td[5]")).getText();
				String city = driver.findElement(By.xpath("//tr["+i+"]//th[@scope='row']//following-sibling::td[2]")).getText();
				System.out.println("Rank --> " + strRank);
				System.out.println("city --> " +city);
				break;
			}
		}	

	}
}