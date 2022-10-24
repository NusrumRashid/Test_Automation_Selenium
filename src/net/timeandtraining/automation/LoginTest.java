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
		
	 driver.findElement(By.id("email")).sendKeys("test@timeandtraining.net");
		
	 driver.findElement(By.id("passwd")).sendKeys("test123456");
	 
	 driver.findElement(By.id("SubmitLogin")).click();
	}

}
