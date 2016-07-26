package com.blueagility.strings.uppercase.web.at;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Runs the uppercase service functional acceptance tests
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json", "html:target/site/cucumber-pretty"}, features= {"classpath:features"}, glue = {"com.blueagility.strings.uppercase.web.at"})
public class UpperCaseWebAcceptanceTest {
}
