package test10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class fileuploadGridTest2 {
	
	@Test
	public void example() throws InterruptedException, AWTException, MalformedURLException
	{
		BasicConfigurator.configure();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\pintu\\Desktop\\software\\geckodriver.exe");
		//FirefoxDriver oBrowser = new FirefoxDriver();
			
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pintu\\Desktop\\software\\geckodriver.exe");
		FirefoxDriver oBrowser = new FirefoxDriver();
		oBrowser.get("http://www.zamzar.com/");
		oBrowser.manage().window().maximize();
		
		oBrowser.get("http://www.zamzar.com/");
		oBrowser.manage().window().maximize();
		Thread.sleep(7000);
		
		oBrowser.findElement(By.id("inputFile")).click();
		
		String spath = "C:\\Users\\pintu\\Desktop\\New Text Document (2).txt";
		//C:\Users\pintu\Desktop\New Text Document (2).txt
		StringSelection oFilepathupload = new StringSelection(spath);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(oFilepathupload, null);
		
		Robot oRbt = new Robot();
		oRbt.keyPress(KeyEvent.VK_ENTER);
		oRbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		oRbt.keyPress(KeyEvent.VK_CONTROL);
		oRbt.keyPress(KeyEvent.VK_V);
		oRbt.keyRelease(KeyEvent.VK_CONTROL);
		oRbt.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		
		oRbt.keyPress(KeyEvent.VK_ENTER);
		oRbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		Select select1 = new Select(oBrowser.findElement(By.id("toExtensionSel")));
	   select1.selectByVisibleText("pdf");
		
	//	oBrowser.findElement(By.id("toEmail")).sendKeys("neysaamazon@gmail.co");
		
	//	oBrowser.findElement(By.id("uploadButton")).click();
		oBrowser.quit();
	}
	

}
