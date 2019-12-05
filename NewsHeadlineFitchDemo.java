package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsHeadlineFitchDemo {

	WebDriver driver;
	public void Launch() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 String path = System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver" ,path);
			 ChromeDriver driver = new ChromeDriver();
			 driver.get("https://www.bbc.com/");
			 ArrayList<WebElement> al=(ArrayList<WebElement>)driver.findElements(By.className("block-link__overlay-link"));
			 System.out.println(al.size());
			 for(int i=0;i<al.size();i++)
			 {
				 //System.out.println(al.get(i).getAttribute());
				 System.out.println(al.get(i).getText());
			 }
		}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NewsHeadlineFitchDemo oo=new NewsHeadlineFitchDemo();
		oo.Launch();
	}

}
