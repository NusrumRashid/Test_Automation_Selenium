package net.timeandtraining.automation;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

import org.junit.Test;


public class SearchFeatureTests {
	
	@Test
	public void searchProductBykeyword() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("http://automationpractice.com");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Printed Dress");
		
		driver.findElement(By.name("submit_search")).click();
		
	    int total_num_img = driver.findElements(By.xpath("//img[@itemprop='image']")).size();
	    
	    Assert.assertEquals(5, total_num_img);
	    
	    driver.quit();
		
		
		
	}
	

}
