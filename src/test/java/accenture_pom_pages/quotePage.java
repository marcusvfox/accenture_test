package accenture_pom_pages;

import org.openqa.selenium.WebDriver;

import accenture_pom_objects.quoteObjects;

public class quotePage {

	WebDriver driver;
	private final quoteObjects quotedata;
	
	public quotePage(WebDriver driver) {
		//this.driver=driver;
		this.quotedata= new quoteObjects(driver);
		}	
	public void counter () {
		this.quotedata.getCounterZero().isDisplayed();
	}		
	public void setEmail (String email) {
		this.quotedata.getEmail().sendKeys(email);
	}
	
	public void setPhone (String phone) {
		this.quotedata.getPhone().sendKeys(phone);
	}
	
	public void setUsername (String username) {
		this.quotedata.getUsername().sendKeys(username);
	}

	public void setPassword (String password) {
		this.quotedata.getPassword().sendKeys(password);
	}
	
	public void setConfirmPassword (String confirm) {
		this.quotedata.getConfirmPassword().sendKeys(confirm);
	}
	
	public void setSendEmail () {
		this.quotedata.getSendEmail().click();
	}
}	

