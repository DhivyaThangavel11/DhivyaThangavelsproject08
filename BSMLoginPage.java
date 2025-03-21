package org.Login.page;

import org.baseclass.RPASBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BSMLoginPage  extends RPASBaseClass{
	
	@Test
	public static void setPropertyMethod(String browsername) {

		System.out.println(browsername); 
		System.out.println("setmethod running");

		switch (browsername) {
		case ("chrome"):

			driver = new ChromeDriver();
			break;

		case ("firefox"):
			System.out.println("test1");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dhivya.t\\Desktop\\Selenium\\geckodriver.exe");

			driver = new FirefoxDriver();
			System.out.println("Came inside edge");
			break;

		default:
			System.setProperty("webdriver.edge.driver", "C:\\Users\\dhivya.t\\Desktop\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}
	}
	
	
	
	@Test
	
	public static void bsmLogin() {
	WebElement usernameclk=	findElementbyId("txtUserName");
	clickbutton(usernameclk);
	WebElement username=	findElementbyId("txtUserName");
	send_keys(username, "70037774");
	WebElement passwrdclk=	findElementbyId("txtPassword");
	clickbutton(passwrdclk);
	WebElement Password=	findElementbyId("txtPassword");
	send_keys(Password, "Pass@123");
	WebElement captchaclk=	findElementbyId("CaptchaInputText");
	clickbutton(captchaclk);
	WebElement captcha=	findElementbyId("CaptchaInputText");
	send_keys(captcha, "TGHB");
	WebElement loginbtn=	findElementbyId("btnLogin");
	clickbutton(loginbtn);
	Write code	
	
		
	}
	
	
	
	
	
	
	

	

	   
}
