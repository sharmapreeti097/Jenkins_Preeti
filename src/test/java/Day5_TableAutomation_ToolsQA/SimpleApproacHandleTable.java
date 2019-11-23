package Day5_TableAutomation_ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleApproacHandleTable {
	
	public String getRankFromTable(String Structure) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		Thread.sleep(5000);
	//	String Structure = "Financial Center";

		String strRank = driver.findElement(By.xpath("//th[text()='" + Structure + "']//following-sibling::td[5]")).getText();
		System.out.println(strRank);

		
		Thread.sleep(5000);

		driver.quit();
		
		return strRank;
	}

	public static void main(String[] args) throws InterruptedException {
		
		SimpleApproacHandleTable obj = new SimpleApproacHandleTable();
		
		String strraking = obj.getRankFromTable("Financial Center");
		
		//String strraking = "2";
		
		//int result =  Integer.parseInt(strraking);
		
		//int x =2;
		
		//System.out.println(result + x);
		
	}

}
