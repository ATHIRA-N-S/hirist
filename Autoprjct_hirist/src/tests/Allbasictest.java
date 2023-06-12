package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Allbasicspage;
public class Allbasictest {

	WebDriver driver;
	@BeforeTest
	public void profiledriversint()
	{
		 driver = new ChromeDriver();
	}
	@BeforeMethod
	public void profileurl()
	{
		 driver.get("https://www.hirist.com/");
		    driver.manage().window().setSize(new Dimension(1536, 816));
	}
	@Test
	public void gettitlename1() throws Exception
	{
		Allbasicspage ob3=new Allbasicspage(driver);
		ob3.mouseaction();
		ob3.getHeading();
		ob3.getcontent();
		
	}
}
