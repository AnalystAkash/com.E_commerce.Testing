package com.qa.E_Commerce.Base;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActivity {
	static WebDriver driver;
	
//	@BeforeTest
//	public void openurl() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://demo.opencart.com/");
//		driver.manage().window().maximize();
//	}
//	@AfterTest
//		public  void teardown() {
//			driver.close();
//			
//		}
		
		
	
	public static String url() {
		String URL = "https://www.saucedemo.com/";
		return URL;
	}
	
	public static void childpopup() {
		Set <String> winds;
		Iterator<String> itrerate;
		
		winds = driver.getWindowHandles();
		itrerate = winds.iterator();
		itrerate.next();
		String secondwindow = itrerate.next();
		driver.switchTo().window(secondwindow);
	}
//	public static void Snapshot() throws IOException {
//		TakesScreenshot screenshot = (TakesScreenshot)driver;
//		File source = screenshot.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(source, new File("C:\\Users\\Admin\\Desktop\\Selinium\\Screenshot"));
//	}

			
		
	
}



