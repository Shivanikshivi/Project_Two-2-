package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ForgotPasswordPage extends ProjectSpecification {

    // FindBy annotations to locate web elements on the Forgot Password page
    @FindBy(xpath= "//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/input")
    WebElement mobileNumber;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div/div[4]")
    WebElement submitButton;

    
    // Constructor Initialization
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to enter the email for password reset
    public ForgotPasswordPage entermobileNumberForReset(String mobilenumber) {
        sendKeys(mobileNumber, mobilenumber );
        return this;
    }

    // Method to submit the request for password reset
    public ForgotPasswordPage submitResetRequest() {
        click(submitButton);
        // Logic for handling post-request actions or messages
        return this;
    }

    
}