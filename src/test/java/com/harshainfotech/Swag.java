package com.harshainfotech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {
	public static void main (String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	
		driver.findElement(By.xpath("//*[@id='inventory_container']/div/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@fill='currentColor']")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver.findElement(By.id("first-name")).sendKeys("harsha");
		driver.findElement(By.id("last-name")).sendKeys("aram");
		driver.findElement(By.id("postal-code")).sendKeys("43235");
		driver.findElement(By.xpath("//*[@class='btn_primary cart_button']")).click();
				driver.findElement(By.xpath("//*[@class='btn_action cart_button']")).click();
				driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
				driver.findElement(By.id("logout_sidebar_link")).click();
		
	}

}
