package com.atipune.pomdemo.tests;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atipune.pomdemo.pages.HomePage;

public class HomePageTests extends Testbase{
	
	HomePage homepage;
	
	
	@BeforeClass
	public void setup() 
	{
		initDriver();
		homepage=new HomePage(driver);
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyHomePageTitle() {
	  String expectedTitle="Automation Practice Site";
	  String actualTitle=homepage.getPageTittle();
	 Assert.assertEquals(actualTitle, expectedTitle);
 	}
	
	@Test
	public void verifyNewArrivalsDisplayed() {
		boolean arrivalsActual=homepage.newarrivalIsDisplayed();
		Assert.assertTrue(arrivalsActual);
 	}
	@Test
	public void verifyNewArrivalsEnabled() {
		boolean arrivalsActual=homepage.newarrivalIsEnabled();
		Assert.assertTrue(arrivalsActual);
 	}
	
	@Test
	public void verifyFirstBookTitle() {
		String expectedTitleBook="Selenium ";
		String actualTitleBook=homepage.getElementText();
		Assert.assertEquals(actualTitleBook,expectedTitleBook);
 	}
	
	
	@AfterClass
	public void tearDown() 
	{
		
		driver.close();
	}
	
}
