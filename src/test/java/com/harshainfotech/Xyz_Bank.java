package com.harshainfotech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xyz_Bank {
	
	public static void main (String args[])
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
		driver.findElement(By.xpath("//*[@ng-click='addCust()']")).click();
				driver.findElement(By.xpath("//*[@ng-model=\"fName\"]")).sendKeys("Sri");
				driver.findElement(By.xpath("//*[@ng-model=\"lName\"]")).sendKeys("Aram");
						driver.findElement(By.xpath("//*[@ng-model=\"postCd\"]")).sendKeys("45345");
						driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();	
	}

}
