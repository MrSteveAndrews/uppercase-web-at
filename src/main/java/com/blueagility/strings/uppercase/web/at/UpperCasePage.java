package com.blueagility.strings.uppercase.web.at;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Access elements on the upper case page
 */
public class UpperCasePage {

    private static final String UPPER_CASE_PAGE = "/upperCase";
    private static String url = null;

    private WebDriver webDriver = null;

    @FindBy(how = How.ID, using = "inputString")
    private WebElement inputString;

    @FindBy(how = How.ID, using = "convertButton")
    private WebElement convertButton;

    @FindBy(how = How.ID, using = "outputString")
    private WebElement outputString;

    /**
     * Use a web driver to instantiate an upper case page
     * @param webDriver
     * @return
     */
    public static UpperCasePage upperCasePage(WebDriver webDriver) {
        webDriver.get(url());
        UpperCasePage upperCasePage = PageFactory.initElements(webDriver, UpperCasePage.class);
        upperCasePage.setWebDriver(webDriver);
        return upperCasePage;
    }

    /**
     * Set the backing web driver for the page
     * @param webDriver
     */
    private void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    /**
     * Get the URL for the page.  Injected into the process to enable idempotent execution
     * @return
     */
    private static String url() {
        if(StringUtils.isEmpty(url)) {
            url = System.getProperty("uppercase.web.url");
            if(StringUtils.isEmpty(url)) {
                throw new IllegalStateException("Missing system property: uppercase.web.url");
            }
            url += UPPER_CASE_PAGE;
        }

        return url;
    }

    /**
     * Navigate to the upper case page
     */
    public void navigateTo() {
        webDriver.get(url());
    }

    /**
     * Set the text value of the input string field
     * @param value
     */
    public void setInputString(String value) {
        inputString.sendKeys(value);
    }

    /**
     * Click the convert button
     */
    public void convert() {
        convertButton.click();
    }

    /**
     * Get the text value of the output string field
     * @return
     */
    public String getOutputString() {
        return outputString.getText();
    }

    /**
     * Close the page
     */
    public void close() {
        webDriver.close();
    }
}
