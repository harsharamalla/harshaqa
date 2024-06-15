package com.harshainfotech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main (String args[])
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
		
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(From, To).build().perform();
		
		String textTo = To.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	}

}
