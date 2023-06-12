package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpage {

	WebDriver driver;
	By screen=By.xpath("//*[@id=\"hm-root\"]/div[2]/p[1]");
	
	public Screenshotpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void screenpath() throws Exception
	{
		WebElement screenp=driver.findElement(screen);
		File src=screenp.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./shotfolder//elementsc1.png"));
	
	}
}
