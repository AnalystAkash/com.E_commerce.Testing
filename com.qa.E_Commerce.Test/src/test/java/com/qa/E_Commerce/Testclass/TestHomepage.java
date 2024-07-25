package com.qa.E_Commerce.Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.E_Commerce.Test.Homepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHomepage {
	
	WebDriver driver;
	@Test
	public void openurl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Homepage.url());
		
		driver.close();		
		
	}

}
