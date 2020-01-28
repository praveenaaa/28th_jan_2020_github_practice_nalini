package com.selenium_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testng_demo3 {
  @Test(priority=2)
  public void login() { 
	  System.out.println("i m in login method ");
  }
  @Test(priority=1)
  public void sign_up() { 
	  System.out.println("i m in sign_up method  ");
  }
  @Test(priority=3)
  public void add_product_to_the_cart() { 
	  System.out.println("i m in add_product_to_the_cart method  ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i m in  @BeforeMethod ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i m in  @AfterMethod ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i m in @BeforeClass ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i m in  @AfterClass ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i m in  @BeforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i m in @AfterTest ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i m in @BeforeSuite ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i m in @AfterSuite ");
  }

}
