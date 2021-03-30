package com.saucelabs.base;

import com.saucelabs.pages.*;

public class PageManager {

    public static LoginPage loginPage;
    public static ItemPage itemPage;
    public static CheckoutStepOne checkoutStepOne;
    public static CheckoutStepTwo checkoutStepTwo;
    public static CheckoutStepThree checkoutStepThree;
    public static HomePage homePage;

    public static void initialize() {
        loginPage = new LoginPage();
        itemPage = new ItemPage();
        checkoutStepOne = new CheckoutStepOne();
        checkoutStepTwo = new CheckoutStepTwo();
        checkoutStepThree = new CheckoutStepThree();
        homePage = new HomePage();
    }

}
