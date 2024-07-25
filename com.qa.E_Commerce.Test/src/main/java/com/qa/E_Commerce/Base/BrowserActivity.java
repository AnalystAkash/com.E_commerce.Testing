package com.qa.E_Commerce.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActivity {
	WebDriver driver;
	@BeforeSuite
	public void openchrome() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	
	@AfterSuite
	public void teardown() {
		driver.close();
	}

}
