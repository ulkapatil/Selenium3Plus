package mavenprj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class mavendemo2 {
WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ulka.dilip.patil//Downloads//chromedriver_win32_Chrome72//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void getURL()
	{
		System.out.println("Test Case Execution Started");
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		System.out.println("Test Case Execution Completed");
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
	}
}
