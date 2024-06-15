package com.harshainfotech;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    

    public static void main(String args[])
    {
      WebDriver  driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
       
        // launch Chrome and redirect it to the URL
       	driver.get("https://demoqa.com/dynamic-properties");
       	driver.manage().window().maximize();
        //This element will appear after 5 secs
	//boolean status=driver.findElement(By.id("visibleAfter")).isEnabled();
	//System.out.println(status);
        //close browser
       	driver.findElement(By.xpath("//*[@id=\"visibleAfter\"]")).click();
        driver.close();
    }
}