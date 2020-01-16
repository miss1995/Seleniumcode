package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDriven
{
	public static WebDriver driver;
	String path;
	
	@Given("^Go to the web page$")
	public void go_to_the_web_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("^user Enter Loaded \"(.*)\" and \"(.*)\"$")
	public void user_Enter_Loaded_username_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    driver.findElement(By.id("txtUsername")).sendKeys(string); 
	    driver.findElement(By.id("txtPassword")).sendKeys(string2); 
	   
	    
	}

	@Then("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    driver.findElement(By.id("btnLogin")).click();
	}



}
