package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CCSSelectordemo {

	WebDriver driver;
	public void Launch() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 String path = System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver",path);
			 ChromeDriver driver = new ChromeDriver();
			 driver.manage().deleteAllCookies();
			 driver.get("https://www.google.com//");
			// driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("hd pics");
			//  driver.findElement(By.cssSelector("[class^='gL']")).sendKeys("hd pics");
			 driver.findElement(By.cssSelector("input[class$='fi']")).sendKeys("hd pics");
			 driver.findElement(By.cssSelector("input[class$='fi']")).sendKeys(Keys.ENTER);
			// driver.findElement(By.className("gNO89b")).submit();
			 driver.navigate().back();
			 driver.findElement(By.cssSelector("input[class$='fi']")).clear();
			 
		}
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CCSSelectordemo oo=new CCSSelectordemo();
		oo.Launch();
	}

}
