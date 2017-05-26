package AutomatedTesting;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	 WebDriver driver;
	 By loginButton = By.xpath("//*[@id=\"doc\"]/div[1]/div/div[1]/div[2]/a[3]");

//	public static void main(String[] args){
		
	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
//		driver = new ChromeDriver();
//		//get on to twitter
//		driver.get("https://twitter.com/");
		
	 public void loadHomePage(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			//get on to twitter
			driver.get("https://twitter.com/");
			
	 }
		
		public HomePage (WebDriver driver){
			this.driver = driver;
			}
		public String getLoginButton(){
			return driver.findElement(loginButton).getText();
		}
		
//		//click on login button
//		driver.findElement(By.xpath("//*[@id=\"doc\"]/div[1]/div/div[1]/div[2]/a[3]")).click();
//		//entering username and password
//		String username = "@hassanabbas95";
//		String password = "hassan95";
//		driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys(username);
//		driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys(password);
//		driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/input[1]")).click();
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[1]/div[1]/div/div[1]/div/a")).getText());
//		//logging out
//		driver.findElement(By.xpath("//*[@id=\"user-dropdown-toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"signout-button\"]/button")).click();
		
//		boolean result = true;
//		
//		try{
//			driver.findElement(By.name("q"));
//		}
//		catch(NoSuchElementException e){
//			System.out.println(e);
//			result = false;
//		}
//		finally {
//			driver.close();
//		}
//		
//		if(result)
//			System.out.println("---passed---");
//		else
//			System.out.println("---failed---");
//	}
			
}