package com.saucelabs.stepdefinitions;

import com.saucelabs.base.ConfigReader;
import com.saucelabs.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Checkout_SD {

    @Given("user is actually successfully login")
    public void verifyUserLoggedIn(){
        LoginPage.enterUsername(ConfigReader.getProperty("username"));
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
        LoginPage.clickLoginBtn();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedURL,LoginPage.verifyURL());
    }

    @When("I click on item with name {string}")
    public void clickOnTheItem(String itemName){
        HomePage.clickItem(itemName);
    }

    @And("I click on the ADD TO CART button")
    public void clickonAddCart(){
        ItemPage.clickAddToCart();
    }

    @And("I click on the SHOPPING CART button")
    public void clickonShoopingCart(){
        ItemPage.clickToShoppingCart();
    }
    @And("I click on the CHECKOUT button")
    public void clickonCheckout(){
        CheckoutStepOne.clickOnCheckout();
    }
    @And("I enter the information as {string}, {string}, and {string}")
    public void enterInfo(String firstName, String lastName, String zipcode){
        CheckoutStepTwo.sendOrderInformation(firstName, lastName, zipcode);
    }
    @And("I click on continue button")
    public void clickonContinue(){
        CheckoutStepTwo.clickContinue();
    }

    @Then("Item name matches that of {string}")
    public void verify_name_matches(String item){
        Assert.assertTrue(CheckoutStepThree.verifyItem(item));
    }

}
