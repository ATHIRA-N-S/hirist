package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.Set;
public class Scroll_linkpage {
	WebDriver driver;
	By chennai=By.xpath("//*[@id=\"hm-root\"]/div[8]/div[2]/div/ul[2]/li[1]/a/span");

	public Scroll_linkpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void slink()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		String parent=driver.getWindowHandle();
System.out.println("parent-"+driver.getTitle());
driver.findElement(chennai).click();
		Set<String> s=driver.getWindowHandles();

		for(String handle:s)
		{
System.out.println(handle);

		if(handle.equalsIgnoreCase(parent))
		{
		driver.switchTo().window(handle);
	}}

}}
