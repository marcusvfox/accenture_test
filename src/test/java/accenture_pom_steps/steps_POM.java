package accenture_pom_steps;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import accenture_pom_pages.insurantPage;
import accenture_pom_pages.pricePage;
import accenture_pom_pages.productPage;
import accenture_pom_pages.quotePage;
import accenture_pom_pages.vehiclePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


//import support.Report;
//import verificationPoints.ValidarMensagemEmailVerificationPoint;



public class steps_POM {
	//WebDriver driver = null;
	static WebDriver driver;
	vehiclePage vehicledata;
	insurantPage insurantdata;
	productPage productdata;
	pricePage pricedata;
	quotePage quotedata;

	
//-----------------------------------------------------------------------
//--------------------------------------------------------------------------	
	
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("==== Inside of Browser_open");
		
		//String userdir = System.getProperty("user.dir");
		//System.out.println("userdir=" + userdir); 
		
		
		//String projectPath = "/home/pi/eclipse-workspace/accenture_pom";
		//System.setProperty("webdriver.chrome.driver",userdir +"/src/test/resources/drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		//System.out.println("1 - driver=" + driver); 
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() {
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		//System.out.println("2 - driver=" + driver); 
	}

	@When("user fill vehicle data info")
	public void user_fill_vehicle_data_info() {
		System.out.println("=====Inside of Vehicle Test case"); 
		vehicledata = new vehiclePage(driver);
		vehicledata.setMake("Volkswagen");
		vehicledata.setModel("Motorcycle");
		vehicledata.setCylinderCapacity("100");
		vehicledata.setEnginePerformance("100");
		vehicledata.setDateOfManufacture("05/12/2000");
		vehicledata.setNumberOfSeats("2");
		vehicledata.setRightHandDriver();
		vehicledata.setNumberOfSeats2("1");
		vehicledata.setFuelType("Petrol");
		vehicledata.setPayload("100");
		vehicledata.setTotalWeight("100");
		vehicledata.setListPrice("10000");
		vehicledata.setLicensePlate("qqq1234");
		vehicledata.setAnnualMileage("15000");
		//String screenshotArquivo1 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
		//Screenshot.Tirar(driver, screenshotArquivo1);
		//Report.log(Status.PASS, "Preencheu Vehicle Data", screenshotArquivo1);
		 		
//		System.out.println("driver=" + driver); 

		//driver.findElement(By.id("payload")).sendKeys("20000");
	}

	@And("counter is zero")
	public void counter_is_zero() {
		System.out.println("=====Inside of Vehicle Test case - Counter"); 
		vehicledata.counter();
		//driver.findElement(By.xpath("//span[@class='counter zero'][contains(.,'0')]")).isDisplayed();
	}

	@Then("user click on next button")
	public void user_click_on_next_button() {
		vehicledata.next(); 
		//driver.findElement(By.xpath("//button[contains(.,'Next »')]")).click();
		System.out.println("=====Inside of Vehicle Test case - Next");
	}

	@When("user fill insurant data info")
	public void user_fill_insurant_data_info() {
		System.out.println("=====Inside of Insurant Test case");
		insurantdata = new insurantPage(driver);
		insurantdata.setFirstName("Marcus");
		insurantdata.setLastName("Furtado");
		insurantdata.setDateOfBirth("12/05/1989");
		insurantdata.setGender();
		insurantdata.setStreetAddress("Avenida barao");
		insurantdata.setCountry("Brazil");
		insurantdata.setZipCode("13023280");
		insurantdata.setCity("Campinas");
		insurantdata.setOccupation("Employee");
		insurantdata.setHobbies();
		insurantdata.setWebSite("www.test.com.br");
		insurantdata.setPicture();
		//String screenshotArquivo2 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
		//Screenshot.Tirar(driver, screenshotArquivo2);
		//Report.log(Status.PASS, "Preencheu Insurant Data", screenshotArquivo2);
		//insurantdata.setNext();		
		
	}
	
	@And("counter is zero - insurant page")
	public void counter_is_zero_insurant_page() {
		System.out.println("=====Inside of Insurant Test case - Counter");
		insurantdata.counter();
	}

	@Then("user click on next button - insurant page")
	public void user_click_on_next_button_insurant_page() {
		System.out.println("=====Inside of Insurant Test case - Next");
		insurantdata.setNext();
	}

	@When("user fill product data info")
	public void user_fill_product_data_info() {
		System.out.println("=====Inside of Product Test case");
		productdata = new productPage(driver);
		productdata.setStartDate("12/08/2021");
		productdata.setInsuranceSum("5.000.000,00");
		productdata.setMeritRating("Bonus 3");
		productdata.setDamageInsurance("Partial Coverage");
		productdata.setOptionalProducts();
		productdata.setCourtesyCar("Yes");
		
	}

	@And("counter is zero  - product page")
	public void counter_is_zero_product_page() {
		System.out.println("=====Inside of Product Test case - Counter");
		productdata.counter();
		
	}

	@Then("user click on next button  - product page")
	public void user_click_on_next_button_product_page() {
		System.out.println("=====Inside of Product Test case - Next");
		productdata.setNext();
	}	
	
	@When("user select price option")
	public void user_select_price_option() {
		System.out.println("=====Inside of Price Test case");
		pricedata = new pricePage(driver);
		pricedata.selectSilver();
	}

	@And("counter is zero - price page")
	public void counter_is_zero_price_page() {
		System.out.println("=====Inside of Price Test case - Counter");
		pricedata.counter();		
	}

	@Then("user click on next button - price page")
	public void user_click_on_next_button_price_page() {
		System.out.println("=====Inside of Price Test case - Next");
		pricedata.setNext();		
		
	}	
	
	@When("user fill quote info")
	public void user_fill_quote_info() {
		System.out.println("=====Inside of Quote Test case");
		quotedata = new quotePage(driver);	
		quotedata.setEmail("test@gmail.com");
		quotedata.setPhone("19955551234");
		quotedata.setUsername("teste12");
		quotedata.setPassword("Teste12");
		quotedata.setConfirmPassword("Teste12");

		//String screenshotArquivo4 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
		//Screenshot.Tirar(driver, screenshotArquivo4);
		//Report.log(Status.PASS, "Preencheu Quote Data", screenshotArquivo4);		
	}
	
	@And("counter is zero  - quote page")
	public void counter_is_zero_quote_page() {
		System.out.println("=====Inside of Quote Test case - Counter");
	}	

	@Then("user click on send button")
	public void user_click_on_send_button() {
		System.out.println("=====Inside of Quote Test case - Send");
		quotedata.setSendEmail();
	}

	@When("user receive email success message")
	public void user_receive_email_success_message() throws InterruptedException {
		System.out.println("=====Inside of email success Test case");
		//emaildata = new emailPage(driver);
		WebDriverWait wait = new WebDriverWait(this.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(.,'Sending e-mail success!')]"))));		
		System.out.println("=====email success final");
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
