package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {

 WebDriver driver;

 @BeforeTest
 public void start(){
  driver = new FirefoxDriver();
  driver.get("http://jqueryui.com/droppable/");
 }

 @Test
 public void start1(){
 driver.manage().window().maximize();
  driver.switchTo().frame(0);  
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
  WebElement element = driver.findElement(By.id("draggable"));
  WebElement target = driver.findElement(By.id("droppable"));
  
  Actions ac=new Actions(driver);
  ac.dragAndDrop(element, target).build().perform();

 
 }
}
