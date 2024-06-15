package com.harshainfotech;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	 public static void main(String[] args) {
	
			  //System.setProperty("webdriver.chrome.driver","./src/resources/chromedriver");
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://demoqa.com/alerts");
			  driver.manage().window().maximize();
			 // This step will result in an alert on screen
			 driver.findElement(By.id("confirmButton")).click();
			  //((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
			  Alert confirmationAlert = driver.switchTo().alert();
			  String alertText = confirmationAlert.getText();
			  System.out.println("Alert text is " + alertText);
			  confirmationAlert.accept();
			 }
		
		   
		  }

