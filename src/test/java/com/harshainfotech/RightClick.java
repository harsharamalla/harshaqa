package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {
	public static void main(String[] args) {
		
		 
		  /* WebDriver driver = new ChromeDriver();

		
		   driver.get("https://demoqa.com/buttons");
		   System.out.println("demoqa webpage displayed");
			
		  
		   driver.manage().window().maximize();
			 
		 
		   Actions actions = new Actions(driver);
			 
		   
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
		   actions.contextClick(btnElement).perform();

		   WebElement btnElement1 = driver.findElement(By.className("btn btn-primary"));
		   actions.click(btnElement1).perform();
		   System.out.println("Right click Context Menu displayed");*/
			 
		   
		   
		   WebDriver driver = new ChromeDriver();
          
driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
      
driver.manage().window().maximize();
          
Actions action = new Actions(driver);
By locator = By.cssSelector(".context-menu-one");
           
           WebDriverWait wait = new WebDriverWait(driver, 5);
           wait.until(ExpectedConditions.presenceOfElementLocated(locator));
           WebElement rightClickElement=driver.findElement(locator);
           //contextClick() method to do right click on the element
           action.contextClick(rightClickElement).build().perform();
           WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
           //getText() method to get the text value
           String GetText = getCopyText.getText();
           //To print the value
           System.out.println(GetText);
           //To close the browser
           //driver.close();


		  

		 
		}
		}

