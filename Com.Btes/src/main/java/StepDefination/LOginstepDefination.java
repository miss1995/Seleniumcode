package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class LOginstepDefination 
{
	public static WebDriver driver;
	String path;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password()  {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		    driver.findElement(By.id("btnLogin")).click();
		    
	}

	@Then("^user will redirect to home page$")
	public void user_will_redirect_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}

}
