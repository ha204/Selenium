package AutomatedTesting;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestTwitter {
	ExtentReports report;
	ExtentTest test;
	 WebDriver driver;
	@Test
	public void testAll(){
		report = new ExtentReports("C:\\Users\\Administrator\\Desktop\\java\\Result\\TestTwitter.html",true);
		test = report.startTest("Twitter Test Start");
		
		Login l = new Login(driver);
		HomePage h = new HomePage(driver);
		
		test.log(LogStatus.INFO, "Testing on homepage");
		h.loadHomePage();
		String loginButtonText = h.getLoginButton();
		String expected = "Log in";
		assertEquals(expected, loginButtonText);
		if (expected.equals(loginButtonText)){
			test.log(LogStatus.PASS, "On homepage");
		}
		else{
			test.log(LogStatus.FAIL, "Not on Homepage");
		}
		l.loggingIn();
		String userHeaderTexts = l.getUserHeaderText();
		String expected1 = "Hassan Abbas";
		//assertEquals(expected1, userHeaderTexts);
		
//		l.loggingOut();
//		l.waitabit();
//		String postLoginButtonText = l.getPostLoginButtonText();
//		String expected2 = "Download the app";
//		assertEquals(expected2, postLoginButtonText);
		
		report.endTest(test);
		report.flush();
	}
	
	//testing homepage has loaded
//	@Test
//	public void testLoadHomePage(){
//		HomePage h = new HomePage(driver);
//		h.loadHomePage();
//		String loginButtonText = h.getLoginButton();
//		String expected = "Log in";
//		assertEquals(expected, loginButtonText);
//		}
	//testing logging in
//	@Test
//	public void testLoggingIn(){
//		Login l = new Login(driver);
//		l.loggingIn();
//		String userHeaderTexts = l.getUserHeaderText();
//		String expected = "Hassan Abbas";
//		assertEquals(expected, userHeaderTexts);
//	}
//	//Testing logout
//	@Test
//	public void testLogout(){
//		Login l = new Login(driver);
//		l.loggingOut();
//		l.waitabit();
//		String postLoginButtonTexts = l.getPostLoginButtonText();
//		String expected = "Download the app";
//		assertEquals(expected, postLoginButtonTexts);
//	}
	
}
