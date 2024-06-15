package com.harshainfotech;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Launch {

	public static void main(String args[]) {
		
	
	
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	//driver.close();
}
}


