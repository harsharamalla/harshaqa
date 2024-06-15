package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo2 {
	
	WebDriver driver;

	@BeforeTest
	void openssite()
	{

	    driver=new ChromeDriver();
		driver.get("https://www.zoho.com/signup.html");
		driver.manage().window().maximize();
	}
	@Test
	void registration()
	{
		
		driver.findElement(By.id("email")).sendKeys("sriaramalla99@gmail.com");
		driver.findElement(By.id("password")).sendKeys("@harsha1998");
		driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div[5]/select")).sendKeys("Ohio");
		driver.findElement(By.id("signup-termservice")).click();
		driver.findElement(By.id("signupbtn")).click();
	}
	@AfterTest
	void m3()
	{
		driver.close();
	}
	}
	