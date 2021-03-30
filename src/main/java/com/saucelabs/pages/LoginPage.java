package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.saucelabs.base.BasePage.driver;

public class LoginPage {

    @FindBy(id = "user-name")
    public static WebElement username;

    @FindBy(id = "password")
    public static WebElement password;

    @FindBy(id = "login-button")
    public static WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    public static WebElement errorMessage;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public static String verifyTitle() {
        return HelperMethods.doGetPageTitle();
    }

    public static void enterUsername(String user) {
        HelperMethods.sendText(username, user);
    }

    public static void enterPassword(String pass) {
        HelperMethods.sendText(password, pass);
    }

    public static void clickLoginBtn() {
        HelperMethods.doClick(loginBtn);
    }

    public static String verifyURL() {
        return HelperMethods.doGetCurrentURL();
    }

    public static Boolean verifyErrorMessage() {
        return HelperMethods.doIsDisplayed(errorMessage);
    }

}
