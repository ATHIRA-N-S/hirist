package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Loginpage {

	WebDriver driver;
	
	By jobeekerlogin=By.id("user-login-button-id");
	By signin=By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/form/div[4]/p/span");
	By emailaddress=By.id("login-email-input");
	By passwordenter=By.id("loginPassword");
	By loginbutton=By.id("loginSubmit");
	
	
	public void linkclick()
	{
		driver.findElement(jobeekerlogin).click();	
		
	}
	
	public void siginget()
	{
		driver.findElement(signin).click();
	}
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void details(String email,String password1)
	{
		driver.findElement(emailaddress).sendKeys(email);
		driver.findElement(passwordenter).sendKeys(password1);
	}
	
	public void buttonclick()
	{
		
		driver.findElement(loginbutton).click();
	}
}
