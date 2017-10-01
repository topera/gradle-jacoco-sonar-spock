# Topera's Hello World #008
## Code coverage in SonarClould using JaCoCo (Groovy/Spock version)
This hello world is a small program that uses JaCoCo to generate code coverage.
The coverage results can be automatically interpreted by SonarCloud.

The tests here are written in Groovy with Spock.

Generating report locally:
* $ cd gradle-jacoco-sonar-spock
* $ gradle jacocoTestReport
* The code coverage report is generated in ./build/reports/jacoco/test/html/index.html

Test with SonarCloud
* Edit 'organization' in gradle.properties
* Create a token in SonarCloud (https://sonarcloud.io/account/security/) and use the token in command below
* $ gradle sonarqube -Dsonar.login=a72955e0d........
* Your source code will be sent to SonarCloud and in few seconds you can check the result in
    * https://sonarcloud.io/organizations/topera-github // replace 'topera-github' here with your organization name

Tech Stack
* IntelliJ IDEA 2016.1.4
* Gradle 4.0
* Spock 1.1
* Groovy 2.4.12

To take a look in other tutorials, please see https://github.com/topera/hello-world-index
