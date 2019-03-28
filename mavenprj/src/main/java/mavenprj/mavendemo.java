package mavenprj;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class mavendemo {
WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ulka.dilip.patil//Downloads//chromedriver_win32_Chrome72//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void getDemoWebShopURL() throws InterruptedException
	{
		System.out.println("Test Case Execution Started");
		driver.get("http://demowebshop.tricentis.com/");
		
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie item:cookies)
		{
			System.out.println("Name:"+item.getName());
			System.out.println("Domain:"+item.getDomain());
			System.out.println("Path:"+item.getPath());
			System.out.println("Value:"+item.getValue());
		}
			
		WebElement drag=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(drag).sendKeys("computer").build().perform();
		Thread.sleep(2000);
		act.moveToElement(drag).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
		System.out.println("Test Case Execution Completed");
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
	}
}
