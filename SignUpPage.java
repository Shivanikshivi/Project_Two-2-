package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class SignUpPage extends ProjectSpecification {

    // FindBy annotations to locate web elements on the Sign up page
    @FindBy(xpath="//*[@id=\"first_name\"]")
    WebElement firstName;

    @FindBy(xpath="//*[@id=\"last_name\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"email_id\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"new-password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"c-password\"]")
    WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[4]/div[1]/div/div[1]/input")
    WebElement mobileNumber;

    @FindBy(xpath = "//*[@id=\"defaultCheck1\"]")
    WebElement termsAndConditionsCheckbox;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button")
    WebElement signUpButton;

    // Constructor Initialization
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to enter first name
    public SignUpPage enterFirstName(String fName) {
        sendKeys(firstName, fName);
        return this;
    }

    // Method to enter last name
    public SignUpPage enterLastName(String lName) {
        sendKeys(lastName, lName);
        return this;
    }

    // Method to enter email
    public SignUpPage enterEmail(String emailAddress) {
        sendKeys(email, emailAddress);
        return this;
    }

    // Method to enter password
    public SignUpPage enterPassword(String pass) {
        sendKeys(password, pass);
        return this;
    }

    // Method to confirm password
    public SignUpPage confirmEnteredPassword(String confirmPass) {
        sendKeys(confirmPassword, confirmPass);
        return this;
    }

    // Method to enter mobile number
    public SignUpPage enterMobileNumber(String phone) {
        sendKeys(mobileNumber, phone);
        return this;
    }

    // Method to agree to terms and conditions
    public SignUpPage agreeToTermsAndConditions() {
        click(termsAndConditionsCheckbox);
        return this;
    }

    // Method to click on Sign Up button
    public SignUpPage clickSignUp() {
        click(signUpButton);
        return this;
    }

   
}