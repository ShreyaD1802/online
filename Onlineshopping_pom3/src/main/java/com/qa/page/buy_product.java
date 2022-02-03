package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.base;

public class buy_product extends base{

	@FindBy(className="search_query")
	public WebElement search1;
	
	@FindBy(className="btn")
	public WebElement btn;
	
	@FindBy(className="replace-2x")
	public WebElement product;
	
	@FindBy(xpath="//button[@class='exclusive']//span")
	public WebElement execlusive;
	
	@FindBy(xpath="//div[@class='product-content']//h5/a[contains(text(),'Faded Short Sleeve T-shirts')]")
	public WebElement element;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']//span")
	public WebElement btn2;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span")
	public WebElement btn3;
	
	@FindBy(name="processAddress")
	public WebElement add;
	
	@FindBy(id="cgv")
	public WebElement cgv;
	
	@FindBy(name="processCarrier")
	public WebElement processCarrier;
	
	@FindBy(className="bankwire")
	public WebElement bankwire;
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	public WebElement order;
	
	public buy_product() {
		PageFactory.initElements(driver, this);
	}
	
}
