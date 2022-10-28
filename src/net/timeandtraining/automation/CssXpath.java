package net.timeandtraining.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssXpath {

	public static void main(String[] args) {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("http://automationpractice.com");
        driver.findElement(By.className("login")).click();
		
		
		
	 driver.findElement(By.id("email")).sendKeys("rashidnusrum@gmail.com");
		
	 driver.findElement(By.id("passwd")).sendKeys("123456789");
	 
	 driver.findElement(By.id("SubmitLogin")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
	 
	 driver.findElement(By.cssSelector("a[href^=\"http://automationpractice.com/index.php?controller=contact\"]")).click();
		
		
		
		
	}

}
