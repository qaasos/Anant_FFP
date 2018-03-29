package com.asos.practice;

import java.util.ArrayList;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Student {
	
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		options.addArguments("disable-infobars");
		
	WebDriver driver = new ChromeDriver(options);
	WebDriverWait Wait =new WebDriverWait(driver,120);
	
	driver.manage().window().maximize();
	driver.get("https://onecognizant.cognizant.com");
	
	
	Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtPlatformBarSearch")));			
 driver.findElement(By.id("txtPlatformBarSearch")).sendKeys("mypay");

	
    driver.findElement(By.id("btnsearch")).click();
   // driver.findElement(By.xpath("//*[@id='desktopsearchresult']/ul/li[1]/div[2]/p")).click();
		
	  
	    

	   	ArrayList<String> a1= new ArrayList<String>();
	a1.add("Ram");
	a1.add("Vinay");
	a1.add("Anant");
	a1.add("Ravi");
	
	
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	
	a2.add(10);
	a2.add(20);
	a2.add(2,30);
	System.out.println("Name of student :" +a1);
	System.out.println("Marks of student :" +a2);
	
	
	
	}
	

}
