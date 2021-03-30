package com.saucelabs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = {"pretty", "html:target/site/cucumber-pretty.html",
                "json:target/cucumber-html-reports/cucumber.json",
                "junit:target/cucumber-xml-reports/cucumber.xml"},

        features = {"src\\test\\resources\\features"},
        glue = {"com\\saucelabs\\stepdefinitions"},
        tags = "@login",

        // Changes the console output and if value is true,
        // console output is going to look more simple
        monochrome = true,

        // dryRun checks if the steps are defined or not
        dryRun = true
)

public class TestRunner {

}
