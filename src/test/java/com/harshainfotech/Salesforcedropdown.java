package com.harshainfotech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforcedropdown {
	public static void main(String srgs[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Try for Free")).click();
		Select ob1=new Select(driver.findElement(By.name("CompanyCountry")));
		List<WebElement> values =ob1.getOptions();
		System.out.println(values.size());
		//driver.findElement(By.name("CompanyCountry")).sendKeys("India")
		for(int i=0;i<values.size();i++)
		{	
			System.out.println(values.get(i).getText());
		}
	
		
		}

}
