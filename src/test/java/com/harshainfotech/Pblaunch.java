package com.harshainfotech;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pblaunch {
	public static void main(String args[])
	{
	//logic
		ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	//driver.close();

}
}