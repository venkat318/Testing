package com.TCmovies.com.TCmovies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.util.Util;

public class Base {
	
	public static WebDriver driver;
	static Properties prop;
	
	public Base() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/com.TCmovies/src/main/java/com/TCmovies/com/TCmovies/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\#$11111\\SeleniumProjectSoftware\\MicrosoftWebDriver");
			 driver = new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\#$11111\\SeleniumProjectSoftware\\chromedriver");
			 driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
