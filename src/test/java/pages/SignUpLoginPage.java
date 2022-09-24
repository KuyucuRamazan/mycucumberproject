package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpLoginPage {

    public SignUpLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBox;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;
    @FindBy(id = "id_gender1")
    public WebElement radioMr;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(id = "days")
    public WebElement daysDropDown;
    @FindBy(id = "months")
    public WebElement monthsDropDown;
    @FindBy(id = "years")
    public WebElement yearsDropDown;
    @FindBy(id = "first_name")
    public WebElement first_nameBox;
    @FindBy(id = "last_name")
    public WebElement last_nameBox;
    @FindBy(id = "company")
    public WebElement companyBox;
    @FindBy(id = "address1")
    public WebElement address1Box;
    @FindBy(id = "address2")
    public WebElement address2Box;
    @FindBy(id = "country")
    public WebElement countryDropDown;
    @FindBy(id = "state")
    public WebElement stateBox;
    @FindBy(id = "city")
    public WebElement cityBox;
    @FindBy(id = "zipcode")
    public WebElement zipcodeBox;
    @FindBy(id = "mobile_number")
    public WebElement mobile_numberBox;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;


}