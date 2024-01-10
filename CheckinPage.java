package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CheckinPage extends ProjectSpecification {

	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/input")
    WebElement ticketNumber;
	
	 @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/input")
	 WebElement email ;
	
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]")
    WebElement searchBooking;


    // Constructor Initialization
    public CheckinPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to enter ticket number
    public CheckinPage enterTicketNumber(String ticketNum) {
        sendKeys(ticketNumber, ticketNum);
        return this;
    }

    // Method to enter email
    public CheckinPage enterEmail(String Email) {
        sendKeys(email, Email);
        return this;
    }

    
    public CheckinPage entersearchBooking(String SearchBooking) {
        sendKeys(searchBooking, SearchBooking);
        return this;
    }

    
}