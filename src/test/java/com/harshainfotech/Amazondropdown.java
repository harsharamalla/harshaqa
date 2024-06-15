package com.harshainfotech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazondropdown {
	public static void main(String args[]) {
		
	
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		//driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
	}
*/
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{	
			System.out.println(dropdown.get(i).getText());
		}
		//driver.close();
	}
}

