package com.atipune.pomdemo.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testbase {
	
    public static WebDriver driver;
	public static void initDriver() 
	  {
			System.setProperty("webdriver.chrome.driver", "D:\\Coding folder\\POMDEMO\\drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
	  }
}
