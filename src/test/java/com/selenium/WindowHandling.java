package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WindowHandling {

	public static void main(String[] args) throws Throwable {
		    WebDriver driver=new FirefoxDriver();
		
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");;
			//ChromeDriver driver = new ChromeDriver();
		    /*System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
			InternetExplorerDriver driver = new InternetExplorerDriver();*/
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			
			
			// 1 window
			Set<String> windowIds = driver.getWindowHandles();
			System.out.println("Total windows opened -> "+ windowIds.size());
			Iterator<String> it = windowIds.iterator();
			System.out.println(it.next());
			
			
			System.out.println("-------------------------");
			driver.get("http://timesofindia.indiatimes.com/");
			driver.findElement(By.xpath("//div[@class='top-story']/ul/li[2]/a")).click();
			Thread.sleep(5000);
			//popup
			windowIds = driver.getWindowHandles();
			System.out.println("Total windows opened -> "+ windowIds.size());
			it = windowIds.iterator();
			String mainWindow = it.next();
			String popupWindow =it.next();
			System.out.println(mainWindow);
			System.out.println(popupWindow);
			driver.switchTo().window(popupWindow);
			System.out.println(driver.getTitle());
			driver.switchTo().activeElement();//IE
			driver.close(); // closes the window on which focus is there
			driver.switchTo().window(mainWindow);

	}

}
