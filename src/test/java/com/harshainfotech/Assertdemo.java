package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Assertdemo {
	
	ChromeDriver driver;
	@BeforeTest
	public void gmaillaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize()	;
		}
	
	@Test(priority=1)
	public void asserthard() {
        String title2 = "Gmail";
        Assert.assertEquals(driver.getTitle(), title2);
        System.out.println("level1");
        String title = "Gmaile";
        Assert.assertEquals(driver.getTitle(), title);
        System.out.println("level2");
	}
	
	

	@Test(priority=2)
	public void assertsoft()
	{
		SoftAssert softAssertion=new SoftAssert();
		
		String title4 = "Gmail";
		softAssertion.assertEquals(driver.getTitle(), title4);
		System.out.println("level3");
		String title5 = "Gmaile";
		softAssertion.assertEquals(driver.getTitle(), title5);
		System.out.println("level4");
		
	}
	
	@AfterTest
		public void close()
		{
			driver.close();
	
	}
}


