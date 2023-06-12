package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Homepage {

	WebDriver driver;
	
	By mainsearch=By.cssSelector(".sc-fMiknA");
	By mainlocation=By.xpath("//*[contains(@class,'sc-dVhcbM fNUcGt')]");
	By locationchild=By.cssSelector(".sc-brqgnP:nth-child(6) > .location-checkbox");
	By mainexperience=By.xpath("//*[contains(@class,'sc-eqIVtm UldRP')]");
	By experiencechild=By.cssSelector(".sc-hMqMXs:nth-child(2)");
	By gobutton=By.cssSelector(".sc-fAjcbJ");

	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Searchbar(String jobrole)
	{
		driver.findElement(mainsearch).sendKeys(jobrole);
	}
	public void locexppicker()
	{
		driver.findElement(mainlocation).click();
		driver.findElement(locationchild).click();
		driver.findElement(mainexperience).click();
		driver.findElement(experiencechild).click();
		driver.findElement(gobutton).click();
	}
}


