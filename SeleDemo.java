package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleDemo {
WebDriver driver;
String path,Title,url,expTitle="google";
public void Launch()
{
	//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
	 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
	 System.out.println(path);
	 System.setProperty("webdriver.chrome.driver", path);
	 driver=new ChromeDriver();	
	 driver.get("https://www.google.com/");
	 
	   driver.navigate().to("https:www.google.com");
	   driver.navigate().back();
	   Title=driver.getTitle();
       System.out.println("Title of the page is:"+Title);
       url=driver.getCurrentUrl();
       System.out.println("Url of the page is "+url);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SeleDemo oo=new SeleDemo();
         oo.Launch();
	}

}
