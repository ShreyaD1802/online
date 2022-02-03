package com.qa.page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.base;

public class registration extends base {

	
	@FindBy(id="email_create")
	public WebElement email;
	
	@FindBy(id="SubmitCreate")
	public WebElement subbtn;
	
	@FindBy(id="id_gender2")
	public WebElement gender;
	
	@FindBy(xpath="//select[@id='days']//option[2]")
	public WebElement day;
	
	@FindBy(xpath="//select[@id='months']//option[2]")
	public WebElement month;
	
	@FindBy(xpath="//select[@id='years']//option[2]")
	public WebElement year;
	
	@FindBy(id="customer_firstname")
	public WebElement f_name;
	
	@FindBy(id="customer_lastname")
	public WebElement l_name;
	
	@FindBy(id="passwd")
	public WebElement password;
	
	@FindBy(id="address1")
	public WebElement address;
	
	@FindBy(id="city")
	public WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']//option[2]")
	public WebElement state;
	
	@FindBy(id="postcode")
	public WebElement p_code;
	
	@FindBy(id="phone_mobile")
	public WebElement ph_no;
	
	@FindBy(id="submitAccount")
	public WebElement submit;

	public registration() {
		PageFactory.initElements(driver, this);
	}

}
