package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class FlightStatusPage extends ProjectSpecification {

	 @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]")
	 WebElement departureDateField;
	 
	 @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")
	    WebElement originTextBox;

	    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[1]")
	    WebElement destinationTextBox;
	 
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/input")
    WebElement flightNumberField;

   
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]")
    WebElement submitButton;

    // Constructor Initialization
    public FlightStatusPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Method to enter departure date
    public FlightStatusPage enterDepartureDate(String departureDate) {
        sendKeys(departureDateField, departureDate);
        return this;
    }


    // Method to enter origin text box
    public FlightStatusPage enteroriginTextBox(String origintextbox) {
        sendKeys(originTextBox, origintextbox);
        return this;
    }
    
 // Method to enter destination text box
    public FlightStatusPage enterdestinationTextBox(String destinationtextbox) {
        sendKeys(destinationTextBox, destinationtextbox);
        return this;
    }
    
    // Method to enter flight number field 
    public FlightStatusPage enterFlightNumber(String flightNumber) {
        sendKeys(flightNumberField, flightNumber);
        return this;
    }
    
    // Method to submit flight status request
    public FlightStatusPage submitFlightStatusRequest() {
        click(submitButton);
       
        return this;
    }

    
}