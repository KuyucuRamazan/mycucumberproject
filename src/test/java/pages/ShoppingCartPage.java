package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingCartPage {

    public ShoppingCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='active']")
    public WebElement shoppingCartText;
    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckOutButton;
    @FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement deliveryAddress;
    @FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[2]")
    public WebElement billingAddress;


}