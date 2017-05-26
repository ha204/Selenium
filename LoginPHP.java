package phpr;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPHP {
	WebDriver driver;
	By userWelcome = By.xpath("/html/body/div[3]/div[1]/div/div[1]/h3");
	
	 public void waitabit(){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://phptravels.com/demo/");
		
		String originalwindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a/small")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows){
			if(!window.equalsIgnoreCase(originalwindow)){
				driver.switchTo().window(window);
			}
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		
		Set<String> windows1 = driver.getWindowHandles();
		for(String window : windows1){
			if(!window.equalsIgnoreCase(originalwindow)){
				driver.switchTo().window(window);
			}
		}
		
		String username = "user@phptravels.com";
		String password = "demouser";
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[4]/div/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[4]/div/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[4]/button")).click();
		waitabit();
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/div[1]/div[1]")).getText());

		}
	
	 public LoginPHP(WebDriver driver){
		 this.driver = driver; 
		 }
	
	 public String getUserWelcomeText(){
		 return driver.findElement(userWelcome).getText();
		 }
	
	
}
