package stepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
		
	WebDriver driver;
	
	//^= atostrophy and  $ make it understandable that it is related to feature file  
	@Given("^user is already on Login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\#$11111\\SeleniumProjectSoftware\\WebdriverSoftware\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
	}
	
	@When("^title of the Login page is Free CRM$")
	public void title_of_the_login_page_is_freeCRM() {
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+ title);
		//Assert.assertEquals is a JUnit validation method
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
	    driver.findElement(By.name("username")).sendKeys("rktestcode");
	    driver.findElement(By.name("password")).sendKeys("rkpasswor");
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		//driver.click wont work some time so we use javascriptExecutor;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String title = driver.getTitle();
		System.out.println("Home page Title :"+ title);
		Assert.assertEquals("CRMPRO", title);
		
	}
	
}
