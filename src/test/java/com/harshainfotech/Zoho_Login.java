package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoho_Login {
	public static void main( String args[])
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div/div[3]/div/div[4]/div/a[1]")).click();
		driver.findElement(By.id("login_id")).sendKeys("sriaramalla99@gmail.com");
		driver.findElement(By.id("nextbtn")).click();
		driver.findElement(By.id("password")).sendKeys("@harsha1998");
		driver.findElement(By.xpath("//*[@id=\'nextbtn\']/span")).click();
		
		
	}

}
