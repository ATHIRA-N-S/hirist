package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Scroll_logo_linkpage;
public class Scroll_logo_linktest {
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
	public void lsltest() throws Exception
	{
		Scroll_logo_linkpage ob11=new Scroll_logo_linkpage(driver);
		ob11.selection();
	}

}
