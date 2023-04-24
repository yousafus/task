package test.project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public static WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\7490\\eclipse-workspace\\project1\\drivers\\chromedriver.exe");
	    driver= new ChromeDriver();  // Opening Chrome browser

	        driver.get("https://www.amazon.com");	
	      
  }
  
  
  @Test
  public void f1() throws InterruptedException {
	  System.out.println("This is test1");
	  Thread.sleep(5000);
  }
  
  
  @Test
  public void f2() throws InterruptedException {
	  System.out.println("This is test2");
	  Thread.sleep(5000);
  }
  
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
	  driver.close();
  }

}
