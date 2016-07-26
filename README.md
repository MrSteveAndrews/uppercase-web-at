# uppercase-web-at
Tests the uppercase web ui

To build and run tests, execute:

     mvn test -Duppercase.web.url=http://localhost:8080

* uppercase.web.url should be the base URL of the upper case web app instance to test
* Open uppercase-web-at/target/site/cucumber-pretty/index.html to view the test results