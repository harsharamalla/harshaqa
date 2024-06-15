package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Ops
{
public static void main(String[] args) 
{
	
	//FirefoxDriver driver=new FirefoxDriver();
	
	//System.setProperty("webdriver.chrome.driver","E:\\VIVEK_SELENIUM\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver","E:\\VIVEK_SELENIUM\\chromedriver.exe");
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();

	driver.get("https://google.com");
	driver.manage().window().maximize();
	String url=driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
//System.out.println(driver.getPageSource());
	driver.navigate().to("http://facebook.com");
	System.out.println("suuccessfully navigated to other page");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.close();
		
	}
}