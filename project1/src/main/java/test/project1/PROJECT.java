package test.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PROJECT {

	static WebDriver driver;

	@FindBy(xpath="//*[@id='email']") WebElement email_filed;
	@FindBy(xpath="//*[@id='pass']") WebElement pass_filed;
	@FindBy(xpath="//*[@name='login']") WebElement login_button;
	
	
	
	
	public PROJECT(WebDriver driver) {
	PROJECT.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public void email_field_function1() {
		email_filed.sendKeys("abc@yahoo.com");
		
		
	}
	
	public void pass_field_function1() {
		pass_filed.sendKeys("absdefgh");
	}
	public void login_button_function1() {
		login_button.click();
	}


	public void email_field_function() {
		email_filed.sendKeys("abc@yahoo.com");
		
		
	}
	
	public void pass_field_function11() {
		pass_filed.sendKeys("absdefgh");
	}
	public void login_button_function11() {
		login_button.click();
	}
	
	

	email_filed.sendKeys("abc@yahoo.com");
	
	
}

public void pass_field_function() {
	pass_filed.sendKeys("absdefgh");
}
public void login_button_function() {
	login_button.click();
}
}
