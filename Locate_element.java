package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_element 
{
	WebDriver driver;
	String path,Title,url,expTitle="google";
	public void Launch() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
		 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		// Thread.sleep(4000);
		// driver.findElement(By.id("login1")).sendKeys("admin");
		// driver.findElement(By.id("password")).sendKeys("admin");
		 //driver.findElement(By.name("proceed")).click();
		// driver.findElement(By.xpath("//[@id=\"user-name\"]")).sendKeys("standard_user");
		// driver.findElement(By.xpath("//[@id=\"password\"]")).sendKeys("secret_sauce");
		// driver.findElement(By.className("btn_action")).click();
		  // driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  // driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  
		   driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]")).click();
		   driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg")).click();
			  
		   driver.close();	
      }
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Locate_element oo=new Locate_element();
		oo.Launch();
	}

}
