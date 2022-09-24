package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalPage {
    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginButton;
    @FindBy(id="formBasicEmail")
    public WebElement username;
    @FindBy(id = "formBasicPassword")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;
}
