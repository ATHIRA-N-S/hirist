package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scroll_logo_linkpage {
	WebDriver driver;
	By logo1=By.xpath("//*[@id=\"hm-root\"]/div[1]/a/img");

	public Scroll_logo_linkpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void selection()
	{
		Boolean b1=driver.findElement(logo1).isDisplayed();
		if(b1)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}}

