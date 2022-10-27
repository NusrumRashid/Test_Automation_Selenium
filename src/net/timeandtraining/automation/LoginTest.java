package net.timeandtraining.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) {

		WebDriver driver=Base.getDriver();
		
		driver.get("http://automationpractice.com");
		
		WebElement element =driver.findElement(By.className("login"));
		
		element.click();
		
	 driver.findElement(By.id("email")).sendKeys("rashidnusrum@gmail.com");
		
	 driver.findElement(By.id("passwd")).sendKeys("123456789");
	 
	 driver.findElement(By.id("SubmitLogin")).click();
	 
	// WebElement signout_button = driver.findElement(By.className("logout"));
	 WebElement page_header = driver.findElement(By.className("page-heading"));
	 
	// String signout_button_text = signout_button.getText();
	 String page_header_text = page_header.getText();
	 
	 
	 //System.out.println(signout_button_text);
	 //System.out.println(page_header_text);
	 
	 if(page_header_text.equals("MY ACCOUNT"
)) {System.out.println("Login test is Passed");
}else {
	System.out.println("Login test is Failed");
	
	
};

	
	}
	

}
