package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class rightClick 
{
    public static void main(String[] args) 
    {
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("http://www.google.com");
        
        driver.manage().window().maximize();
        
        WebElement oWE=driver.findElement(By.className("gb_P"));
        
        Actions oAction=new Actions(driver);
        oAction.moveToElement(oWE);
        oAction.contextClick(oWE).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
    }

}

