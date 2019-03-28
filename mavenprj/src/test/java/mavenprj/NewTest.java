package mavenprj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws AWTException {
	  driver.findElement(By.xpath("//a[text()='word clock.xlsm']")).click();
	  Robot robot=new Robot();
	  
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C://Users//ulka.dilip.patil//Downloads//chromedriver_win32_Chrome72//chromedriver.exe");
	  driver=new ChromeDriver();
	 // driver=new FirefoxDriver();
	  driver.get("http://spreadsheetpage.com/index.php/file/word_clock/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
