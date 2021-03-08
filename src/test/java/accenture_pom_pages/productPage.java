package accenture_pom_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import accenture_pom_objects.productObjects;


public class productPage {
	WebDriver driver;
	private final productObjects productdata;
	
	public productPage(WebDriver driver) {
		//this.driver=driver;
		this.productdata= new productObjects(driver);
		}	
	
	public void setStartDate (String start) {
		this.productdata.getStartDate().sendKeys(start);
	}
	
	public void setInsuranceSum (String sum) {
		this.productdata.getInsuranceSum().sendKeys(sum);
	}
	
	public void setMeritRating (String merit) {
		this.productdata.getMeritRating().sendKeys(merit);
	}
	
	public void setDamageInsurance (String damage) {
		this.productdata.getDamageInsurance().sendKeys(damage);
	}
	
	public void setOptionalProducts () {
		this.productdata.getOptionalProducts().click();
	}
	
	public void setCourtesyCar (String courtesy) {
		this.productdata.getCourtesyCar().sendKeys(courtesy);
	}
	
	public void setNext () {
		this.productdata.getNext().click();
	}
	
	public void counter () {
		this.productdata.getCounterZero().isDisplayed();
	}	
	
}
