package com.qa.util;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport {

	@Test
	public void createsignup()
	{
	 
		 ExtentHtmlReporter reporter = new ExtentHtmlReporter("./src/Testreport.html");
		 
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(reporter);
		ExtentTest logger=  extent.createTest("registration_test");
		logger.log(Status.INFO, "registration_test");
		logger.log(Status.PASS, "BUY PRODUCT SUCCESSFULLY");
		extent.flush();	
	}
}
