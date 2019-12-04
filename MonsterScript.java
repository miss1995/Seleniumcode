package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterScript {
	
	WebDriver driver;
	String path;
	
	public void search() throws InterruptedException
	{
		 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("https://my.monsterindia.com/find-companies.html");
		 driver.manage().window().maximize();
	//	 Thread.sleep(4000);
		 driver.findElement(By.id("fts_header")).sendKeys("java");
		 driver.findElement(By.xpath("//*[@id=\"exp_header\"]")).sendKeys("2");
		 driver.findElement(By.id("lmy_header")).sendKeys("Mohali");
		 //driver.findElement(By.className("btn")).click();
	//	 driver.findElement(By.name("lmy")).sendKeys("indore");
		 driver.findElement(By.name("submit")).click();
		 System.out.println("ok");
		// driver.close();
	}
	

	public static void main(String[] args)throws InterruptedException {
		MonsterScript ns= new MonsterScript();
		ns.search();
	}
}
