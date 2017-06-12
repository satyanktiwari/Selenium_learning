package com.selenium;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Mousehover {
 WebDriver driver = new FirefoxDriver();
 
 @BeforeTest
 public void beforetest() {
  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
 }
 
 @AfterTest
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 
 public void test () throws InterruptedException, IOException 
 { 

  //Generate mouse hover event on main menu to click on sub menu
  Actions actions = new Actions(driver);
  WebElement moveonmenu = driver.findElement(By.xpath("//div[@id='menu1']/div"));
  actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a"))).click().perform();
  
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.titleContains("Google"));
 }
   
}