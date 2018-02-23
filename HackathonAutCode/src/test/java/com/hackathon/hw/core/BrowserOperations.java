package com.hackathon.hw.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserOperations {

	public static WebDriver driver;

	
	@Parameters({"browser","baseURL"})
	@BeforeTest
	public void openBrowser(String browser, String baseURL)
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			driver = new FirefoxDriver();
		}
		
		if(browser.equalsIgnoreCase("ch"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hackathon\\workspace_test\\HackathonAutCode\\src\\test\\resources\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\hackathon\\workspace_test\\HackathonAutCode\\src\\test\\resources\\lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}
	
	
