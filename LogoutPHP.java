package phpr;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPHP {
	WebDriver driver;
	
	public void logout(){

		
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
		
		//new
		
		driver.findElement(By.xpath("//*[@id=\"bookings\"]/div[52]/div[4]/a")).click();
	
		
		
		Set<String> windows2 = driver.getWindowHandles();
		for(String window : windows2){
			if(!window.equalsIgnoreCase(originalwindow)){
				driver.switchTo().window(window);
				System.out.println("test");
			}
		}
		
		
		driver.findElement(By.className("dropdown-toggle"/*html/body/div[2]/div/div/div[2]/ul/li[2]*/)).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]")).click();
		
	}
}
