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
     
	public void Login() throws IOException {
	 driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
	 driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
	 driver.findElement(By.cssSelector("input[id='login-button']")).submit();
	 
	 //BrowserActivity.Snapshot();
		
	}
	
	@Test(priority=2)
	public void Productselect() {
		driver.findElement(By.cssSelector("button[name='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.cssSelector("button[name='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
		
	}
	
	
	@ Test(priority=3)
	public void checkout() {
		
//		BrowserActivity.childpopup();
		driver.findElement(By.cssSelector("button[name='checkout']")).click();	

	}
	
	@Test(priority=4)
	public void checkoutinformation() {
		
		
		driver.findElement(By.cssSelector("input[id='first-name']")).sendKeys("Akash");
		driver.findElement(By.cssSelector("input[id='last-name']")).sendKeys("Dinde");
		driver.findElement(By.cssSelector("input[id='postal-code']")).sendKeys("415409");
		driver.findElement(By.cssSelector("input[id='continue']")).click();
	}
	
	@Test(priority=5)
	public void buy1() {
		driver.findElement(By.cssSelector("button[id='finish']")).click();
		}
	
}

		
	




