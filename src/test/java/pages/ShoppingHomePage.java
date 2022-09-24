package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingHomePage {

    public ShoppingHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLogin;
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedText;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;
    @FindBy(xpath = "//b")
    public WebElement loggedInText;
    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement addProduct1;
    @FindBy(xpath = "(//a[@data-product-id='2'])[1]")
    public WebElement addProduct2;
    @FindBy(xpath = "(//a[@data-product-id='3'])[1]")
    public WebElement addProduct3;
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButton;
    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement cartButton;
    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logOutButton;


}