package com.harsha.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 
public class TestBase {
public static WebDriver driver = null;

public static void main(String args[]){

driver = new ChromeDriver();

                driver.manage().window().maximize();
     
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                driver.get("https://www.facebook.com");

driver.close();


    }
 
}