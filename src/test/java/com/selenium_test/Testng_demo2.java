package com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo2 {
WebDriver driver;

@BeforeTest
public void launch_browser(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
}

@AfterTest

public void close_browser(){
	driver.close();
	
	
}

@Test 
public void frame_handling() throws Exception{
	
	driver.switchTo().frame("login_page");
	 driver.findElement(By.name("fldLoginUserId")).sendKeys("444378");
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("footer");
	 driver.findElement(By.linkText("Privacy Policy")).click();
	 driver.switchTo().defaultContent();
	 Thread.sleep(3000);
	 driver.switchTo().frame("login_page");
	 
	 driver.findElement(By.xpath("//*[@alt='continue']")).click();
	 //driver.findElement(By.xpath("//img[@alt='continue']")).click();
	 Thread.sleep(3000);
		driver.findElement(By.name("fldPassword")).sendKeys("abcd");
	
	
}

}
