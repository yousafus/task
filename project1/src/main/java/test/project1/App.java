package test.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
    public static void main( String[] args )
    {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\7490\\eclipse-workspace\\project1\\drivers\\chromedriver.exe");
    	    driver= new ChromeDriver();  // Opening chrome browser

    	        driver.get("https://www.amazon.com");
    	        driver.manage().window().maximize();

    }
}
