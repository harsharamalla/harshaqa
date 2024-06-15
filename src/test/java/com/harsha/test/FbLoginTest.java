package com.harsha.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.harsha.pages.FbHomepage;

import com.harsha.pages.FbLoginpage;
 
public class FbLoginTest {
	static WebDriver driver;
public static void main(String args[]){
	driver = new ChromeDriver();

    driver.manage().window().maximize();

 
driver.get("https://www.facebook.com");
FbLoginpage loginpage = PageFactory.initElements(driver, FbLoginpage.class);
loginpage.setEmail("sachin@gmail.com");
loginpage.setPassword("sachin@999");
loginpage.clickOnLoginButton();
FbHomepage homepage = PageFactory.initElements(driver, FbHomepage.class);
homepage.clickOnProfileDropdown();
homepage.verifyLoggedInUserNameText();
homepage.clickOnLogoutLink();
}
}