package com.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo1 {
WebDriver driver;
@Test(priority=3,enabled=true)
public void facebook(){
	System.out.println("i want to use facebook today on 28th jan  ");
	
}

@Test(priority=2,enabled=true)
public void google(){
	System.out.println("i want to use google today  ");
	
	
}

@Test(priority=1,enabled=true)
public void gmail(){
	
	System.out.println("i want to use gmail ");
	
	
}

@BeforeTest
public void launch_browser(){
	
	System.out.println("i want to launch google chrome browser ");
	System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
}

@AfterTest 
public void close_browser(){
	System.out.println("i want to close chrome browser  ");
	
	
}	
}
