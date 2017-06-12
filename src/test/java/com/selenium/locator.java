package com.selenium;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class locator {

	public static void main(String[] args) throws Throwable {
		
		
		//File file = new File(Constants.DRIVER_LOC + "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");     
		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
		  //driver = new ChromeDriver(capabilities);
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.manage().window().maximize();
        
        //driver.get("https://nightly-realize.realizedev.com/community/");//https://www.linkedin.com/
        driver.get("https://www.linkedin.com/");
        
        //id
        driver.findElement(By.id("reg-firstname")).sendKeys("sourav.rta");
        
        //Name
        driver.findElement(By.name("lastName")).sendKeys("testing123$");
        
        //
        driver.findElement(By.className("reg-email")).sendKeys("sourav@gmail.com");
        
        
        
        //LinkTest
        driver.findElement(By.linkText("Forgot password?")).click();
        
        Thread.sleep(5000L);
        
        //driver.findElement(By.className("reg-firstname")).sendKeys("Sourav");
        //Thread.sleep(5000L);
        driver.quit();
        
        
	}

}
