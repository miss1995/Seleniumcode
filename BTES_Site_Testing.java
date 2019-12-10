package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BTES_Site_Testing {
	WebDriver driver;
	int rowNumber,colNumber;
	String Title, expTitle="Top-rated Industrial training institute in Chandigarh & Mohali";
	public void Launch() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 String path = System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver",path);
			 ChromeDriver driver = new ChromeDriver();	
			 driver.get("https://www.btes.co.in/");
			 driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[5]/a[1]")).click();
			 driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[5]/ul/li[5]/a")).click();
			 Title=driver.getTitle();
		       System.out.println("Title of the page is:"+Title);
			 if(Title.equals(expTitle))
		       {
		    	   System.out.println("you are landing on the correct page");
		       }
		       else
		       {
		    	   System.out.println(" you are landing on wrong page");
		       }
		       driver.close();	 
			 }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BTES_Site_Testing oo= new BTES_Site_Testing();
		oo.Launch();
	}

}
