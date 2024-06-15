package com.harshainfotech;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 
public class Doubleclick {

	public static void main(String args[]) throws InterruptedException{
	
		WebDriver driver = new ChromeDriver();
		               
		driver.get("http://api.jquery.com/dblclick/");
		            
		                driver.manage().window().maximize();
		                
		driver.switchTo().frame(0);
		               
		Actions action = new Actions(driver);
	
		WebElement ele = driver.findElement(By.cssSelector("html>body>div"));
		                
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
		              
		action.doubleClick(ele).perform();
		              
		}
		}