package com.goibibo.TestClass;

import org.testng.annotations.Test;

import com.goibibo.generic.BaseClass;
import com.goibio.POM.HomePage;

public class Location extends BaseClass{
	
	@Test
	public void FromToLoc() throws Throwable {
		String FROM = elib.getExcelData("Sheet1", 4, 0)+ jLib.generateRandomNum();
		String TO= elib.getExcelData("Sheet1", 4, 1)+ jLib.generateRandomNum();
		
		HomePage hp=new HomePage(staticDriver);
		hp.getRoundTrip().click();
		hp.FromPoint(staticDriver,FROM);
		hp.getFromsend().click();
		
		//hp.getDestnSend().click();
		
		
		hp.DestnationPoint(staticDriver, TO);
		hp.getDepart().click();
		
		
		
	}
}
