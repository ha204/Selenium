package phpr;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestPHP {
	WebDriver driver;
	
	 public void waitabit(){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
//	@Test
//	public void testHomePHP(){
//		HomePagePHP h = new HomePagePHP(driver);
//		h.loadHomePage();
//		String homepageText = h.getHomeText();
//		String expected = "Homepage";
//		assertEquals(expected, homepageText);
//		}
	
//	@Test
//	public void testLoggingInPHP(){
//		LoginPHP l = new LoginPHP(driver);
//		l.login();
//		String loginText = l.getUserWelcomeText();
//		String expected = "Hi, John Smith";
//		assertEquals(expected, loginText);
//	}
	
		@Test
		public void testInvoiceCheck(){
			Invoice i = new Invoice(driver);
			i.checkInvoice();
			waitabit();
			String invoiceText = i.getInvoiceText();
			String expected = "Hi, John Smith";
			assertEquals(expected, invoiceText);
		}
	
	
	
	
	
	

}
