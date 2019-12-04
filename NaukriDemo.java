package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriDemo 
{
	    WebDriver driver;
		String path,Title,url;
		public void Launch() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver", path);
			 driver=new ChromeDriver();	
			 driver.get("https://www.naukri.com/browse-jobs");
			 driver.findElement(By.name("qp")).sendKeys("Java");
			 driver.findElement(By.name("ql")).sendKeys("Chandigarh");
			 driver.findElement(By.xpath("//*[@id=\"exp_dd\"]/div[1]/input[1]")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//*[@id=\"a3\"]")).click();
			 driver.findElement(By.xpath("//*[@id=\"salary_dd\"]/div[1]/input[1]")).click();
			 driver.findElement(By.xpath("//*[@id=\"a12477\"]")).click();
			 Thread.sleep(3000);
			 
			 driver.findElement(By.xpath("//*[@id=\"qsbFormBtn\"]")).click();	
		}
              public static void main(String[] a) throws InterruptedException
              {
            	  NaukriDemo oo=new NaukriDemo();
            	  oo.Launch();
              }

}
