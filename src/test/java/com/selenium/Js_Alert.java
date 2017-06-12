package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Js_Alert {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver= new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "f:\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "f:\\IEDriverServer.exe");
		//WebDriver driver= new InternetExplorerDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		
		//driver.switchTo().activeElement(); ie
		Alert al = driver.switchTo().alert();// 2seconds
		Thread.sleep(5000);
		System.out.println(al.getText());
		al.accept();//ok
		//al.dismiss();
		
		driver.switchTo().defaultContent();

	}

}
