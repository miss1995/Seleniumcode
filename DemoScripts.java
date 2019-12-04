package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoScripts {
	WebDriver driver;
	String path,Title,url;
	public void Launch() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
		 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("http://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("firstName")).sendKeys("admin");
		 driver.findElement(By.name("lastName")).sendKeys("ghai");
		 driver.findElement(By.name("phone")).sendKeys("08284047818");
		 driver.findElement(By.name("userName")).sendKeys("manishaghai95@gmail.com");
		 driver.findElement(By.name("address1")).sendKeys("Sector 67");
		 driver.findElement(By.name("city")).sendKeys("mohali");
		 driver.findElement(By.name("state")).sendKeys("Punjab");
		 driver.findElement(By.name("postalCode")).sendKeys("140126");
		 Select slt=new Select(driver.findElement(By.name("country")));
		 slt.selectByValue("ALGERIA");
		// driver.findElement(By("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")).sendKeys("2");
		 driver.findElement(By.name("email")).sendKeys("admin");
		 driver.findElement(By.name("password")).sendKeys("admin");
		 driver.findElement(By.name("password")).sendKeys("admin");
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoScripts oo=new DemoScripts();
		oo.Launch();
	}

}
