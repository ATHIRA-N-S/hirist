package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Screenshotpage;
public class Screenshottest {

	WebDriver driver;
	@BeforeTest
	public void driversint()
	{
		 driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		 driver.get("https://www.hirist.com/");
		    driver.manage().window().setSize(new Dimension(1536, 816));
	}
	@Test
	public void screen1() throws Exception
	{
		Screenshotpage obj=new Screenshotpage(driver);
		obj.screenpath();
		
	}
}
