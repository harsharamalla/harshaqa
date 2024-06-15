package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGParabank {
	ChromeDriver driver;
	@BeforeTest
	public void parabanklaunch()
	{

		 driver=new ChromeDriver();
		
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority=1)
	public void registration()
	{

		driver.findElement(By.name("customer.firstName")).sendKeys("Harsha1234");
		driver.findElement(By.id("customer.lastName")).sendKeys("Harsha1235");
		driver.findElement(By.xpath("//*[@id=\'customer.address.street\']")).sendKeys("2525 columbus");
		driver.findElement(By.id("customer.address.city")).sendKeys("cinc");
		driver.findElement(By.id("customer.address.state")).sendKeys("ohio");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("123456");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("customer.ssn")).sendKeys("123245678");
		driver.findElement(By.id("customer.username")).sendKeys("harsha1234567");
		driver.findElement(By.id("customer.password")).sendKeys("@harsha1234567");
		driver.findElement(By.id("repeatedPassword")).sendKeys("@harsha1234567");
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
	}
	@Test(priority=2)
	public void login()
	{
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("harsha1234567");
		driver.findElement(By.name("password")).sendKeys("@harsha1234567");
		driver.findElement(By.xpath("//*[@id=\'loginPanel\']/form/div[3]/input")).click();
	}
		@Test(priority=3)
		public void logout()
		{
			driver.findElement(By.linkText("Log Out")).click();
			System.out.println("loggedout");
	}@AfterTest
		public void parabankclose()
		{
			driver.close();
	
	}
}

     


