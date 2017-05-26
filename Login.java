package AutomatedTesting;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	

	WebDriver driver;
	
	By userHeader = By.xpath("//*[@id=\"page-container\"]/div[1]/div[1]/div/div[1]/div/a");
	By postLoginButton = By.xpath("//*[@id=\"page-container\"]/div/div[1]/h1");
	 //Logging in to twitter
	 public void loggingIn(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			//get on to twitter
			driver.get("https://twitter.com/");
			//log in
			//click on login button
					driver.findElement(By.xpath("//*[@id=\"doc\"]/div[1]/div/div[1]/div[2]/a[3]")).click();
					//entering username and password
					String username = "@Ichigozeref";
					String password = "Abc123";
					driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys(username);
					driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys(password);
					driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/input[1]")).click();
//					driver.findElement(By.xpath("//*[@id=\"signin-link\"]/span[1]")).click();
			}
	 
	 //Logging in and then logging out
	 public void loggingOut(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			//get on to twitter
			driver.get("https://twitter.com/");
			//log in
			//click on login button
					driver.findElement(By.xpath("//*[@id=\"doc\"]/div[1]/div/div[1]/div[2]/a[3]")).click();
					//entering username and password
					String username = "@hassanabbas95";
					String password = "hassan95";
					driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys(username);
					driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys(password);
					driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/input[1]")).click();
			//logging out
			driver.findElement(By.xpath("//*[@id=\"user-dropdown-toggle\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"signout-button\"]/button")).click();
			
	 }
	 

	
	 public Login(WebDriver driver){
		 this.driver = driver; 
		 }
	
	 public String getUserHeaderText(){
		 return driver.findElement(userHeader).getText();
		 }
	 
 	 public String getPostLoginButtonText(){
		 System.out.println("test");
 		 return driver.findElement(postLoginButton).getText();
		 
	 }
 	 
 	 public void waitabit(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
