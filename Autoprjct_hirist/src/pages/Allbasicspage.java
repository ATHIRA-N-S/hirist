package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Allbasicspage {
	WebDriver driver;
	
	By mouseover1=By.xpath("//*[@id=\"hm-root\"]/div[3]/div/div/span[1]/a/p");
	
	public Allbasicspage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void mouseaction()
	{
		Actions act=new Actions(driver);
		WebElement over1=driver.findElement(mouseover1);
		act.moveToElement(over1).perform();
	}
	
	public String getHeading() {
		String head = driver.getTitle();
		System.out.println(head);
		return head;
	}
	public String getcontent()
	{
		String pagecontent=driver.getPageSource();
		if(pagecontent.contains("hirist"))
		{
			System.out.println("pagesource content present");
		}
		else
		{
		System.out.println("pagessource content not present");
		}
		return pagecontent;
	}
}
