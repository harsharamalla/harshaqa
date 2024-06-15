package com.harshainfotech;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown3 {
	

    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/flight-booking/goair-airlines.html");
        driver.manage().window().maximize() ;
        
        WebElement ob3=driver.findElement(By.className("trip_type"));
        
        List<WebElement> dropdown=ob3.findElements(By.tagName("option"));
        
        System.out.println(dropdown.size());
        
        for(int i=0;i<dropdown.size();i++)
        {
        	System.out.println(dropdown.get(i).getText());
        }
        
        
        
    }}
        