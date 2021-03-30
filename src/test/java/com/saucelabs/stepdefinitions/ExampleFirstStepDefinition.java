package com.saucelabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleFirstStepDefinition {

    @Given("This is Given {int}")
    public void method1(int integer) {
        System.out.println("This is Given method1 " + integer);
    }

    @When("This is {string}")
    public void method2(String text) {
        System.out.println("This is When method2 : " + text);
    }

    @Then("^This is Then$")
    public void method3() {
        System.out.println("This is Then method3");
    }
}
