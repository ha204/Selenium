package phpr;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HomePagePHP {
	 WebDriver driver;
	 By homeText = By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/div[1]/div/span[1]");
//	 By loginButton = By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a/span");
	 
	 public void loadHomePage(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			//get on to twitter
			driver.get("http://phptravels.com/demo/");
			System.out.println(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/div[1]/div/span[1]")).getText());
	 }
	 
	 public HomePagePHP (WebDriver driver){
			this.driver = driver;
			}
		public String getHomeText(){
			return driver.findElement(homeText).getText();
		}
		
	 public void navLogin(){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		 	//old	
		 	driver = new ChromeDriver();
			driver.get("http://phptravels.com/demo/");
			
			//new
			driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a/small")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
			
	 }
	 
	 
}
