package accenture_pom_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import accenture_pom_objects.priceObjects;


public class pricePage {
	WebDriver driver;
	private final priceObjects pricedata;
	
	public pricePage(WebDriver driver) {
		this.driver=driver;
		this.pricedata= new priceObjects(driver);
		}	

	public void counter () {
		this.pricedata.getCounterZero().isDisplayed();
	}	
	
	public void selectSilver () {
		System.out.println("price select silver - pricedata=" + pricedata);
		System.out.println("price select silver - driver=" + driver);
		
		//WebDriverWait wait = new WebDriverWait(this.driver, 20);
		this.pricedata.getSelectSilver().isDisplayed();
		WebElement silver = this.pricedata.getSelectSilver();
		//System.out.println("Test 1");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", silver);
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class,'ideal-radio')])[3]")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("selectsilver"));
		//System.out.println("price select silver - elementclickable=" + driver);
		//this.pricedata.getSelectSilver().click();
	}
	
	public void setNext () {		
		this.pricedata.getNext().click();
	}	

}
