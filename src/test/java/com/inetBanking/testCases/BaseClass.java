package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
 public String baseURl="https://demo.guru99.com/V4/index.php";
 public String username="mngr429884";
 public String password="adEqEnE";
 public static WebDriver driver;
 
 
 @BeforeClass 
 public void setup()
 {
	 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	 driver =new ChromeDriver();
 }
 
 
 @AfterClass 
 public void tearDown()
 {
	 driver.quit();
 }
 
}
