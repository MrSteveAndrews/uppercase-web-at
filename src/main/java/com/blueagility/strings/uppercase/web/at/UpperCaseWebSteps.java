package com.blueagility.strings.uppercase.web.at;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

import static junit.framework.TestCase.assertEquals;

/**
 * Automates the UpperCaseWeb feature steps
 */
public class UpperCaseWebSteps {

    private static UpperCasePage upperCasePage = null;

    @Before
    public void before() {
        File file = new File("/Applications/Firefox.app/Contents/MacOS/firefox");
        FirefoxBinary firefoxBinary = new FirefoxBinary(file);
        FirefoxProfile firefoxProfile = new FirefoxProfile();

        WebDriver webDriver = new FirefoxDriver(firefoxBinary, firefoxProfile);

        upperCasePage = UpperCasePage.upperCasePage(webDriver);
    }

    @Given("^the user is on the upper case page$")
    public void the_user_is_on_the_upper_case_page() {
        upperCasePage.navigateTo();
    }

    @When("^the value \"([^\"]*)\" is entered into the input string field$")
    public void the_value_is_entered_into_the_imput_string_field(String inputValue) {
        upperCasePage.setInputString(inputValue);
    }

    @When("^the convert button is selected$")
    public void the_convert_button_is_selected() {
        upperCasePage.convert();
    }

    @Then("^the resulting output string is \"([^\"]*)\"$")
    public void the_resulting_output_string_is(String expectedOutputString) {
        String outputString = upperCasePage.getOutputString();
        assertEquals(expectedOutputString, outputString);
    }

    @After
    public void after() {
        upperCasePage.close();
    }
}
