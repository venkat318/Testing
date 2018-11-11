package com.TCmovies.com.TCmovies;


import com.TCmovies.com.TCmovies.Config;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AppTest extends Base{
	
	//Page Factory
	@FindBy(xpath = "//a[text()='To Have and Have Not (1944)']")
	WebElement movieLink1;
	
	@FindBy(xpath ="//div[@id ='movieSearchList']//a[contains(text(),'Fallen Angel (1945)')]" )
	WebElement movieLink2;
	
	@FindBy(xpath ="//a[text()='Rome Adventure (1962)']")
	WebElement movieLink3;
	
	@FindBy(xpath ="//a[text()='The Secret Garden (1949)']")
	WebElement movieLink4;
	
	@FindBy(xpath ="//a[text()='Caged (1950)']")
	WebElement movieLink5;
	
	public AppTest() {
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public String getMovieTitle1() {
		
		return driver.getTitle();
	}
	
	@Test 
	public void validateOverview() {
		
	}
		movieLink2.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Home page Title :"+ title);
		Assert.assertEquals("TCM Movie Database", title);
		//A skipper-for-hire's romance with a beautiful drifter is complicated by his growing involvement with the French resistance
	}
	
	@DataProvider
	public void fiveMovies()
	{
		
	}
	
	
}
