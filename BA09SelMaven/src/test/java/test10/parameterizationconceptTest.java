package test10;


import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
//import BA09SelMaven.*;

public class parameterizationconceptTest {
	@Test
	public void ebayread()
	{

		ExcelRead oExcel= new ExcelRead ("C:\\Users\\pintu\\Desktop\\Selenium\\class notes\\readsheet.xls","Data");
	
		String value1 = oExcel.getCellData("SearchFor",1);
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\pintu\\Desktop\\software\\geckodriver.exe");
	FirefoxDriver oBrowser = new FirefoxDriver();
	oBrowser.get("http://www.ebay.com/");
	oBrowser.findElement(By.id("gh-ac")).clear();;
	
    oBrowser.findElement(By.id("gh-ac")).sendKeys(value1);
	oBrowser.findElement(By.id("gh-btn")).click();
	oBrowser.findElement(By.linkText("Advanced")).click();
	
	
	}

	public void dataebayread()
	{

		ExcelRead oExcel= new ExcelRead ("C:\\Users\\pintu\\Desktop\\Selenium\\class notes\\readsheet.xls","Data");
	
		for (int i= 1; i<oExcel.Row_Count; i++)
		{
		String value1 = oExcel.getCellData("SearchFor",i);
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pintu\\Desktop\\software\\geckodriver.exe");
	FirefoxDriver oBrowser = new FirefoxDriver();
	oBrowser.get("http://www.ebay.com/");
	oBrowser.findElement(By.id("gh-ac")).clear();;
	
    oBrowser.findElement(By.id("gh-ac")).sendKeys(value1);
	oBrowser.findElement(By.id("gh-btn")).click();
	oBrowser.findElement(By.linkText("Advanced")).click();
	
		}
	}
}
