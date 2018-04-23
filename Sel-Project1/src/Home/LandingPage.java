package Home;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LandingPage {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	
		
//		System.setProperty("webdriver.chrome.driver", "/Users/bravo1516/eclipse-workspace/Sel-Project1/driver/chromedriver");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/bravo1516/eclipse-workspace/Sel-Project1/driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.geico.com");
		driver.manage().window().maximize();
		
		
		
	
  }
  
  @Test
  public void test1() throws InterruptedException {
	  	driver.findElement(By.id("zip")).sendKeys("19047", Keys.ENTER);
	  	Thread.sleep(5000);
  }
  
  @Test
  public void test2() throws InterruptedException {
	String a=  driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[2]/a")).getText();
	System.out.println(a);
	driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[2]/a")).click();
	Thread.sleep(4000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  	
}
