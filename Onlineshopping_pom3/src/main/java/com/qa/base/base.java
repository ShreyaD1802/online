package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class base {

	public static WebDriver driver;
	public static WebElement we;
	public void initilization()
	{
		
		String expectedtitle = "Login - My Store";
		System.setProperty("webdriver.chrome.driver","./src/test/resources/com/driver/chromedriver1.exe" );
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);

	}
}
