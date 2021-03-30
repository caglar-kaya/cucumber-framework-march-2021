package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.saucelabs.base.BasePage.driver;

import java.util.List;

public class HomePage {

    // Locators
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public static List<WebElement> itemlist;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    // Actions
    public static void clickItem(String itemName) {
        for (WebElement item : itemlist) {
            if (item.getText().equals(itemName)) {
                HelperMethods.doClick(item);
                break;
            }
        }
    }



}
