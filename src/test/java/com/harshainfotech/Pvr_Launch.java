package com.harshainfotech;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Pvr_Launch {
	ChromeDriver driver;
	public static void main(String args[])
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://pvrcinemas.com");
		driver.manage().window().maximize();
	
	
	
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/div/ul/li[10]/div/div/div")).click();
	
    
    	driver.close();
   
}
}