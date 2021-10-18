package com.farmatodo.test.definitions;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hooks {
	private ChromeDriver driver;

	
//	@Before
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		//driver.manage().window().maximize();
//		driver.get("https://www.farmatodo.com.co");
//		
//	}
	
	@After 
	public void tearDown() {
	driver.close();
	driver.quit();
 }
}
