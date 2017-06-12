package com.selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeAScreenShot {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Date date= new Date();
		 Timestamp t = new Timestamp(date.getTime());
		 System.out.println(t);
		 String dateNow = t.toString().replace(":","_");
		// Initialize WebDriver
		WebDriver driver = new FirefoxDriver();
		// Wait For Page To Load

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Go to URL
		driver.get("http://www.yahoo.com/");
		// Maximize Window
		driver.manage().window().maximize();
		// Take ScreenShot
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(scrFile, new File("./Screenshots/"+dateNow+".png"));
		FileUtils.copyFile(scrFile, new File(dateNow+".png"));
		
		// Close Driver
		driver.quit();
		}
		
}
