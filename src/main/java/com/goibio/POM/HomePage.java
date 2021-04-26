package com.goibio.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.goibibo.generic.WebDriverUtiles;

public class HomePage  extends WebDriverUtiles {

	@FindBy(xpath="//span[@id='roundTrip']")
	public WebElement roundTrip;
	@FindBy(xpath="//input[@id='gosuggest_inputSrc']")
	private WebElement FromBtn;
	
	
	
	@FindBy(xpath="//input[@value='Bengaluru (BLR)']")
	private WebElement Fromsend;

	
	@FindBy(xpath="//input[@id='gosuggest_inputDest']")
	private WebElement DestnSend;
	
	@FindBy(xpath="//input[@value='Mumbai (BOM)']")
	private WebElement DestinationAdd;
	
	@FindBy(xpath="//input[@id='departureCalendar']")
	private WebElement Depart;
	
	 public HomePage (WebDriver StaticDriver) {          
			PageFactory.initElements(StaticDriver, this);
		}

	 
	public WebElement getRoundTrip() {
		return roundTrip;
	}


	public WebElement getFromBtn() {
		return FromBtn;
	}
	
	public void FromButton(String FromLocation) {
		 FromBtn.sendKeys(FromLocation);
		 }
	public void  FromPoint(WebDriver staticDriver,String from) {
	waitforElementToBeClickable(staticDriver,   FromBtn);
		
	 FromBtn.sendKeys(from);
	}


	public WebElement getFromsend() {
		return Fromsend;
	}


	public WebElement getDestnSend() {
		return DestnSend;
	}

	public void  DestnationPoint(WebDriver staticDriver,String destnation) {
		waitforElementToBeClickable(staticDriver,   DestnSend);
			
		DestnSend.sendKeys(destnation);
		}


	public WebElement getDestinationAdd() {
		return DestinationAdd;
	}


	public WebElement getDepart() {
		return Depart;
	}
	
	
}
