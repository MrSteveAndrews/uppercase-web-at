# uppercase-web-at
Tests the uppercase web ui

To run tests:

     mvn test -Duoppercase.web.url=<uppercase.web.url>

Where <uppercase.web.host> = the host URL of the service endpoint.  Examples:

* If the web app URL is http://localhost:8080/uppercase-web, <uppercase.web.url> = http://localhost:8080
* If the web app URL is http://test.strings.blue-agility.com/uppercase-web, <uppercase.web.url> = http://test.strings.blue-agility.com

Open uppercase-web-at/target/site/cucumber-pretty/index.html to view the test results