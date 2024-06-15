package com.harshainfotech;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zoho_Launch {
	public static void main(String args[]) {
		
		
		
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("https://www.zoho.com/signup.html/");
	driver.manage().window().maximize();
	//driver.close();
}
}