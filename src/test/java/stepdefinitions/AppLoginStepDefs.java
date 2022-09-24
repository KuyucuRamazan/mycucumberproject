package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class AppLoginStepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @When("user navigate the login page")
    public void user_navigate_the_login_page() {
        //click on login button or use click method in the HomePage class
        // homePage.clickLoginLink();
        homePage.homeLoginButton.click();
    }

    @When("user enters {string} and {string} then click on login button")
    public void user_enters_and_then_click_on_login_button(String username, String password) {
        //Sending username
        loginPage.username.sendKeys(username);
        //sending password
        loginPage.password.sendKeys(password);
        //clicking on the login button
        loginPage.loginButton.click();

    }

    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        //If userID is displayed, then login is successful
        Assert.assertTrue(homePage.userID.isDisplayed());

    }

    @When("user enters username and password")
    public void user_enters_username_and_password(DataTable credentials) {

        //1. get the feature file data as List
//       List<String > customerData =  credentials.row(1);//row number starts at 0. Our data is in row 1.
//        System.out.println("UserName: "+customerData.get(0));
//        System.out.println("Password: "+customerData.get(1));
//        loginPage.username.sendKeys(customerData.get(0));
//        loginPage.password.sendKeys(customerData.get(1));
//        loginPage.loginButton.click();

        //2. get the feature file data as List<Map<String, String>>
        List<Map<String, String>> customerData = credentials.asMaps(String.class, String.class);
        System.out.println(customerData);

        for (Map<String, String> w : customerData) {

            loginPage.username.sendKeys(w.get("username"));
            loginPage.password.sendKeys(w.get("password"));
            loginPage.loginButton.click();

        }

    }


}