package com.qa.fifa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	
	
	@Test

	public  void validateSearch(){
		
   WebDriverManager.chromedriver().setup();
  
   WebDriver driver = new ChromeDriver();        //object of chromedriver class
		   
		   
   

	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("Fifa worldcup 2022");  //SearchBox
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);  //trigger the search
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
