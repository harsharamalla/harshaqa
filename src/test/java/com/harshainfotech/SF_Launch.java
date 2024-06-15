package com.harshainfotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SF_Launch {
	
	public static void main(String args[]) {
		
	
	
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	//driver.close();
}
}