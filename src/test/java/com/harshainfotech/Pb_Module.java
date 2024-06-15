package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//parabank login
public class Pb_Module {
	public static void main(String args[])
	{

		ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("harsha123456");
	driver.findElement(By.name("password")).sendKeys("@harsha123456");
	driver.findElement(By.xpath("//*[@id=\'loginPanel\']/form/div[3]/input")).click();
	driver.findElement(By.linkText("Accounts Overview")).click();
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[3]")).getText());
	driver.findElement(By.linkText("Request Loan")).click();
	driver.findElement(By.id("amount")).sendKeys("1000");
	driver.findElement(By.id("downPayment")).sendKeys("100");
	driver.findElement(By.xpath("//*[@id=\'rightPanel\']/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
	driver.findElement(By.linkText("Accounts Overview")).click();
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[3]")).getText());
	//System.out.println(balance);
	driver.findElement(By.linkText("Log Out")).click();
	//driver.findElement(By.className("button")).click();
			
	}}