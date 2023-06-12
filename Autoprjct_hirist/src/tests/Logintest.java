package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Loginpage;
public class Logintest {

	
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
	public void jobskr() throws Exception
	{
		Loginpage ob1=new Loginpage(driver);
		ob1.linkclick();
		Thread.sleep(5000);
		ob1.siginget();
		ob1.details("athirasiva369@gmail.com", "Chakkara@1349");
		ob1.buttonclick();
		
	}
}
