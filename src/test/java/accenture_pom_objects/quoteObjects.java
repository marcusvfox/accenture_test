package accenture_pom_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class quoteObjects {
	
	private WebDriver driver;

	public quoteObjects(WebDriver driver) {
		this.driver=driver;
	}		
	public WebElement getCounterZero () {
		return driver.findElement(By.xpath("//span[@class='counter zero'][contains(.,'0')]"));	
	}
	public WebElement getEmail () {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getPhone () {
		return driver.findElement(By.id("phone"));
	}
	
	public WebElement getUsername () {
		return driver.findElement(By.id("username"));
	}
	
	public WebElement getPassword () {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getConfirmPassword () {
		return driver.findElement(By.id("confirmpassword"));
	}
	
	public WebElement getSendEmail () {
		return driver.findElement(By.id("sendemail"));
	}	

}
