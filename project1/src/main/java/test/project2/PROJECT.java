package test.project2;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PROJECT {


	  private ChromeDriver driver;

	@BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This is before method");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\7490\\eclipse-workspace\\project1\\drivers\\chromedriver.exe");
		    driver= new ChromeDriver();  // Opening Chrome browser

		        driver.get("https://www.amazon.com");	

		      //  @Test
		      //  public void f1() throws InterruptedException {
		      	//  System.out.println("This is test1");
		      	//  Thread.sleep(5000);
		        }
		        
		        
		        @Test
		      //  public void f2() throws InterruptedException {
		      	//  System.out.println("This is test2");
		      	//  Thread.sleep(5000);
		        }
		        
		        

		        @AfterMethod
		        public void afterMethod() {
		      	  System.out.println("This is after method");
	PC:\Users\7490\eclipse-workspace\project1\driversse-Workspace\project1\drivers();
		      	  
		      	  
		        }
		     
			      	

		


		  public void shots() throws IOException {	  
		File cap=	  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.Copy(cap, new File("C:\\Users\\7490\\eclipse-workspace\\project1\\drivers\\ABC"));
		  }
		  
		
		
		
		
		
		



		  
		  
		  
		  

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
