package com.harsha.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class FbLoginpage {
 
WebDriver driver;
 
        public FbLoginpage(WebDriver driver){
                 this.driver=driver;
        }
 
//Using FindBy for locating elements
//@FindBy(how=How.XPATH, using="//input[@type='email'][@name='email']") WebElement emailTextBox;
//@FindBy(how=How.XPATH, using="//input[@type='password'][@name='pass']") WebElement passwordTextBox;
//@FindBy(how=How.XPATH, using="//input[@type='submit'][@id='u_0_5']") WebElement signinButton;
        // Defining all the user actions (Methods) that can be performed in the Facebook home page
 
        // This method is to set Email in the email text box
public void setEmail(String strEmail){
WebElement	emailTextBox=driver.findElement(By.id("email"));	
emailTextBox.sendKeys(strEmail);
}
// This method is to set Password in the password text box
public void setPassword(String strPassword){
	WebElement	passwordTextBox=driver.findElement(By.id("pass"));	
passwordTextBox.sendKeys(strPassword);
}
// This method is to click on Login Button
public void clickOnLoginButton(){
	WebElement loginButton = driver.findElement(By.name("login"));
    loginButton.click();
}
}