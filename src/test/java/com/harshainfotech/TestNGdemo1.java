package com.harshainfotech;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGdemo1 {

	@BeforeTest
	void m1()
	{
		System.out.println("This Will Execute First");
	}
	@Test
	void m2()
	{
		System.out.println("This Will Execute Second");
	}
	@AfterTest
	void m3()
	{
		System.out.println("This Will Execute Last");
	}
}
