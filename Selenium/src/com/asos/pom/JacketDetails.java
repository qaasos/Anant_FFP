package com.asos.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JacketDetails {
	public WebDriver driver;
	public WebDriverWait wait;	
	
	public  JacketDetails(WebDriver driver){
		
		this.driver = driver;
		
		
	}

	public void ClickonAddTocart(){
		
		driver.findElement(By.xpath("//*[@id='product-2004']/div[1]/div[2]/form/button")).click();
	}
	
	public void ClickOnViewCart(){
		
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div[1]/a")).click();
	}
	
	public void ClickOnProceedToCheckOut(){
		
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/a")).click();
		
	}
	
	
	
}
