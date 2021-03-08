package accenture_pom_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class priceObjects {
	private WebDriver driver;

	public priceObjects(WebDriver driver) {
		this.driver=driver;
	}	
	public WebElement getCounterZero () {
		return driver.findElement(By.xpath("//span[@class='counter zero'][contains(.,'0')]"));
	}

	public WebElement getSelectSilver () {
		//return driver.findElement(By.xpath("(//span[contains(@class,'ideal-radio')])[3]"));
		return driver.findElement(By.id("selectsilver"));
	}	

	public WebElement getNext () {
		return driver.findElement(By.id("nextsendquote"));
	}	

}
