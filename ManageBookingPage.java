package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ManageBookingPage extends ProjectSpecification {

    // FindBy annotations to locate web elements on the Manage Booking page
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/input")
    WebElement ticketNumber;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/input")
    WebElement email;
    
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]")
    WebElement searchButton;
    
    // Constructor Initialization
    public ManageBookingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to enter ticket number
    public ManageBookingPage enterticketNumber(String ticketnumber) {
        sendKeys(ticketNumber, ticketnumber);
        return this;
    }
    
    // Method to enter email
    public ManageBookingPage enteremail(String Email) {
        sendKeys(email, Email);
        return this;
    }

    // Method to perform search for manage booking
    public ManageBookingPage searchManageBooking() {
        click(searchButton);
       
        return this;
    }

   
}