package com.qa.testscript;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.base;
import com.qa.page.buy_product;
import com.qa.page.registration;
import com.qa.util.sheetdata;




public class registration_test extends base {

	registration reg = null;
	buy_product buy = null;
	@BeforeMethod
	public void setup() {
		initilization();
		this.reg =new registration();
		this.buy=new buy_product();
		
	}
	
	@DataProvider
	public Iterator<String[]> getdata()
	{
		ArrayList<String[]>  testData=sheetdata.get_sheet_data();
		return testData.iterator();
	}
	
	@Test(dataProvider="getdata")
	public void signup(String email,String f_name,String l_name,String password,String address,String city,String pin_code,String m_no) throws InterruptedException
	{
		
		reg.email.sendKeys( new Random().nextInt(1000)+email);
		reg.subbtn.click();
		reg.gender.click(); 
		reg.day.click();
		reg.month.click();
		reg.year.click();
		reg.f_name.sendKeys(f_name);
		reg.l_name.sendKeys(l_name);
		reg.password.sendKeys(password);
		reg.address.sendKeys(address);
		reg.city.sendKeys(city);
		reg.state.click();
		reg.p_code.sendKeys(pin_code);
		reg.ph_no.sendKeys(m_no);
		reg.submit.click();
		
		buy.search1.sendKeys("Faded Short Sleeve T-shirts");
		buy.btn.click();
		String product= buy.element.getText();
		System.out.println("yes this is the same product i have searched ,product name is "+product);
		Assert.assertEquals(product,"Faded Short Sleeve T-shirts");
		buy.product.click();
		buy.execlusive.click();
		buy.btn2.click();
		buy.btn3.click();
	    buy.add.click();
	    buy.cgv.click();
		buy.processCarrier.click(); 
		buy.bankwire.click();
		buy.order.click();	
	}
	
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println(testResult.getStatus());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("./Screenshots/"+testResult.getName()+".png"));
	   } 
		driver.quit();
	}
}
