package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class FlightsPage extends ProjectSpecification {

    // FindBy annotations to locate web elements on the Flights page
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[1]")
    WebElement originTextBox;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[1]")
    WebElement destinationTextBox;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]/div[1]")
    WebElement departureDate;
    
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div[1]")
    WebElement returnDate;
    
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")
    WebElement searchButton;

    // Constructor Initialization
    public FlightsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to enter origin 
    public FlightsPage enterOrigin(String origin) {
        sendKeys(originTextBox, origin);
        // Logic for handling suggestion or drop down if applicable
        return this;
    }

    // Method to enter destination 
    public FlightsPage enterDestination(String destination) {
        sendKeys(destinationTextBox, destination);
        // Logic for handling suggestion or drop down if applicable
        return this;
    }
    
    //Method to enter departure date
    public FlightsPage enterDepartureDate(String departuredate) {
        sendKeys(departureDate, departuredate);
        // Logic for handling suggestion or drop down if applicable
        return this;
    }
    
    //Method to enter return date 
    public FlightsPage enterReturnDate(String returndate) {
        sendKeys(returnDate, returndate);
        // Logic for handling suggestion or drop down if applicable
        return this;
    }

    // Method to perform flight search
    public FlightsPage performFlightSearch() {
        click(searchButton);
        // Logic to wait for search results or other handling post search
        return this;
    }

   
}