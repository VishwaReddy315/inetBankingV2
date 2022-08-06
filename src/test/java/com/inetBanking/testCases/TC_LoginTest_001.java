package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
public void loginTest() throws InterruptedException
{
		driver.get(baseURl);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		if(driver.getTitle().equals("Welcome To Manager's Page of Guru99 Bank"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
}
}
 