package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class certificateWarning {

	public static void main(String[] args) {
		
		       /* //Firefox
		        FirefoxProfile prof = new FirefoxProfile();
				prof.setAcceptUntrustedCertificates(true);
				prof.setAssumeUntrustedCertificateIssuer(true);
				WebDriver driver = new FirefoxDriver(prof);*/
		        
				
				//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				
				
				//IE
		        System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
				WebDriver driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
				
				driver.get("https://onlineservices.tin.nsdl.com/etaxnew/tdsnontds.jsp");
				
				//if IE
				//driver.navigate().to("javascript:document.getElementById('overridelink').click()");

	}

}
