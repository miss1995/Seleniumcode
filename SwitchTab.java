package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab 
{
      	WebDriver driver;
		String path,Title,link;
		public void Launch() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver", path);
			 driver=new ChromeDriver();	
			 driver.get("https://www.google.com/");
			// driver.manage().window().fullscreen();
			 driver.findElement(By.name("q")).sendKeys("hello");
			 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
			 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div[1]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/h3/a/h3/span")).click();
			 //Thread.sleep(1000);
			 String link = "window.open('https://www.edureka.co','_blank');";
			 
		     ((JavascriptExecutor)driver).executeScript(link);	
			// ((JavascriptExecutor)driver).executeScript("window.open()");	
			 @SuppressWarnings("unchecked")
			 ArrayList<String> tabs = (ArrayList<String>) driver.getWindowHandles();
			 driver.switchTo().window(tabs.get(0));
			 //Thread.sleep(200);
			 driver.close();			 
		}			 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SwitchTab oo=new SwitchTab();
		oo.Launch();
	}

}
