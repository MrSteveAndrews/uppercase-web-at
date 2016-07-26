Feature: Transform string values to upper case using the web UI

  Scenario: Transform lower case strings to upper case
    Given the user is on the upper case page
    When the value "abc" is entered into the input string field
    And the convert button is selected
    Then the resulting output string is "ABC"

    Given the user is on the upper case page
    When the value "def" is entered into the input string field
    And the convert button is selected
    Then the resulting output string is "DEF"

  Scenario: Transform upper case strings to upper case
    Given the user is on the upper case page
    When the value "GHI" is entered into the input string field
    And the convert button is selected
    Then the resulting output string is "GHI"

    Given the user is on the upper case page
    When the value "JKL" is entered into the input string field
    And the convert button is selected
    Then the resulting output string is "JKL"