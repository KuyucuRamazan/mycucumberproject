package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.ShoppingCartPage;
import pages.ShoppingHomePage;
import pages.SignUpLoginPage;
import utilities.Driver;
import utilities.JSUtils;

import java.time.Duration;

public class ShoppingStepDefs {

    ShoppingHomePage shoppingHomePage = new ShoppingHomePage();
    SignUpLoginPage signUpLoginPage = new SignUpLoginPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        String title = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", title);

    }

    @When("Click Signup-Login button")
    public void click_signup_login_button() {

        shoppingHomePage.signUpLogin.click();


    }

    @When("Enter name as {string} and email as {string} and click on SignUp Button")
    public void enter_name_as_and_email_as_and_click_on_sign_up_button(String name, String email) {

        signUpLoginPage.nameBox.sendKeys(name);
        signUpLoginPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        signUpLoginPage.signUpButton.click();


    }

    @When("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        signUpLoginPage.radioMr.click();
        signUpLoginPage.passwordBox.sendKeys("1234");
        Select selectDay = new Select(signUpLoginPage.daysDropDown);
        selectDay.selectByValue("15");
        Select selectMonth = new Select(signUpLoginPage.monthsDropDown);
        selectMonth.selectByValue("3");
        Select selectYear = new Select(signUpLoginPage.yearsDropDown);
        selectYear.selectByValue("1998");
        signUpLoginPage.first_nameBox.sendKeys("John");
        signUpLoginPage.last_nameBox.sendKeys("Doe");
        signUpLoginPage.companyBox.sendKeys("TechPro");
        signUpLoginPage.address1Box.sendKeys("Sesame Street");
        signUpLoginPage.address2Box.sendKeys("215");
        Select selectCountry = new Select(signUpLoginPage.countryDropDown);
        selectCountry.selectByValue("United States");
        signUpLoginPage.stateBox.sendKeys("New York");
        signUpLoginPage.cityBox.sendKeys("Harlem");
        signUpLoginPage.zipcodeBox.sendKeys("18062");
        signUpLoginPage.mobile_numberBox.sendKeys("12345");

        JSUtils.clickElementByJS(signUpLoginPage.createAccountButton);


    }

    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {

        String accountCreatedText = shoppingHomePage.accountCreatedText.getText();
        Assert.assertEquals("ACCOUNT CREATED!", accountCreatedText);
        shoppingHomePage.continueButton.click();

    }

    @Then("Verify  Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {

        String loggedInText = shoppingHomePage.loggedInText.getText();
        Assert.assertTrue(loggedInText.contains("John"));

    }

    @When("Add products to cart")
    public void add_products_to_cart() {

        JSUtils.scrollIntoViewJS(shoppingHomePage.addProduct1);
        JSUtils.clickElementByJS(shoppingHomePage.addProduct1);
        shoppingHomePage.continueShoppingButton.click();
        JSUtils.clickElementByJS(shoppingHomePage.addProduct2);
        shoppingHomePage.continueShoppingButton.click();
        JSUtils.clickElementByJS(shoppingHomePage.addProduct3);
        shoppingHomePage.continueShoppingButton.click();


    }

    @When("Click Cart button")
    public void click_cart_button() {

        shoppingHomePage.cartButton.click();

    }

    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {

        Assert.assertTrue(shoppingCartPage.shoppingCartText.isDisplayed());


    }

    @When("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {

        shoppingCartPage.proceedToCheckOutButton.click();

    }

    @Then("Verify that the delivery address and billing address are same")
    public void verify_that_the_delivery_address_and_billing_address_are_same() {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JSUtils.scrollIntoViewJS(shoppingCartPage.deliveryAddress);
        String deliveryAddress = shoppingCartPage.deliveryAddress.getText();
        String billingAddress = shoppingCartPage.billingAddress.getText();
        Assert.assertEquals(deliveryAddress, billingAddress);


    }

    @When("Click logout button")
    public void click_logout_button() {

        shoppingHomePage.logOutButton.click();

    }

    @Then("Verify that user logged out")
    public void verify_that_user_logged_out() {

        Assert.assertTrue(shoppingHomePage.signUpLogin.isDisplayed());

    }
}