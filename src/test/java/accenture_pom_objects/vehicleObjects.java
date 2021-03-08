package accenture_pom_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vehicleObjects {
	private WebDriver driver;

	public vehicleObjects(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getMake () {
		System.out.println("-----dentro do get make");
		return driver.findElement(By.id("make"));
	}	

	public WebElement getModel () {
		return driver.findElement(By.id("model"));
	}

	public WebElement getCylinderCapacity () {
		return driver.findElement(By.id("cylindercapacity"));
	}

	public WebElement getEngine () {
		return driver.findElement(By.id("engineperformance"));
	}

	public WebElement getDate () {
		return driver.findElement(By.id("dateofmanufacture"));
	}

	public WebElement getNumber () {
		return driver.findElement(By.id("numberofseats"));
	}

	public WebElement getNumberOfSeats () {
		return driver.findElement(By.id("numberofseats"));
	}

	public WebElement getNumberOfSeats2 () {
		return driver.findElement(By.id("numberofseatsmotorcycle"));
	}

	public WebElement getFuelType () {
		return driver.findElement(By.id("fuel"));
	}

	public WebElement getPayload () {
		return driver.findElement(By.id("payload"));
	}

	public WebElement getTotalWeight () {
		return driver.findElement(By.id("totalweight"));
	}

	public WebElement getListPrice () {
		return driver.findElement(By.id("listprice"));
	}

	public WebElement getLicensePlate () {
		return driver.findElement(By.id("licenseplatenumber"));
	}

	public WebElement getAnnualMileage () {
		return driver.findElement(By.id("annualmileage"));
	}

	public WebElement getRightHandDrive () {
		return driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"));
	}
	
	public WebElement getCounterZero () {
		return driver.findElement(By.xpath("//span[@class='counter zero'][contains(.,'0')]"));
	}	

	public WebElement getNext () {
		return driver.findElement(By.id("nextenterinsurantdata"));
	}	

}
