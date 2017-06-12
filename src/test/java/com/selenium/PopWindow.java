package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class PopWindow {
        //create a variable for WebDriver class
        public WebDriver driver;
        @Test
        public void window() throws Exception {
                //open URL
                driver.get("http://www.rightstart.com/");
                //get parent window handle
                String pwin=driver.getWindowHandle();    
                System.out.println(pwin);
             //   driver.findElement(By.id("search")).sendKeys("toys");
            //    driver.findElement(By.className("btn_search")).click();
                //click a link which opens a child window
                driver.findElement(By.linkText("Our Blog")).click();
                Set<String> win=driver.getWindowHandles(); 
                //remove parent window
                win.remove(pwin);
                //switch to child window  
                driver.switchTo().window(win.iterator().next());
 //perform some actions on child window
                driver.findElement(By.linkText("About")).click();
                driver.findElement(By.linkText("Baby")).click();
                //close the child window
                driver.close();
                //switch to parent window
                driver.switchTo().window(pwin);
                //perform operation on parent window
                driver.findElement(By.linkText("Email Signup")).click();
                driver.findElement(By.name("signup[eMail]")).sendKeys("Techcanvass");
               
        }
        
      
        @BeforeClass  
        public void beforeClass() {
                //instantiate FF browser
                driver = new FirefoxDriver();
                //maximize window
                driver.manage().window().maximize();
                //implicit wait
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        @AfterClass
        public void afterClass() {
                //close the browser
                driver.quit();
        }
}
