package accenture_pom_pages;

import org.openqa.selenium.WebDriver;

import accenture_pom_objects.insurantObjects;


public class insurantPage {
	WebDriver driver;
	private final insurantObjects insurantdata;
	
	public insurantPage(WebDriver driver) {
		//this.driver=driver;
		this.insurantdata= new insurantObjects(driver);
		}	

	public void setFirstName (String first) {
		this.insurantdata.getFirstName().sendKeys(first);
	}
	
	public void setLastName (String last) {
		this.insurantdata.getLastName().sendKeys(last);
	}
	
	public void setDateOfBirth (String date) {
		this.insurantdata.getDateOfBirth().sendKeys(date);
	}
	
	public void setGender () {
		this.insurantdata.getGender().click();
	}
	
	public void setStreetAddress (String street) {
		this.insurantdata.getStreetAddress().sendKeys(street);
	}
	
	public void setCountry (String country) {
		this.insurantdata.getCountry().sendKeys(country);
	}
	
	public void setZipCode (String zip) {
		this.insurantdata.getZipCode().sendKeys(zip);
	}
	
	public void setCity (String city) {
		this.insurantdata.getCity().sendKeys(city);
	}
	
	public void setOccupation (String occupation) {
		this.insurantdata.getOccupation().sendKeys(occupation);
	}

	public void setHobbies () {
		this.insurantdata.getHobbies().click();
	}
	
	public void setWebSite (String website) {
		this.insurantdata.getWebSite().sendKeys(website);
	}
	
	public void setPicture () {
		this.insurantdata.getPicture().sendKeys("c:\\");
	}
	
	public void counter () {
		this.insurantdata.getCounterZero().isDisplayed();
	}	
	
	public void setNext () {
		this.insurantdata.getNext().click();
	}	
}
