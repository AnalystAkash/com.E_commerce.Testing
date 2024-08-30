package com.qa.E_Commerce.Testclass;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.E_Commerce.Base.BrowserActivity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHomepage {
	
	WebDriver driver;
	
	@BeforeTest
	public void openurl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(BrowserActivity.url());
		driver.manage().window().maximize();
	}
	@AfterTest
		public  void teardown() {
			driver.close();
		}
	
	@Test(priority=1)
     
	public void element() throws IOException {
	 this.driver.findElement(By.cssSelector("img[title='Flipkart']")).click();
	 
	 //BrowserActivity.Snapshot();
		
	}
	
	@Test(priority=2)
	public void Searchbar() {
		driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("iphone13");
		driver.findElement(By.cssSelector("button._2iLD__")).click();
		
	}
	
	
	@ Test(priority=3)
	public void item1() {
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 13 (Green, 128 GB)']")).click();	

	}
	
	@Test(priority=4)
	public void buy() throws InterruptedException {
		Thread.sleep(5000);
		
		//BrowserActivity.childpopup();
		driver.findElement(By.cssSelector("AFOXgu")).sendKeys("415403");
	}
	
//	@Test(priority=5)
//	public void buy1() {
//		driver.findElement(By.xpath("//input[@class='r4vIwl Jr-g+f']")).sendKeys("8329304919");
//		driver.findElement(By.xpath("//button[@class='QqFHMw YhpBe+ _7Pd1Fp']")).click();
//		}
	
}

		
	




