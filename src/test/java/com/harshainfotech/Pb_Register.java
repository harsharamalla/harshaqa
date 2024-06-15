package com.harshainfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pb_Register {
	/**
	 * @param args
	 */
	public static void main(String args[])
	{

		ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	/*driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.linkText("Forgot login info?")).click();
	driver.findElement(By.linkText("Register")).click();https://parabank.parasoft.com/parabank/admin.htm
	driver.findElement(By.name("customer.firstName")).sendKeys("Harsha1234");
	driver.findElement(By.id("customer.lastName")).sendKeys("Harsha1235");
	driver.findElement(By.xpath("//*[@id=\'customer.address.street\']")).sendKeys("2525 columbus");
	driver.findElement(By.id("customer.address.city")).sendKeys("cinc");
	driver.findElement(By.id("customer.address.state")).sendKeys("ohio");
	driver.findElement(By.id("customer.address.zipCode")).sendKeys("123456");
	driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
	driver.findElement(By.id("customer.ssn")).sendKeys("123245678");
	driver.findElement(By.id("customer.username")).sendKeys("harsha123456");
	driver.findElement(By.id("customer.password")).sendKeys("@harsha123456");
	driver.findElement(By.id("repeatedPassword")).sendKeys("@harsha123456");*/
	driver.findElement(By.linkText("Admin Page")).click();
	WebElement btn1=driver.findElement(By.id("accessMode1"));
	boolean value=btn1.isDisplayed();
	System.out.println(value);
	boolean value1=btn1.isEnabled();
	System.out.println(value1);
	btn1.click();
	boolean value2=btn1.isSelected();
	System.out.println(value2);
	

	//driver.close();

}
}