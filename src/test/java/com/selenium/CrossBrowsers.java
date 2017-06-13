package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsers {

	WebDriver driver;
	 
    
	 
    /**
 
     * This function will execute before each Test tag in testng.xml
 
     * @param browser
 
     * @throws Exception
 
     */
 
@BeforeTest
 
    @Parameters("browser")
 
    public void setup(String browser) throws Exception{
 
        //Check if parameter passed from TestNG is 'firefox'
 
        if(browser.equalsIgnoreCase("firefox")){
 
        //create firefox instance
 
            driver = new FirefoxDriver();
 
        }
 
        //Check if parameter passed as 'chrome'
 
        else if(browser.equalsIgnoreCase("chrome")){
 
            //set path to chromedriver.exe You may need to download it from http://code.google.com/p/selenium/wiki/ChromeDriver
 
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
 
            //create chrome instance
 
            driver = new ChromeDriver();
 
        }
 
else if(browser.equalsIgnoreCase("ie")){
 
            //set path to IEdriver.exe You may need to download it from
 
     // 32 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_Win32_2.42.0.zip
 
     // 64 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_x64_2.42.0.zip
 
            System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
 
            //create IE instance
 
            driver = new InternetExplorerDriver();
 
        }
 
        else{
 
            //If no browser passed throw exception
 
            throw new Exception("Browser is not correct");
 
        }
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
    }
 
     
 
    @Test
 
    public void testParameterWithXML() throws InterruptedException{
 
    	 driver.get("http://demo.opensourcecms.com/wordpress/wp-login.php");
 
        //Find user name
 
    	 driver.findElement(By.id("user_login")).clear();
         driver.findElement(By.id("user_login")).sendKeys("admin");
         // Enter Password
         driver.findElement(By.id("user_pass")).clear();
         driver.findElement(By.id("user_pass")).sendKeys("demo123");
         // Click on Submit button
         driver.findElement(By.id("wp-submit")).submit();
 
         driver.quit();
}
}
