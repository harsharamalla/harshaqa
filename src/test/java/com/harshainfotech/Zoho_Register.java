package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoho_Register {
	public static void main (String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoho.com/signup.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sriaramalla99@gmail.com");
		driver.findElement(By.id("password")).sendKeys("@harsha1998");
		driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div[5]/select")).sendKeys("Ohio");
		driver.findElement(By.id("signup-termservice")).click();
		driver.findElement(By.id("signupbtn")).click();
	}

}
