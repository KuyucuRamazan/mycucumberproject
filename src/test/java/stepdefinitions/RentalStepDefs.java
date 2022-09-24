package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class RentalStepDefs {
    BlueRentalPage blueRentalPage=new BlueRentalPage();

    @Given("user is on the blue rental page")
    public void user_is_on_the_blue_rental_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @When("user clicks on home login button")
    public void user_clicks_on_home_login_button() {
        ReusableMethods.waitForClickablility(blueRentalPage.homeLoginButton,3).click();

    }
    /*@Then("user enters username and password")
    public void user_enters_username_and_password() {
        blueRentalPage.username.sendKeys(ConfigReader.getProperty("customer_username"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
    }*/
    @Then("user click on login button")
    public void user_click_on_login_button() {
        blueRentalPage.loginButton.click();
    }
    @Then("verify if login successful")
    public void verify_if_login_successful() {
        boolean isDisplayed=ReusableMethods.waitForVisibility(blueRentalPage.userID,3).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
    @Then("close the rental application")
    public void close_the_rental_application() {
        Driver.closeDriver();
    }

}

